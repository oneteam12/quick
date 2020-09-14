

$(document).ready(function() {



    var str0 ="河流选择：</br>流域选择：<select id='liuyu'></select>  水系选择： <select id='shuixi'></select>    干流选择：<select id='ganliu'></select>";
    $("#heliuxuanze").html(str0);

    var str = "一级河流选择：<select id='yiji'></select>二级河流选择：<select id='erji'></select>三级河流选择：<select id='sanji'></select>四级河流选择：<select id='siji'></select>五级河流选择：<select id='wuji'></select>";//三个下拉交给一个字符串
    $("#home").html(str);


    var str2=" 模拟设置：</br>排放数据选择：<select id='sjxz'></select>水文设计条件(环统数据年份选择)：<select id='shujunf'></select>计算年份（反查水文表年份设置）：<select id='jisuannf'></select>模拟指标：<select id='monizb'></select>"
    $("#monishezhi").html(str2);
    //将三个下拉的字符串交给前边的div

    liuyu();
    shuixi();
    ganliu();
    yiji();
    erji();
    sanji();
    siji();
    wuji();

    sjxz();
    shujunf();
    jisuannf();
    monizb();

    

    $("#liuyu").change(function(){
        shuixi();
        ganliu();
        yiji();
        erji();
        sanji();
        siji();
        wuji();
    });
    $("#shuixi").change(function(){
        ganliu();
        yiji();
        erji();
        sanji();
        siji();
        wuji();
    });
    $("#ganliu").change(function(){
        yiji();
        erji();
        sanji();
        siji();
        wuji();
    });
    $("#yiji").change(function(){
        erji();
        sanji();
        siji();
        wuji();
    });
    $("#erji").change(function(){
        sanji();
        siji();
        wuji();
    });
    $("#sanji").change(function(){
        siji();
        wuji();
    });
    $("#siji").change(function(){
        wuji();
    });

    $("#sjxz").change(function(){
        shujunf();
        jisuannf();
    });
    $("#shujunf").change(function(){
        jisuannf();
    });


    $("#inp1").keyup(function() {
        var uname = $(this).val();
        var reg = /^[\u4e00-\u9fa5]+$/;

//&&reg.test(uname)
        if(uname != ""&&reg.test(uname)){
            $("#lsn").show();
            $.ajax({
                url:"rest/mike/searchRiverName",
                type:"post",
                data:{"name":uname},
                dataType:"json",
                async:true,
                success:function(result){
                    var html="";
                    for(var i = 0;i < result.length ; i++){
                        html+="<li>"+result[i]+"</li>";
                    }

                    $("#lsn").html(html);
                    $("li").unbind("click").bind("click", function(){
                        $("#inp1").val($(this).html());
                        $("#inp1").focus();
                        $("#lsn").hide();
                    });
                }
            });

        }else{
            $("#lsn").html("");
            $("#lsn").hide();
        }
    });

});


function liuyu() {

    var pcode = "0001"; //找出省的父级代号
    $.ajax({
        async:false,//同步
        url:"rest/mike/selectLymc",
        data:{pcode:pcode},
        type:"POST",
        dataType:"json",
        success: function(data){
            var haha="<option value=\"0\" selected>==请选择==</option>";
            for (var i = 0; i < data.length; i++) {
                haha+="<option value='"+data[i]+"'>"+data[i]+"</option>";
            };
            $("#liuyu").html(haha);
        }
    });
};

function shuixi() {
    var pcode = $("#liuyu").val();
    $.ajax({
        async:false,
        url:"rest/mike/selectSxmc",
        data:{lymc:pcode},
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="<option value=\"0\" selected>==水系选择==</option>";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i]+"'>"+data[i]+"</option>";
            };
            $("#shuixi").html(html);

        }
    });
};

function ganliu() {
    var pcode = $("#shuixi").val();
    $.ajax({
        url:"rest/mike/selectGl",
        data:{sxmc:pcode},
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="<option value=\"0\" selected>==请选择==</option>";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i]+"'>"+data[i]+"</option>";
            };
            $("#ganliu").html(html);

        }
    });
};

