Page({
    data: {
        doctorInfo: {
            headPortrait: '../../resources/icon/doctor.jpg',
            realName: '小明',
            title: '主治医师',
            hospital: '西南医科大',
            departments: '耳鼻喉科',
            yyl: '998',
            score: '9.7',
            goodAt: '有丰富的临床经验和技术专长，擅长于内科，尤其对急慢性肝炎、消化性溃疡、急慢性胆囊炎、胆石症、结肠炎、萎缩性胃炎等方面都具有独到之处。'
        },
        //预约时间
        scheduling: [{
            id: 1,
            time: '2018-9-21 周五 上午',
            price: '13.00',
        }, {
            id: 2,
            time: '2018-9-21 周五 下午',
            price: '13.00',
        }],
        modalHidden: true,
        show: false,
        isFolded: true,
    },
  //下拉展开
  change: function (e) {
    this.setData({
      isFolded: !this.data.isFolded,
    })
  },
    //预约
    showModal: function () {
        // this.setData({
        //   modalHidden: !this.data.modalHidden
        // })
        wx.navigateTo({
            url: 'selectCard',
        })
    },
    //模态框确定按钮
    modalConfirm: function () {
        this.setData({
            modalHidden: !this.data.modalHidden,
            // show: !this.data.show,
        })
        //患者填写资料
        wx.navigateTo({
            url: '../user/caseInfo',
        })
    },
    //模态框取消按钮
    modalCancel: function () {
        this.setData({
            modalHidden: !this.data.modalHidden,
        })
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
      var doctorId = options.doctorId;
      console.log('医生id'+doctorId);

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