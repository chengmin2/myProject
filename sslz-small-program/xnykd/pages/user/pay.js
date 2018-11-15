// pages/user/pay.js
Page({

    data: {
        args: {
            fee: 1,             // 支付金额，单位为分
            customArgument: 'A' // 将传递到功能页函数的自定义参数
        }
    },
    methods: {
        // 支付成功的回调接口
        paymentSuccess: function (e) {
            console.log(e);
        },
        // 支付失败的回调接口
        paymentFailed: function (e) {
            console.log(e);
        }
    }
})