function yiji() {

    var pcode2 = $("#ganliu").val();
    $.ajax({
        url:"rest/mike/select1jhl",
        data:{
            gl:pcode2
        },
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="<option value=\"0\" selected>==请选择==</option>";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i]+"'>"+data[i]+"</option>";
            };
            $("#yiji").html(html);

        }
    });
};
function erji() {

    var pcode2 = $("#yiji").val();
    $.ajax({
        url:"rest/mike/select2jhl",
        data:{
            yjhl:pcode2
        },
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="<option value=\"0\" selected>==请选择==</option>";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i]+"'>"+data[i]+"</option>";
            };
            $("#erji").html(html);

        }
    });
};
function sanji() {

    var pcode2 = $("#erji").val();
    $.ajax({
        url:"rest/mike/select3jhl",
        data:{
            ejhl:pcode2
        },
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="<option value=\"0\" selected>==请选择==</option>";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i]+"'>"+data[i]+"</option>";
            };
            $("#sanji").html(html);

        }
    });
};
function siji() {

    var pcode2 = $("#sanji").val();
    $.ajax({
        url:"rest/mike/select4jhl",
        data:{
            sanjhl:pcode2
        },
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="<option value=\"0\" selected>==请选择==</option>";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i]+"'>"+data[i]+"</option>";
            };
            $("#siji").html(html);

        }
    });
};
function wuji() {

    var pcode2 = $("#siji").val();//找区的父级代号，市选中项的值
    $.ajax({
        url:"rest/mike/select5jhl",
        data:{
            sijhl:pcode2
        },
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="<option value=\"0\" selected>==请选择==</option>";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i]+"'>"+data[i]+"</option>";
            };
            $("#wuji").html(html);

        }
    });
};

function sjxz(){
    var html="<option value=\"huantong\" selected>==请选择==</option>";

    html+="<option value=\"huantong\" >环统数据</option>";


    $("#sjxz").html(html);

}
function shujunf(){
    var html="<option value=\"0\" selected>==请选择==</option>";
    var pcode2 = $("#sjxz").val();

    $("#shujunf").html(html);
    var lyname = $("#liuyu").val();
    var hlname ="";
    if($("#liuyu").val()!=0 && $("#shuixi").val()!=0 && $("#ganliu").val()!=0 ){
        if($("#wuji").val()!=0 && $("#wuji").val()!=null &&$("#wuji").val()!=""){
            hlname =  $("#wuji").val();
            getshujunf(lyname,hlname,pcode2)
        }else if($("#siji").val()!=0 && $("#siji").val()!=null &&$("#siji").val()!=""){
            hlname = $("#siji").val();
            getshujunf(lyname,hlname,pcode2)
        }else if($("#sanji").val()!=0 && $("#sanji").val()!=null &&$("#sanji").val()!=""){
            hlname= $("#sanji").val();
            getshujunf(lyname,hlname,pcode2)
        }else if($("#erji").val()!=0  && $("#erji").val()!=null &&$("#erji").val()!="" ){
            hlname = $("#erji").val();
            getshujunf(lyname,hlname,pcode2)
        }else if($("#yiji").val()!=0  && $("#yiji").val()!=null &&$("#yiji").val()!=""){
            hlname= $("#yiji").val();
            getshujunf(lyname,hlname,pcode2)
        }else{
            alert("请选择河流");
        }

    }

    $("#shujunf").html(html);
}
function getshujunf(lyname,hlname,pcode2) {
    var html="<option value=\"0\" selected>==请选择==</option>";
    $.ajax({
        url:"rest/mike/getShujunf",
        data:{
            lyname:lyname,
            hlname:hlname,
            sj:pcode2
        },
        type:"POST",
        dataType:"json",
        success: function(data){

            if(data.length == 0){
                html+="<option value='"+99+"'>无企业数据（必须点选）</option>";
                $("#shujunf").html(html);
            }else{
                for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i].TJNF+"'>"+data[i].TJNF+"</option>";
                };
               $("#shujunf").html(html);
            }
        }
    });

}

