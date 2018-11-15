Page({
    data: {
        patientList: [{
            id: 0,
            patientName: '赵何明',
            gender: '男',
            healthCardNo: 510524666
        },
            {
                id: 1,
                patientName: '程咬金',
                gender: '男',
                healthCardNo: 1234567
            }
        ],
    },
    // 获取该组件的id 
    radio: function (e) {
        var cardId = e.currentTarget.dataset.id;
        console.log(cardId)
    },
    // 获取用户选择的单选框的值 
    radioChange: function (e) {
        var healthCardNo = e.detail.value;
        console.log(healthCardNo)
    },
})