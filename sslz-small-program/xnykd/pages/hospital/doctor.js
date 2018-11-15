Page({
    data: {
        doctorList: [{
            doctor_id: 1,
            doctor_img: '../../resources/icon/1.jpg',
            doctor_name: '小明',
            doctor_title: '主治医师',
            doctor_goodAt: '牙体病、牙体美容、牙髓病、根尖周病、粘膜病',
            doctor_yyl: '1000', //预约量
        }, {
            doctor_id: 2,
            doctor_name: '小红',
            doctor_img: '../../resources/icon/2.jpg',
            doctor_title: '主治医师',
            doctor_goodAt: '牙体病、牙体美容、牙髓病、根尖周病、粘膜病',
            doctor_yyl: '900', //预约量
        }, {
            doctor_id: 3,
            doctor_name: '小青',
            doctor_img: '../../resources/icon/3.jpg',
            doctor_title: '主治医师',
            doctor_goodAt: '牙体病、牙体美容、牙髓病、根尖周病、粘膜病',
            doctor_yyl: '888', //预约量
        }],
        buttonDisabled: false,
        modalHidden: true,
        show: false,
        tabTitle: ['按专家预约', '按日期预约'],
         tabColor: ["#21B863", "white"],
        nowTab: 0,
        //日期数组
        timeList: [],
        // 选择日期
        chooseTime: "",
    },

    //切换tab
    changeTab: function (e) {
        var index = e.currentTarget.dataset.index;
        var tabColor = this.data.tabColor;
        for (var i = 0; i < tabColor.length; i++) {
            if (i == index) {
              tabColor[i] = '#21B863';
            } else
                tabColor[i] = 'white';
        }
        this.setData({tabColor: tabColor, nowTab: index});
    },
    //预约
    showModal: function () {
        var login = wx.getStorageSync('login');
        console.log("登录状态" + login)
        if (login == '') {
            this.setData({
                modalHidden: !this.data.modalHidden
            })
        } else {
            wx.navigateTo({
                url: 'doctorInfo',
            })
        }
        // this.setData({
        //   modalHidden: !this.data.modalHidden
        // })
    },
    //获取验证码
    getCode: function () {

    },
    //模态框确定按钮
    modalBindaconfirm: function () {
        this.setData({
            modalHidden: !this.data.modalHidden,
            show: !this.data.show,
            buttonDisabled: !this.data.buttonDisabled
        })
        wx.setStorageSync('login', 1);
        wx.navigateTo({
            url: 'doctorInfo',
        })
    },
    //模态框取消按钮
    modalBindcancel: function () {
        this.setData({
            modalHidden: !this.data.modalHidden,
        })
    },
    // 日期选择
    timeClick: function (e) {
        this.setData({
            currentTab: e.currentTarget.dataset.index,
            chooseTime: this.data.timeList[e.currentTarget.dataset.index].date,
        });
        console.log(this.data.chooseTime)
    },
    /** 生命周期函数--监听页面加载*/
    onLoad: function (options) {
        Date.prototype.Format = function (format) {
            var o = {
                "M+": this.getMonth() + 1,  //month
                "d+": this.getDate(),     //day
                "h+": this.getHours(),    //hour
                "m+": this.getMinutes(),  //minute
                "s+": this.getSeconds(), //second
                "q+": Math.floor((this.getMonth() + 3) / 3),  //quarter
                "S": this.getMilliseconds() //millisecond
            }
            if (/(y+)/.test(format)) {
                format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
            }
            for (var k in o) {
                if (new RegExp("(" + k + ")").test(format)) {
                    format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
                }
            }
            return format;
        }
        Date.prototype.DateAdd = function (interval, number) {
            number = parseInt(number);
            var date = new Date(this.getTime());
            //
            switch (interval) {
                case "y":
                    date.setFullYear(this.getFullYear() + number);
                    break;
                case "m":
                    date.setMonth(this.getMonth() + number);
                    break;
                case "d":
                    date.setDate(this.getDate() + number);
                    break;
                case "w":
                    date.setDate(this.getDate() + 7 * number);
                    break;
                case "h":
                    date.setHours(this.getHours() + number);
                    break;
                case "n":
                    date.setMinutes(this.getMinutes() + number);
                    break;
                case "s":
                    date.setSeconds(this.getSeconds() + number);
                    break;
                case "l":
                    date.setMilliseconds(this.getMilliseconds() + number);
                    break;
            }
            return date;
        }
        var dateList = [];
        //7天
        var now = new Date();
        var day = now.getDay();
        //
        for (var i = 0; i < 7; i++) {
            var d = {};
            if (i == 0) {
                var w = "今天"
            }
            if (i == 1) {
                var w = "明天"
            }
            if (i == 2) {
                var w = "后天"
            }
            if (i == 3) {
                if (day == 1) {
                    var w = "周四"
                }
                if (day == 2) {
                    var w = "周五"
                }
                if (day == 3) {
                    var w = "周六"
                }
                if (day == 4) {
                    var w = "周日"
                }
                if (day == 5) {
                    var w = "周一"
                }
                if (day == 6) {
                    var w = "周二"
                }
                if (day == 7) {
                    var w = "周三"
                }
            }
            if (i == 4) {
                if (day == 1) {
                    var w = "周五"
                }
                if (day == 2) {
                    var w = "周六"
                }
                if (day == 3) {
                    var w = "周日"
                }
                if (day == 4) {
                    var w = "周一"
                }
                if (day == 5) {
                    var w = "周二"
                }
                if (day == 6) {
                    var w = "周三"
                }
                if (day == 7) {
                    var w = "周四"
                }
            }
            if (i == 5) {
                if (day == 1) {
                    var w = "周六"
                }
                if (day == 2) {
                    var w = "周日"
                }
                if (day == 3) {
                    var w = "周一"
                }
                if (day == 4) {
                    var w = "周二"
                }
                if (day == 5) {
                    var w = "周三"
                }
                if (day == 6) {
                    var w = "周四"
                }
                if (day == 7) {
                    var w = "周五"
                }
            }
            if (i == 6) {
                if (day == 1) {
                    var w = "周日"
                }
                if (day == 2) {
                    var w = "周一"
                }
                if (day == 3) {
                    var w = "周二"
                }
                if (day == 4) {
                    var w = "周三"
                }
                if (day == 5) {
                    var w = "周四"
                }
                if (day == 6) {
                    var w = "周五"
                }
                if (day == 7) {
                    var w = "周六"
                }
            }
            d.name = w;
            d.date = new Date().DateAdd('d', i).Format("MM-dd");
            dateList.push(d)
        }
        this.setData({
            timeList: dateList
        });
    },
})