function jisuannf() {
    var pcode2 = $("#shujunf").val();
    var lyname = $("#liuyu").val();
    var hlname="";

    var html = "<option value=\"0\" selected>==请选择==</option>";
    $("#jisuannf").html(html);

    if ($("#liuyu").val() != 0 && $("#shuixi").val() != 0 && $("#ganliu").val() != 0 && pcode2 !=0) {
        if ($("#wuji").val() != 0 && $("#wuji").val() != null && $("#wuji").val() != "") {
            hlname = $("#wuji").val();

        } else if ($("#siji").val() != 0 && $("#siji").val() != null && $("#siji").val() != "") {
            hlname = $("#siji").val();
            getjisuannf(lyname,hlname,pcode2)

        } else if ($("#sanji").val() != 0 && $("#sanji").val() != null && $("#sanji").val() != "") {
            hlname = $("#sanji").val();
            getjisuannf(lyname,hlname,pcode2)

        } else if ($("#erji").val() != 0 && $("#erji").val() != null && $("#erji").val() != "") {
            hlname = $("#erji").val();
            getjisuannf(lyname,hlname,pcode2)

        } else if ($("#yiji").val() != 0 && $("#yiji").val() != null && $("#yiji").val() != "") {
            hlname = $("#yiji").val();
            getjisuannf(lyname,hlname,pcode2)
        }
        $("#jisuannf").html(html);
    }

}
function getjisuannf(lyname,hlname,pcode2) {
    $.ajax({
        url: "rest/mike/getShuiwennf",
        data: {
            lyname: lyname,
            hlname: wuji,
            time: pcode2
        },
        type: "POST",
        dataType: "json",
        success: function (data) {
            var html = "<option value=\"0\" selected>==请选择==</option>";
            for (var i = 0; i < data.length; i++) {
                html += "<option value='" + data[i] + "'>" + data[i] + "</option>";
            }
            ;

            $("#jisuannf").html(html);
        }
    });
}
function monizb(){
    var html="<option value=\"0\" selected>==请选择==</option>";

    html+="<option value=\"COD\" >COD</option>";
    html+="<option value=\"ANDAN\" >氨氮</option>";
    html+="<option value=\"ZONGLIN\" >总磷</option>";

    $("#monizb").html(html);

}
$("#sts").click(function() {
    var pcode2 = $("#shujunf").val();
    var lyname = $("#liuyu").val();
    var hlswtime= $("#jisuannf").val();
    var name =$("#inp12").val();
    var shujuly=$("#sjxz").val();
    var shuixi=$("#shuixi").val();
    var ganliu=$("#ganliu").val();

    var hlname="";

        if($("#wuji").val()!=0 && $("#wuji").val()!=null &&$("#wuji").val()!=""){
            hlname = $("#wuji").val();
        }else if($("#siji").val()!=0 && $("#siji").val()!=null &&$("#siji").val()!=""){
            hlname = $("#siji").val();

        }else if($("#sanji").val()!=0 && $("#sanji").val()!=null &&$("#sanji").val()!=""){
            hlname = $("#sanji").val();

        }else if($("#erji").val()!=0  && $("#erji").val()!=null &&$("#erji").val()!="" ){
            hlname = $("#erji").val();

        }else if($("#yiji").val()!=0  && $("#yiji").val()!=null &&$("#yiji").val()!=""){
            hlname = $("#yiji").val();

        }
        var yiji= $("#yiji").val();
        var erji= $("#erji").val();
        var sanji= $("#sanji").val();
        var siji= $("#siji").val();
        var wuji= $("#wuji").val();

    $.ajax({
        url: "rest/mike/startmoni",
        data: {
            lyname: lyname,
            hlname: hlname,
            hlswtime:hlswtime,
            time: pcode2,
            name:name,
            yiji:yiji,
            erji:erji,
            sanji:sanji,
            siji:siji,
            wuji:wuji,
            shujuly:shujuly,
            shuixi:shuixi,
            ganliu:ganliu
        },
        type: "POST",
        dataType: "json",
        success: function (data) {
          alert("生成成功");
        }
    })
});
$("#startmoni").click(function(){
    var html="";
    var monizb = $("#monizb").val();
    var name =$("#inp12").val();
    if(monizb!= 0){
        var pcode2 = $("#shujunf").val();
        var lyname = $("#liuyu").val();
        if ($("#liuyu").val() != 0 && $("#shuixi").val() != 0 && $("#ganliu").val() != 0 && pcode2 !=0) {
            if ($("#wuji").val() != 0) {
                var wuji = $("#wuji").val();
                get(lyname,wuji,pcode2,monizb);
                gettwo(lyname,wuji,pcode2,monizb);
                showMap(lyname,wuji,pcode2);
                test(lyname,wuji,pcode2);
            } else if ($("#siji").val() != 0 && $("#siji").val() != null && $("#siji").val() != "") {
                var siji = $("#siji").val();
                get(lyname,siji,pcode2,monizb);
                gettwo(lyname,siji,pcode2,monizb);
                showMap(lyname,siji,pcode2);
                test(lyname,siji,pcode2);
            } else if ($("#sanji").val() != 0 ) {
                var sanji = $("#sanji").val();
                get(lyname,sanji,pcode2,monizb);
                gettwo(lyname,sanji,pcode2,monizb);
                showMap(lyname,sanji,pcode2);
                test(lyname,sanji,pcode2);
            } else if ($("#erji").val() != 0 ) {
                var erji = $("#erji").val();
                get(lyname,erji,pcode2,monizb);
                gettwo(lyname,erji,pcode2,monizb);
                showMap(lyname,erji,pcode2);
                test(lyname,erji,pcode2);
            } else if ($("#yiji").val() != 0 ) {
                var yiji = $("#yiji").val();
                 name = $("#inp12").val();
                 alert(name);
                get(lyname,yiji,pcode2,monizb);
                gettwo(lyname,yiji,pcode2,monizb);
                showMap(lyname,yiji,pcode2);
                test(lyname,yiji,pcode2);
            }else{
                alert("请选择河流");
            }

        }else{
            alert("请选择流域水系");
        }
    }else{
        alert("请选择模拟指标");
    }

    $('#tab1').fixedHeaderTable({ footer: true, altClass: 'odd' });
    $('#tab2').fixedHeaderTable({ footer: true, altClass: 'odd' });



});
function  test(lyname,hlname,pcode2) {
    $.ajax({
        url: "rest/mike/test",
        data: {
            lyname: lyname,
            hlname: hlname,
            time: pcode2,
        },
        type: "POST",
        dataType: "json",
        success: function (data) {
            if(data.h== "1"){

            alert("已有当前条件模拟,请点击结果直接查看");
            }else{
                $("#sts").show();
                $("#inp12").show();
                alert("当前条件并没有模拟结果，请点击开始模拟");
            }
        }
    })
}
function  get(lyname,hlname,pcode2,monizb){
    $.ajax({
        url: "rest/mike/getQiye",
        data: {
            lyname: lyname,
            hlname: hlname,
            time: pcode2,
            monizb:monizb
        },
        type: "POST",
        dataType: "json",
        success: function (data) {

            if(monizb == "COD"){
                var hhh="  <table id=\"tab1\"  class=\"fancyTable\">\n" +
                    "        <thead style=\"width: 400px;height: 20px;\" >\n" +
                    "        <tr id=\"tr1\">\n" +
                    "            <th>企业名称</th>\n" +
                    "            <th>详细地址县(区、市、旗)</th>\n" +
                    "            <th>详细地址乡(镇)</th>\n" +
                    "            <th>经度</th>\n" +
                    "            <th>纬度</th>\n" +
                    "            <th>生产时间（小时/年）</th>\n" +
                    "            <th>废水排放量（吨/年）</th>\n" +
                    "       <th>COD排放浓度（毫克/升）</th><th>COD排放量（吨/年）</th> </tr>\n" +
                    "        </thead><tbody  style=\"width: 400px;height: 180px;\">"
                alert("COD");
                for (var i = 0; i < data.length; i++) {
                    hhh += "<tr><td>"+data[i].TBDWXXMC+"</td>";
                    hhh += "<td>"+data[i].XXDZX_Q_S_Q +"</td>";
                    hhh += "<td>"+data[i].XXDZX_Z+"</td>";
                    hhh += "<td>"+data[i].JD_G +"</td>";
                    hhh += "<td>"+data[i].WD_G+"</td>";
                    hhh += "<td>"+data[i].NZCSCSJ_XS +"</td>";
                    hhh += "<td>"+data[i].GYFSPFL_D +"</td>";
                    hhh += "<td>"+data[i].PRWSCLCDHXXYLND_HK_S +"</td>";
                    hhh += "<td>"+data[i].HXXYLPFL_D +"</td></tr>";
                }
                hhh += "</tbody>";
                $("#downin").html(hhh);
            }else if(monizb == "ANDAN"){
                var hhh="  <table id=\"tab1\"  class=\"fancyTable\" >\n" +
                    "        <thead style=\"width: 400px;height: 20px;\" >\n" +
                    "        <tr id=\"tr1\">\n" +
                    "            <th>企业名称</th>\n" +
                    "            <th>详细地址县(区、市、旗)</th>\n" +
                    "            <th>详细地址乡(镇)</th>\n" +
                    "            <th>经度</th>\n" +
                    "            <th>纬度</th>\n" +
                    "            <th>生产时间（小时/年）</th>\n" +
                    "            <th>废水排放量（吨/年）</th>\n" +
                    "        <th>氨氮排放浓度（毫克/升）</th><th>氨氮排放量（吨/年）</th></tr>\n" +
                    "        </thead><tbody  style=\"width: 400px;height: 180px;\">"

                alert("ANDAN");

                for (var i = 0; i < data.length; i++) {
                    hhh += "<tr><td>"+data[i].TBDWXXMC+"</td>";
                    hhh += "<td>"+data[i].XXDZX_Q_S_Q +"</td>";
                    hhh += "<td>"+data[i].XXDZX_Z+"</td>";
                    hhh += "<td>"+data[i].JD_G +"</td>";
                    hhh += "<td>"+data[i].WD_G+"</td>";
                    hhh += "<td>"+data[i].NZCSCSJ_XS +"</td>";
                    hhh += "<td>"+data[i].GYFSPFL_D +"</td>";
                    hhh += "<td>"+data[i].PRWSCLCDADND_HK_S +"</td>";
                    hhh += "<td>"+data[i].ADPFL_D +"</td></tr>";
                }
                hhh += "</tbody>";
                $("#downin").html(hhh);
            }else{
                var hhh="  <table id=\"tab1\" >\n" +
                    "        <thead style=\"width: 400px;height: 20px;\"  class=\"fancyTable\" >\n" +
                    "        <tr id=\"tr1\">\n" +
                    "            <th>企业名称</th>\n" +
                    "            <th>详细地址县(区、市、旗)</th>\n" +
                    "            <th>详细地址乡(镇)</th>\n" +
                    "            <th>经度</th>\n" +
                    "            <th>纬度</th>\n" +
                    "            <th>生产时间（小时/年）</th>\n" +
                    "            <th>废水排放量（吨/年）</th>\n" +
                    "        <th>总磷排放浓度（毫克/升）</th><th>总磷排放量（吨/年）</th></tr>\n" +
                    "        </thead><tbody  style=\"width: 400px;height: 180px;\">"

                alert("ZONGP");
                for (var i = 0; i < data.length; i++) {
                    hhh += "<tr><td>"+data[i].TBDWXXMC+"</td>";
                    hhh += "<td>"+data[i].XXDZX_Q_S_Q +"</td>";
                    hhh += "<td>"+data[i].XXDZX_Z+"</td>";
                    hhh += "<td>"+data[i].JD_G +"</td>";
                    hhh += "<td>"+data[i].WD_G+"</td>";
                    hhh += "<td>"+data[i].NZCSCSJ_XS +"</td>";
                    hhh += "<td>"+data[i].GYFSPFL_D +"</td>";
                    hhh += "<td>"+data[i].ZPCSL_D +"</td>";
                    hhh += "<td>"+data[i].ZPPFL_D +"</td></tr>";
                }
                hhh += "</tbody>";
                $('#tab1').fixedHeaderTable({ footer: true, altClass: 'odd' });
                $("#downin").html(hhh);
            }
        }
    });
};
function  gettwo(lyname,hlname,pcode2,monizb){
    $.ajax({
        url: "rest/mike/getWsc",
        data: {
            lyname: lyname,
            hlname: hlname,
            time: pcode2,
            monizb:monizb
        },
        type: "POST",
        dataType: "json",
        success: function (data) {

            if (monizb == "COD") {
                var qqq = "  <table id=\"tab2\"  class=\"fancyTable\">\n" +
                    "        <thead style=\"width: 400px;height: 20px;\" >\n" +
                    "        <tr id=\"tr2\">\n" +
                    "            <th>污水厂名称</th>\n" +
                    "            <th>详细地址县(区、市、旗)</th>\n" +
                    "            <th>详细地址乡(镇)</th>\n" +
                    "            <th>经度</th>\n" +
                    "            <th>纬度</th>\n" +
                    "            <th>生产时间（天/年）</th>\n" +
                    "            <th>污水处理级别</th>\n" +
                    "            <th>设计处理能力（吨/日）</th>\n" +
                    "            <th>废水实际处理量（万吨/年）</th>\n" +
                    "       <th>COD出口浓度（毫克/升）</th><th>COD排放量（万吨/年）[化学需氧量去除量]</th> </tr>\n" +
                    "        </thead><tbody  style=\"width: 400px;height: 180px;\">"


                alert("COD");
                for (var i = 0; i < data.length; i++) {
                    qqq += "<tr><td>" + data[i].YYDWMC + "</td>";
                    qqq += "<td>" + data[i].QYXXDZ_X_Q_S_Q + "</td>";
                    qqq += "<td>" + data[i].QYXXDZ_X_Z + "</td>";
                    qqq += "<td>" + data[i].JD + "</td>";
                    qqq += "<td>" + data[i].WD + "</td>";
                    qqq += "<td>" + data[i].YXTS_T + "</td>";
                    qqq += "<td>" + data[i].WSCLJB + "</td>";
                    qqq += "<td>" + data[i].WSSJCLNL_D_R + "</td>";
                    qqq += "<td>" + data[i].WSSJCLL_WD + "</td>";
                    qqq += "<td>" + data[i].HXXYLCKND_HK_S + "</td>";
                    qqq += "<td>" + data[i].HXXYLQCL_D + "</td></tr>";
                }
                qqq += "</tbody>";
                $("#downin").html(qqq);
            } else if (monizb == "ANDAN") {
                var qqq = "  <table id=\"tab2\"  class=\"fancyTable\" >\n" +
                    "        <thead style=\"width: 400px;height: 20px;\" >\n" +
                    "        <tr id=\"tr2\">\n" +
                    "            <th>污水厂名称</th>\n" +
                    "            <th>详细地址县(区、市、旗)</th>\n" +
                    "            <th>详细地址乡(镇)</th>\n" +
                    "            <th>经度</th>\n" +
                    "            <th>纬度</th>\n" +
                    "            <th>生产时间（天/年）</th>\n" +
                    "            <th>污水处理级别</th>\n" +
                    "            <th>设计处理能力（吨/日）</th>\n" +
                    "            <th>废水实际处理量（万吨/年）</th>\n" +
                    "        <th>氨氮出口浓度（毫克/升）</th><th>氨氮排放量（万吨/年）</th></tr>\n" +
                    "        </thead><tbody  style=\"width: 400px;height: 180px;\">"

                alert("ANDAN");

                for (var i = 0; i < data.length; i++) {
                    qqq += "<tr><td>" + data[i].YYDWMC + "</td>";
                    qqq += "<td>" + data[i].QYXXDZ_X_Q_S_Q + "</td>";
                    qqq += "<td>" + data[i].QYXXDZ_X_Z + "</td>";
                    qqq += "<td>" + data[i].JD + "</td>";
                    qqq += "<td>" + data[i].WD + "</td>";
                    qqq += "<td>" + data[i].YXTS_T + "</td>";
                    qqq += "<td>" + data[i].WSCLJB + "</td>";
                    qqq += "<td>" + data[i].WSSJCLNL_D_R + "</td>";
                    qqq += "<td>" + data[i].WSSJCLL_WD + "</td>";
                    qqq += "<td>" + data[i].ADCKND_HK_S + "</td>";
                    qqq += "<td>" + data[i].ADQCL_D + "</td></tr>";
                }
                qqq += "</tbody>";
                $("#downin").html(qqq);
            } else {
                var qqq = "  <table id=\"tab2\" >\n" +
                    "        <thead style=\"width: 400px;height: 20px;\"  class=\"fancyTable\" >\n" +
                    "        <tr id=\"tr2\">\n" +
                    "            <th>污水厂名称</th>\n" +
                    "            <th>详细地址县(区、市、旗)</th>\n" +
                    "            <th>详细地址乡(镇)</th>\n" +
                    "            <th>经度</th>\n" +
                    "            <th>纬度</th>\n" +
                    "            <th>生产时间（天/年）</th>\n" +
                    "            <th>污水处理级别</th>\n" +
                    "            <th>设计处理能力（吨/日）</th>\n" +
                    "            <th>废水实际处理量（万吨/年）</th>\n" +
                    "        <th>总磷出口浓度（毫克/升）</th><th>总磷排放量（万吨/年）</th></tr>\n" +
                    "        </thead><tbody  style=\"width: 400px;height: 180px;\">"

                alert("ZONGP");


                for (var i = 0; i < data.length; i++) {
                    qqq += "<tr><td>" + data[i].YYDWMC + "</td>";
                    qqq += "<td>" + data[i].QYXXDZ_X_Q_S_Q + "</td>";


                    qqq += "<td>" + data[i].QYXXDZ_X_Z + "</td>";
                    qqq += "<td>" + data[i].JD + "</td>";
                    qqq += "<td>" + data[i].WD + "</td>";
                    qqq += "<td>" + data[i].YXTS_T + "</td>";
                    qqq += "<td>" + data[i].WSCLJB + "</td>";
                    qqq += "<td>" + data[i].WSSJCLNL_D_R + "</td>";
                    qqq += "<td>" + data[i].WSSJCLL_WD + "</td>";
                    qqq += "<td>" + data[i].ZLCKND_HK_S + "</td>";
                    qqq += "<td>" + data[i].ZLQCL_QK + "</td></tr>";
                }
                qqq += "</tbody>";
                $('#tab2').fixedHeaderTable({footer: true, altClass: 'odd'});
                $("#downintwo").html(qqq);

            }
        }
    });
};






