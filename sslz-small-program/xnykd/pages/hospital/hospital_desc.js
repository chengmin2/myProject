// pages/hospital/desc.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    hospital: {
      id: 1,
      img: '../../resources/icon/1.jpg',
      name: '泸州医学院附属中医医院',
      level: '三级甲等',
      yyl: '1000',
      desc: '医院设有皮肤内科、皮肤外科、中医科、中西医结合科、银屑病门诊、白癜风门诊、性病科、激光美容科、医学美容科、康复理疗科、预防保健科等专业化特色诊疗科室及皮肤病理实验室、性病实验室等多个精微化科研实验室。是集临床、科研、教学、预防为一体的现代化皮肤病专业医院。',
      doctor: [{ doctorId: '1', headPortrait: '../../resources/icon/doctor.jpg' },
      { doctorId: '2', headPortrait: '../../resources/icon/doctor.jpg' },
      { doctorId: '3', headPortrait: '../../resources/icon/doctor.jpg' },
      { doctorId: '4', headPortrait: '../../resources/icon/doctor.jpg' }]
    },
    isFolded: true,
  },
  //下拉展开
  change: function (e) {
    this.setData({
      isFolded: !this.data.isFolded,
    })
  },
  //医生信息
  doctorInfo:function(e){
    var doctorId = e.currentTarget.dataset.id;
    console.log('医生id'+doctorId)
    wx.navigateTo({
      url: 'doctorInfo?doctorId='+doctorId,
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})