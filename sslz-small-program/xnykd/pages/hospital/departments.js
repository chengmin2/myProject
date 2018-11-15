Page({

    data: {
        deps: ['内一科', '内二科', '内三科', '外一科', '眼科', '口腔科', '儿科', '妇产科', '急诊外科', '急诊医学部科', '重症医学科', '耳鼻喉科简介', '神经科', '泌尿外科']
    },
    toDoctor: function (e) {
        var id = e.currentTarget.dataset.id;
        wx.navigateTo({
            url: '../hospital/doctor?id=' + id,
        })
    }
})