var agoLayer, layer, map, tb, statesTask, riversTask, citiesTask, query, symbol;
var map, layer, graphicLayer, graphic, featureLayer, PicMarkerSymbol, infotem, grap, poi, TexSymbol,allDataGlobal;
var html="";
var num=0;
var extents = {
    tieling: [121.683328, 41.840331, 126.582710, 43.573067],
    huludao: [118.172417, 39.834530, 122.336235, 41.369228],
    chaoyang: [117.205270, 40.391405, 123.074377, 42.504821],
    panjin: [120.835854, 40.610362, 123.252882, 41.494596],
    yingkou: [120.694250, 39.753728, 124.190971, 41.048150],
    jinzhou: [119.431423, 40.729618, 123.581508, 42.211277],
    dandong: [122.309634, 39.673381, 126.586062, 41.213798],
    benxi: [123.398631, 40.740022, 125.936511, 41.637172],
    fushun: [122.925499, 41.209812, 126.512294, 42.482913],
    anshan: [120.654886, 40.025895, 125.149073, 41.654445],
    liaoyang: [121.430973, 40.460256, 125.309147, 41.800736],
    fuxin: [119.195495, 41.535575, 124.155844, 43.299593],
    shenyang: [120.344180, 41.038634, 126.162792, 43.148180]
};
init();
function init() {

    require(["esri/map", "esri/layers/ArcGISDynamicMapServiceLayer", "esri/layers/FeatureLayer",
            "esri/InfoTemplate", "esri/renderers/ClassBreaksRenderer", "esri/symbols/SimpleFillSymbol", "esri/dijit/Legend",
            "esri/Color", "esri/tasks/query", "esri/geometry/Extent", "esri/renderers/SimpleRenderer", "esri/symbols/SimpleLineSymbol",
            "esri/renderers/UniqueValueRenderer","esri/symbols/TextSymbol","esri/layers/LabelClass"],
        function (Map, ArcGISDynamicMapServiceLayer, FeatureLayer, Point,PictureMarkerSymbol,Graphic,
                  InfoTemplate, ClassBreaksRenderer, SimpleFillSymbol, Legend, Color, Query, Extent, SimpleRenderer, SimpleLineSymbol, UniqueValueRenderer,TextSymbol,LabelClass) {
            poi =Point;
            PicMarkerSymbol = PictureMarkerSymbol;
            TexSymbol = TextSymbol;
            infotem = InfoTemplate;
            grap = Graphic;


            var extent =  new esri.geometry.Extent(117.309229, 39.137731, 129.957720, 43.380153);
            map = new esri.Map("map", {
                "spatialReference" : {
                    "wkid" : 4326
                },//地理坐标 4326对应GCS_WGS_1984
                showLabels : true, //very important that this must be set to true!
                extent : extent,
                logo: false, //取消地图默认的logo
            });
            var url = "http://localhost:6080/arcgis/rest/services/liaoheliuyunew/MapServer";
            agoLayer = new ArcGISDynamicMapServiceLayer(url);

            agoLayer.setVisibleLayers([14,15,16,17,18,19,20,21,22,23,24]);//设置china(9)
            map.addLayer(agoLayer);

        });


}
function showMap(lyname,hlname,tjnf){
    $.ajax({
        type: "POST",
        url: "rest/mike/searchAllQiYe",
        async:false,
        dateType: "json",
        data: {
            "szlymc":lyname,
            "snscmc": hlname,
            "tjnf": tjnf
        },
        success: function (allData) {



            html += "<table border='0' class='table-bordered table-striped'>";
            html += "<tr><td>企业名称</td><td>${tbdwxxmc}</td></tr>";
            html += "<tr><td>详细地址县(区、市、旗)</td><td>${xxdzxQSQ}</td></tr>";
            html += "<tr><td>详细地址乡(镇)</td><td>${xxdzxZ}</td></tr>";
            html += "<tr><td>经度</td><td>${jdG}</td></tr>";
            html += "<tr><td>纬度</td><td>${wdG}</td></tr>";
            html += "<tr><td>生产时间（小时/年）</td><td>${nzcscsjXs}</td></tr>";
            html += "<tr><td>废水排放量（吨/年）</td><td>${gyfspflD}</td></tr>";
            html += "<tr><td>COD排放浓度（毫克/升）</td><td>${hxxylpflD}</td></tr>";
            html += "<tr><td>COD排放量（吨/年）</td><td>${hxxylpflD}</td></tr>";
            html += "<tr><td>氨氮排放浓度（毫克/升）</td><td>${adpflD}</td></tr>";
            html += "<tr><td>氨氮排放量（吨/年）\n</td><td>${adpflD}</td></tr>";
            html += "<tr><td>总磷排放浓度（毫克/升）\n</td><td>${zppflD}</td></tr>";
            html += "<tr><td>总磷浓度</td><td>${zppflD}</td></tr>";
            html += "</table><br/>";
            updateQmpInMap(allData);
        }
    });
}

