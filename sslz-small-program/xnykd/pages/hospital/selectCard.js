// pages/hospital/selectCard.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
        inputValue: '',

    },
    //选择就诊卡
    cardList: function () {
        wx.navigateTo({
            url: 'cardList',
        })
    },
    //挂号
    guHao: function () {
        wx.navigateTo({
            url: '../user/caseInfo',
        })
    },
    //绑定新就诊卡
    createCard: function () {
        wx.navigateTo({
            url: '../user/createCard',
        })
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {

    },


})