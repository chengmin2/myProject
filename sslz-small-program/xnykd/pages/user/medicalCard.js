Page({
    data: {
        patientList: [{
            isDefault: 0,
            patientName: '赵何明',
            gender: '男',
            healthCardNo: 510524666
        }


        ],

    },
    //添加就诊卡
    createCard: function () {
        wx.navigateTo({
            url: '/pages/user/createCard'
        })
    },
    //就诊卡详细信息
    cardInfo: function (e) {
        wx.navigateTo({
            url: '/pages/user/cardInfo?cardId=' + e.currentTarget.dataset.id
        })
    }
})