var amapFile = require('../../lib/amap-wx.js');
var markersData = {
  latitude: '', //纬度
  longitude: '', //经度
  key: "041b383d7c7600698b06f3a8eb025fc6" //申请的高德地图key
};
Page({
  data: {
    imgUrls: ['../../resources/icon/banner1.jpg',
      '../../resources/icon/banner2.jpg',
      '../../resources/icon/banner3.jpg'
    ],
    indicatorDots: true, //是否出现焦点
    autoplay: true, //是否自动播放
    interval: 2000, //自动播放间隔时间
    duration: 500, //滑动动画时间
    city: '',//城市
    hospital_distance: '',//距离
    tabColor: ['rgb(90,91,91)', 'rgb(90,91,91)', 'rgb(90,91,91)'], //tab颜色
    hospitalList: [{
      hospital_id: 1,
      hospital_img: '../../resources/icon/1.jpg',
      hospital_name: '泸州医学院附属中医医院',
      hospital_address: '泸州',
      hospital_level: '三甲',
      hospital_yyl: '1000', //预约量
    }, {
      hospital_id: 2,
      hospital_name: '泸州医学院附属医院',
      hospital_img: '../../resources/icon/2.jpg',
      hospital_address: '泸州',
      hospital_level: '三甲',
      hospital_yyl: '900', //预约量
    }, {
      hospital_id: 3,
      hospital_name: '西南医科大学附属医院',
      hospital_img: '../../resources/icon/3.jpg',
      hospital_address: '泸州',
      hospital_level: '三甲',
      hospital_yyl: '888', //预约量
    }, {
      hospital_id: 4,
      hospital_name: '西南医科大学附属口腔医院',
      hospital_img: '../../resources/icon/4.jpg',
      hospital_address: '泸州',
      hospital_level: '三甲',
      hospital_yyl: '777', //预约量
    }, {
      hospital_id: 5,
      hospital_name: '泸州市人民医院',
      hospital_img: '../../resources/icon/5.jpg',
      hospital_address: '泸州',
      hospital_level: '三甲',
      hospital_yyl: '666', //预约量
    }],
  },

  onLoad: function (options) {
    this.loadInfo();

  },
  onShow: function () {
    var _city = wx.getStorageSync('city');
    this.setData({
      city: _city
    })
  },
  //获取当前位置的经纬度
  loadInfo: function () {
    var that = this;
    wx.getLocation({
      type: 'gcj02', //返回可以用于wx.openLocation的经纬度
      success: function (res) {
        var latitude = res.latitude //维度
        var longitude = res.longitude //经度
        console.log(res);
        that.loadCity(latitude, longitude);
        that.distance(latitude, longitude, 39.928722, 116.393853);
      }
    })
  },
  //把当前位置的经纬度传给高德地图，调用高德API获取当前地理位置，天气情况等信息
  loadCity: function (latitude, longitude) {
    var that = this;
    var myAmapFun = new amapFile.AMapWX({
      key: markersData.key
    });
    myAmapFun.getRegeo({
      location: '' + longitude + ',' + latitude + '', //location的格式为'经度,纬度'
      success: function (data) {
        console.log(data);
        wx.setStorageSync('city', data[0].regeocodeData.addressComponent.city);
        that.setData({
          city: data[0].regeocodeData.addressComponent.city
        });
      },
      fail: function (info) {
      }
    });
  },
  //计算两点之间距离
  distance: function (la1, lo1, la2, lo2) {
    var La1 = la1 * Math.PI / 180.0;
    var La2 = la2 * Math.PI / 180.0;
    var La3 = La1 - La2;
    var Lb3 = lo1 * Math.PI / 180.0 - lo2 * Math.PI / 180.0;
    var s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(La3 / 2), 2) + Math.cos(La1) * Math.cos(La2) * Math.pow(Math.sin(Lb3 / 2), 2)));
    s = (s * 6378.137) / 1000;
    console.log("计算结果", s)
    this.setData({
      hospital_distance: s.toFixed(2)
    });
  },
  //选择城市
  switchCity: function () {
    wx.navigateTo({
      url: '../switchcity/switchcity',
    })
  },
  // 切换tab
  changeTab: function (e) {
    var tabColor = [];
    var index = e.currentTarget.dataset.index;
    for (var i = 0; i < 3; i++) {
      if (index == i) {
        tabColor[i] = 'rgb(33,184,99)'
      }
      this.setData({
        tabColor: tabColor
      })
    }
  },
  //医院介绍
  hospital_desc: function () {
    wx.navigateTo({
      url: '../hospital/hospital_desc',
    })
  },
  //医院科室
  departments: function () {
    wx.navigateTo({
      url: '../hospital/departments',
    })
  }
});