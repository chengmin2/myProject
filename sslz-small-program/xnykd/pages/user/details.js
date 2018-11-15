// pages/user/orderInfo.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
        status: '',//状态
        buttonVaule: '',//按钮的值

    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
        var _status = options.status;
        console.log(_status);
        this.setData({status: _status});
        var _buttonVaule = '';
        if (_status == '未支付') {
            _buttonVaule = '去支付'
        }
        if (_status == '已预约') {
            _buttonVaule = '取消预约'
        }
        if (_status == '待评价') {
            _buttonVaule = '去评价'
        }
        this.setData({buttonVaule: _buttonVaule});

    },
    //提交
    submit: function () {
        var _type = this.data.buttonVaule;
        if (_type == '未支付') {
            wx.navigateTo({
                url: '',
            })
        }
        if (_type == '取消预约') {
            wx.showModal({
                title: '取消预约',
                content: '你确定要取消吗？',
                success: function (res) {
                    if (res.confirm) {
                        console.log('用户点击确定')
                        wx.showToast({
                            title: '操作成功',
                            icon: 'succes',
                            duration: 1000,
                            mask: true
                        })
                        wx.redirectTo({
                            url: 'registOrder',
                        })
                    }
                }
            })
        }
        if (_type == '去评价') {
            wx.navigateTo({
                url: 'evaluation',
            })
        }

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