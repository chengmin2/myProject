// pages/user/user.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
        tip: '',
        buttonDisabled: false,
        modalHidden: true,
        show: false,

    },
    //模态框确定按钮
    modalBindaconfirm: function () {
        this.setData({
            modalHidden: !this.data.modalHidden,
            show: !this.data.show,
            tip: '您点击了【确认】按钮！',
            buttonDisabled: !this.data.buttonDisabled
        })
        wx.setStorageSync('login', 1);
    },
    //模态框取消按钮
    modalBindcancel: function () {
        this.setData({
            modalHidden: !this.data.modalHidden,
            tip: '您点击了【取消】按钮！'
        })
    },

    //我的预约
    toRegistOrder: function () {
        wx.navigateTo({
            url: 'registOrder',
        })
    },
    //我的订单
    toOrder: function () {
        wx.navigateTo({
            url: 'order',
        })
    },
    //我的就诊卡
    medicalCard: function () {
        wx.navigateTo({
            url: 'medicalCard',
            healthCardNo: '546453213212'
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
        var login = wx.getStorageSync('login');
        console.log("登录状态" + login)
        if (login == '') {
            this.setData({
                modalHidden: !this.data.modalHidden
            })
        }

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