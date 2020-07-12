$(document).ready(function() {



    var str0 ="河流选择：</br>流域选择：<select id='liuyu'></select>  水系选择： <select id='shuixi'></select>    干流选择：<select id='ganliu'></select>";
    $("#heliuxuanze").html(str0);

    var str = "一级河流选择：<select id='yiji'></select>二级河流选择：<select id='erji'></select>三级河流选择：<select id='sanji'></select>四级河流选择：<select id='siji'></select>五级河流选择：<select id='wuji'></select>";//三个下拉交给一个字符串
    $("#home").html(str);


    var str2=" 模拟设置：</br>水文年份：<select id='shuiwennf'></select>计算年份：<select id='jisuannf'></select>排放数据选择：<select id='sjxz'></select>模拟指标：<select id='monizb'></select>"
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


    $("#inp1").keyup(function() {
        var uname = $(this).val();
        var reg = /^[\u4e00-\u9fa5]+$/;

//&&reg.test(uname)
        if(uname != ""&&reg.test(uname)){
            $("#lsn").show();
            $.ajax({
                url:"rest/mike/test",
                type:"post",
                data:{"term":uname},
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
    // var pcode = "0001"; //找出省的父级代号
    // $.ajax({
    //     async:false,//同步
    //     url:"rest/mike/getShuixi",
    //     data:{pcode:pcode},
    //     type:"POST",
    //     dataType:"json",
    //     success: function(data){
    //         var haha="<option value=\"0\" selected>水系选择</option>";
    //         // var haha="";
    //
    //         for (var i = 0; i < data.length; i++) {
    //             haha+="<option value='"+data[i]+"'>"+data[i]+"</option>";
    //         };
    //         $("#sheng").html(haha);
    //     }
    // });
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
                html+="<option value='"+data[i]+"'>"+data[i]  +"</option>";
            };
            $("#wuji").html(html);

        }
    });
};
function shuiwennf() {
    var pcode = $("#shuixi").val();//找区的父级代号，市选中项的值
    var pcode2 = $("#ganliu").val();//找区的父级代号，市选中项的值
    $.ajax({
        url:"rest/mike/getShuiwennf",
        data:{moni:pcode,
            yiji:pcode2
        },
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="<option value=\"0\" selected>==请选择==</option>";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i].fangan+"'>"+data[i].fangan+"</option>";
            };
            $("#shuiwennf").html(html);

        }
    });
};
function jisuannf() {
    var pcode = $("#shuixi").val();//找区的父级代号，市选中项的值
    var pcode2 = $("#ganliu").val();//找区的父级代号，市选中项的值
    $.ajax({
        url:"rest/mike/getJisuannf",
        data:{moni:pcode,
            yiji:pcode2
        },
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="<option value=\"0\" selected>==请选择==</option>";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i].fangan+"'>"+data[i].fangan+"</option>";
            };
            $("#jisuannf").html(html);

        }
    });
};
$("#hr").change(function(){


    var sheng = $("#sheng").val();
    var shi = $("#shi").val();
    var qu = $("#qu").val();
    var hr = $("#hr").val();
    if(sheng  != 0 && shi !=0 && qu !=0 && hr ==99){
        var html ="<button id=\"show\">边界条件设置</button>\n" +
            "        </br>\n" +
            "        </br>\n" +
            "        <button id=\"start\">开始模拟</button>\n" +
            "        </br>\n" +
            "        </br>\n" +
            "        <button id=\"result\">模拟结果查看</button>\n" +
            "        </br>\n" +
            "        </br>\n" +
            "        <button id=\"export\">模拟结果导出</button>";

        $("#divbutton").html(html);

        $.ajax({
            url:"rest/mike/newOne",
            data:{
                sheng:sheng,
                shi:shi,
                qu:qu
            },
            type:"POST",
            async:false,
            dateType: "json",
            success: function(data){

                var ht="";
                for (var i = 0; i < data.length; i++) {
                    ht+="<tr><td>"+data[i].qiyename+"</td>";
                    ht+="<td>"+data[i].liuliang+"</td>";
                    if(data[i].codnd==null){
                        ht+="<td>无</td>";
                    }else{
                        ht+="<td>"+data[i].codnd+"</td>";
                    }
                    if(data[i].codpfl==null){
                        ht+="<td>无</td>";
                    }else{
                        ht+="<td>"+data[i].codpfl+"</td>";
                    }
                    if(data[i].tnnd==null){
                        ht+="<td>无</td>";
                    }else{
                        ht+="<td>"+data[i].tnnd+"</td>";
                    }
                    if(data[i].tnpfl==null){
                        ht+="<td>无</td>";
                    }else{
                        ht+="<td>"+data[i].tnpfl+"</td>";
                    }
                    if(data[i].tpnd==null){
                        ht+="<td>无</td>";
                    }else{
                        ht+="<td>"+data[i].tpnd+"</td>";
                    }
                    if(data[i].tppflc==null){
                        ht+="<td>无</td></tr>";
                    }else{
                        ht+="<td>"+data[i].tppfl+"</td></tr>";
                    }
                    // ht+="<td>"+data[i].codnd+"</td>";
                    // ht+="<td>"+data[i].codpfl+"</td>";
                    // ht+="<td>"+data[i].tnnd+"</td>";
                    // ht+="<td>"+data[i].tnpfl+"</td>";
                    // ht+="<td>"+data[i].tpnd+"</td>";
                    // ht+="<td>"+data[i].tppfl+"</td></tr>";
                };

                $('#tbl1').fixedHeaderTable({ footer: true, altClass: 'odd' });

                $("#tbd1").html(ht);
                alert("新建成功");

            }
        });

    }

});



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
            var url = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer";
            agoLayer = new ArcGISDynamicMapServiceLayer(url);

            agoLayer.setVisibleLayers([0,1,5,6,7,8,9,10,11,12,13,14,15,16,17,20,22,23,24,25]);//设置china(9)
            map.addLayer(agoLayer);

        });


}
$("#select").click(function(){
    var Heliu =$("#haha").val();
    $.ajax({
        type: "POST",
        url: "rest/mike/searchAllQiYe",
        async:false,
        dateType: "json",
        data: {
            "snscmc": Heliu,
            "tjnf": "2017"
        },
        success: function (allData) {



            html += "<table border='0' class='table-bordered table-striped'>";
            html += "<tr><td>企业名称</td><td>${qiyename}</td></tr>";
            html += "<tr><td>流量</td><td>${liuliang}</td></tr>";
            html += "<tr><td>经度</td><td>${jd}</td></tr>";
            html += "<tr><td>纬度</td><td>${wd}</td></tr>";
            html += "<tr><td>cod排放量</td><td>${codpfl}</td></tr>";
            html += "<tr><td>cod浓度</td><td>${codnd}</td></tr>";
            html += "<tr><td>总氮排放量</td><td>${tnpfl}</td></tr>";
            html += "<tr><td>总氮浓度</td><td>${tnnd}</td></tr>";
            html += "<tr><td>总磷排放量</td><td>${tppfl}</td></tr>";
            html += "<tr><td>总磷浓度</td><td>${tpnd}</td></tr>";
            html += "</table><br/>";
            updateQmpInMap(allData);
        }
    });
});


