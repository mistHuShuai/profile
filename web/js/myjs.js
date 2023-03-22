$(document).ready(function () {
    $("#tijiao").click(function () {
        bh = $("#bha").val();
        xm = $("#xma").val();
        dh = $("#dha").val();
        $.post("aa/txl", {"bha": bh, "xma": xm, "dha": dh},
            function (data) {
                console.log(data)
                alert("Data Loaded: " + data.bt);
            });
    });

    function strToJson(str) {
        return JSON.parse(str);
    }
    $("#ok").click(function () {

        xx="[6,7.7,{bh:'a02',xm:['张三',{aa:'早晨',bb:'中午'}]}]"

        ee = eval(xx)
        alert(ee[2].xm[1].bb)
        yy="{bh:'a01',xm:['张三',{aa:'早晨',bb:{x1:99.9,x2:'错了'}}]}"

        a = eval("("+yy+")")
        alert(a.xm[1].bb.x2)

    });


});