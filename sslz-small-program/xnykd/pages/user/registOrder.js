Page({
    data: {
        tabTitle: ['全部', '未支付', '已预约', '待评价'],
        tabColor: ['#2BD5D5', 'white', 'white', 'white'],
        isOrder: 'order',
        nowTab: 0,
        allOrder: [{
            time: '2018-9-22 上午',
            type: '未支付',
            headPortrait: '../../resources/icon/doctor.jpg',
            name: '华佗',
            departments: '耳鼻喉科',
            price: 13,
            hospital: '西南医科大',
            patient: '小明'
        },
            {
                time: '2018-9-22 上午',
                type: '已预约',
                headPortrait: '../../resources/icon/doctor.jpg',
                name: '华佗',
                departments: '耳鼻喉科',
                price: 13,
                hospital: '西南医科大',
                patient: '小明'
            },
            {
                time: '2018-9-22 上午',
                type: '待评价',
                headPortrait: '../../resources/icon/doctor.jpg',
                name: '华佗',
                departments: '耳鼻喉科',
                price: 13,
                hospital: '西南医科大',
                patient: '小明'
            },
            {
                time: '2018-9-22 上午',
                type: '未支付',
                headPortrait: '../../resources/icon/doctor.jpg',
                name: '华佗',
                departments: '耳鼻喉科',
                price: 13,
                hospital: '西南医科大',
                patient: '小明'
            },
        ],
        pendingPay: [], //未支付
        reserved: [], //已预约
        pendingEvaluation: [], //待评价
    },
    //切换tab
    changeTab: function (e) {
        if (e == 0 || e == 1 || e == 2 || e == 3) {
            var index = e
        } else
            var index = e.currentTarget.dataset.index;
        var tabColor = this.data.tabColor;
        for (var i = 0; i < tabColor.length; i++) {
            if (i == index)
                tabColor[i] = "#2BD5D5";
            else
                tabColor[i] = "#white";
        }
        this.setData({
            tabColor: tabColor,
            nowTab: index
        })
    },
    //跳转订单详情页
    toOrderInfo: function (e) {
        var status = e.currentTarget.dataset.type;
        wx.navigateTo({
            url: 'details?status=' + status,
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