function updateQmpInMap(allData) {


    require([
        "esri/geometry/Point",
        "esri/symbols/SimpleMarkerSymbol",
        "esri/symbols/PictureMarkerSymbol",
        "esri/graphic",
        "esri/InfoTemplate"
    ], function (Point,
                 SimpleMarkerSymbol,
                 PictureMarkerSymbol,
                 Graphic,
                 InfoTemplate) {
        var lon = "";
        var lat = "";
        var attr = "";
        var graphicLayer = new esri.layers.GraphicsLayer();
        graphicLayer.clear();
        for (var i = 0; i < allData.length; i++) {
            lon = allData[i].jdG;
            lat = allData[i].wdG;

            attr= {
                "tbdwxxmc": allData[i].tbdwxxmc,
                "xxdzxQSQ": allData[i].xxdzxQSQ,
                "xxdzxZ":allData[i].xxdzxZ,
                "jdG":allData[i].jdG,
                "wdG": allData[i].wdG,
                "nzcscsjXs": allData[i].nzcscsjXs,
                "gyfspflD": allData[i].gyfspflD,
                "hxxylpflD": allData[i].hxxylpflD,
                "hxxylpflD": allData[i].hxxylpflD,
                "adpflD": allData[i].adpflD,
                "adpflD": allData[i].adpflD,
                "zppflD": allData[i].zppflD,
                "zppflD": allData[i].zppflD,
            };
            var point = new Point(lon, lat, map.spatialReference);
            var infoTemplate = new InfoTemplate("企业点源信息", html);
            var symbol1 = new PictureMarkerSymbol("app/img/qmp5rep.png", 10, 10);
            graphic = new Graphic(point, symbol1, attr, infoTemplate);
            graphicLayer.add(graphic);
            map.addLayer(graphicLayer);

        }
    });
}




