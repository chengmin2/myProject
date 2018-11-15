const app = getApp();
Page({
    data: {
        staticImg: app.globalData.staticImg,
        current: 0,
        attitude: true,
        time: true,
        efficiency: true,
        environment: true,
        professional: true,
        userStars: [
            "../../resources/icon/rwjx.png",
            "../../resources/icon/rwjx.png",
            "../../resources/icon/rwjx.png",
            "../../resources/icon/rwjx.png",
            "../../resources/icon/rwjx.png",
        ],
        wjxScore: 10,
        min: 5,//最少字数
        max: 200, //最多字数 (根据自己需求改变) 
    },
    // 星星点击事件
    starTap: function (e) {
        var that = this;
        var index = e.currentTarget.dataset.index; // 获取当前点击的是第几颗星星
        var tempUserStars = this.data.userStars; // 暂存星星数组
        var len = tempUserStars.length; // 获取星星数组的长度
        for (var i = 0; i < len; i++) {
            if (i <= index) { // 小于等于index的是满心
                tempUserStars[i] = "../../resources/icon/rwjx.png",
                    that.setData({
                        wjxScore: (i + 1) * 2,
                    })
            } else { // 其他是空心
                tempUserStars[i] = "../../resources/icon/filling.png"
            }
        }
        // 重新赋值就可以显示了
        that.setData({
            userStars: tempUserStars
        })
    },
    // 标签
    label: function (e) {
        var that = this;
        that.setData({
            attitude: !e.currentTarget.dataset.index
        })
    },
    label1: function (e) {
        var that = this;
        that.setData({
            time: !e.currentTarget.dataset.index
        })
    },
    label2: function (e) {
        var that = this;
        that.setData({
            efficiency: !e.currentTarget.dataset.index
        })
    },
    label3: function (e) {
        var that = this;
        that.setData({
            environment: !e.currentTarget.dataset.index
        })
    },
    label4: function (e) {
        var that = this;
        that.setData({
            professional: !e.currentTarget.dataset.index
        })
    },
    // 留言
    //字数限制  
    inputs: function (e) {
        // 获取输入框的内容
        var value = e.detail.value;
        console.log('评价' + value);
        // 获取输入框内容的长度
        var len = parseInt(value.length);
        //最多字数限制
        if (len > this.data.max) return;
        // 当输入框内容的长度大于最大长度限制（max)时，终止setData()的执行
        // this.setData({

        // });
    },
    //提交评价
    submit: function () {
        wx.showToast({
            title: '提交成功',
            icon: 'succes',
            duration: 1000,
            mask: true,
            success: function () {
                setTimeout(function () {
                    wx.switchTab({
                        url: 'user',
                    })
                }, 1000)
            }
        })
    },
    onLoad: function (options) {

    },

})