function displayPoints(allData){

    // allDataGlobal = allData;

    for (var i = 0; i < allData.length; i++) {
        var attrs = {
            "qiyename": allData[i].qiyename,
            "liuliang": allData[i].liuliang,
            "jd":allData[i].jd,
            "wd":allData[i].wd,
            "codpfl": allData[i].codpfl,
            "codnd": allData[i].codnd,
            "tnpfl": allData[i].tnpfl,
            "tnnd": allData[i].tnnd,
            "tppfl": allData[i].tppfl,
            "tpnd": allData[i].tpnd,
        };
        var lon=attrs.jd;
        var lat=attrs.wd;
        point = new poi(lon, lat, map.spatialReference);
        var infoTemplate = new infotem("污染点源信息", html);
        var symbol1 = new PicMarkerSymbol("app/img/qmp5rep.png", 10, 10);
        graphic = new grap(point, symbol1, attrs, infoTemplate);
        var histogramsymbol = new PicMarkerSymbol("app/img/histogram_orange.png", 6, 23);
        histogramsymbol.setOffset(-10, 18);
        histogramgraph = new grap(point, histogramsymbol, attrs);
        graphicLayer = new esri.layers.GraphicsLayer();
        graphicLayer.add(graphic);
    }
    // var layer = esri.layers.GraphicsLayer({id:"layer"});
    // $.each(attrs, function(){
    //     var lon= this.jd;
    //     var lat = this.wd;
    //     var pt = new esri.geometry.Point([lon, lat]);
    //     var pictureMarkerSymbol = new esri.symbol.PictureMarkerSymbol("app/img/qmp5rep.png", 20, 20);
    //     var g = new esri.Graphic(pt, pictureMarkerSymbol);
    //     var template = new esri.InfoTemplate();
    //     g.setInfoTemplate(template);
    //     layer.add(g);
    // });
    // map.addLayer(layer);

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
            lon = allData[i].jd;
            lat = allData[i].wd;

            attr= {
                "qiyename": allData[i].qiyename,
                "liuliang": allData[i].liuliang,
                "jd":allData[i].jd,
                "wd":allData[i].wd,
                "codpfl": allData[i].codpfl,
                "codnd": allData[i].codnd,
                "tnpfl": allData[i].tnpfl,
                "tnnd": allData[i].tnnd,
                "tppfl": allData[i].tppfl,
                "tpnd": allData[i].tpnd,
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