var myChart2 = echarts.init(document.getElementById('pic'));

myChart2.setOption({
    title:{ text:'COD排放与水质响应分析图' ,    x:'center',
        y:'top',
        textAlign:'center' },
    toolbox: {
        show:true,
        feature: {
            magicType: { show:true,type: ['line', 'bar']},//图表类型切换
            /* line是折线图，bar是柱形图*/
            dataView: {show:true,readOnly: false},   //  缩放
            restore: {show:true}, // 重置
            saveAsImage: {show:true}, // 导出图片
        }
    },
    dataZoom:{
        show:true,
        realtime:true, //拖动滚动条时是否动态的更新图表数据
        height:25,//滚动条高度
        start:40,//滚动条开始位置（共100等份）
        end:65//结束位置（共100等份）
    },
    xAxis:{ data:[]
    },
    yAxis:{ type : 'value',//默认为值类型       
        splitLine:{ show:true } },
    series:[]


});
//实现点击某按钮显示图形
$("#mytype").click(function(){
//给柱形图赋值 
    $.ajax({ type: 'POST',
        url: "rest/mike/getResShow",
        cache : false, //禁用缓存
        dataType: "json",
        success: function(data) {
//编辑组织数据，这里后台返回的data格式为{'categ': ['男', '女'], 'data': [[2, 136, 38, 4, 1, 0], [3, 75, 25, 5, 1, 0]], 'name': ['青少年', '青年人', '中年人', '老年前期', '老年人', '长寿老人']}
            var series=[];
            for (var i=0;i<data.data.length;i++){
                var item={
                    table:data.title,
                    name:data.categ[i],
                    data:data.data[i],
                    type:'bar',
                    center:['50%','30%'],
                    label: { normal: { show: true, position: 'top' } }
                };
                series.push(item); }
//将数据加载到图形中
            myChart2.setOption({
                title: {
                    text: data.title,
                    textStyle: {fontSize: 16},
                    x:'center',
                    y:'top',
                    textAlign:'center'

                },
                toolbox: {
                    show:true,
                    showTitle:false,
                    feature: {
                        magicType: { show:true,type: ['line', 'bar']},//图表类型切换
                        /* line是折线图，bar是柱形图*/
                        dataView: {readOnly: false,show: true,
                            title: '缩放'},   //  缩放
                        restore: {show: true,
                            title: '重置'}, // 重置
                        saveAsImage: {show: true,
                            title: '导出图片'}, // 导出图片
                    },
                    tooltip: { // 和 option.tooltip 的配置项相同
                        show: true,

                        backgroundColor: '#222',
                        textStyle: {
                            fontSize: 12,
                        },
                        extraCssText: 'box-shadow: 0 0 3px rgba(0, 0, 0, 0.3);' // 自定义的 CSS 样式
                    }
                },
                dataZoom:{
                    show:true,
                    realtime:true, //拖动滚动条时是否动态的更新图表数据
                    height:25,//滚动条高度
                    start:40,//滚动条开始位置（共100等份）
                    end:65//结束位置（共100等份）
                },
                legend: {
                    data: data.categ,
                    orient: 'vertical',
                    x:'left',      //可设定图例在左、右、居中
                    y:'top',     //可设定图例在上、下、居中
                    padding:[0,0,0,0],//[（距离上方距离），（距离右方距离）、（距离下方距离）、（距离左方距离）]
                },
                tooltip: {
                    show:true,
                    trigger: 'axis',
                    axisPointer: { type: 'shadow' }
                },
                xAxis: {
                    type: 'category',
                    data: data.name,
                    axisLabel: {interval: 0 ,rotate:-90},//x轴数据显示完整
                },
                yAxis: {name: '人'},
                series: series
            },true);
        }
    });
});