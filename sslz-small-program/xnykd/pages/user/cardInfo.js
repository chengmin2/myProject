// pages/user/cardInfo.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
        patientInfo: {
            userAvatarUrl: '../../resources/icon/man.png',
            patientName: '赵何明',
            gender: '男',
            healthCardNo: '510132456',
            birthday: '1996-01-13',
            idCardNo: '56358746627865298',
            phone: 18281509805,
            isDefault: 0
        },
    },
    //设为默认
    setDefault: function () {
        wx.navigateBack();
    },
    //解除绑定
    unBinding: function () {
        wx.showModal({
            title: '警告',
            content: '您确认要解除绑定吗?',
            success: function (res) {
                if (res.confirm) {
                    // wx.showLoading({
                    //   title: '正在解绑..',
                    //   mask: true
                    // });
                    wx.showModal({
                        title: '解绑成功',
                        content: '稍后您还可以重新添加',
                        showCancel: false,
                        success: function (res) {
                            wx.navigateBack();
                        }
                    });
                    // Util.req({
                    //   url: "miniapp/pat/unBinding",
                    //   data: { uid: _that.data.patientInfo.uid, isDefault: _that.data.patientInfo.isDefault },
                    //   success: function (res) {
                    //     wx.hideLoading();
                    //     var result = res.data;
                    //     if (result.code == 0) {
                    //       Util.loadPatList({ flush: true });
                    //       wx.showModal({
                    //         title: '解绑成功',
                    //         content: '稍后您还可以重新添加',
                    //         showCancel: false,
                    //         success: function (res) {
                    //           wx.navigateBack();
                    //         }
                    //       });
                    //     }
                    //   }
                    // });
                }
            }
        });
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