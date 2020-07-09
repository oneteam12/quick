

$(document).ready(function() {




    var str = "<select id='sheng'></select> <select id='shi'></select>    <select id='qu'></select> <select id='hr'></select>";//三个下拉交给一个字符串
    $("#listAll").html(str);//将三个下拉的字符串交给前边的div
    tiansheng();//加载省的数据
    tianshi();//加载市的数据
    tianqu();//加载区 的数据
    tianhr();//加载区 的数据

    $("#sheng").change(function(){
        tianshi();//重新加载市
        tianqu();//重新加载区
        tianhr();//加载区 的数据
    });
    $("#shi").change(function(){
        tianqu();//加载区的数据
        tianhr();//加载区 的数据
    });
    $("#qu").change(function(){
        tianhr();//加载区 的数据
    });

    $("#hr").change(function(){


        var sheng = $("#sheng").val();
        var shi = $("#shi").val();
        var qu = $("#qu").val();
        var hr = $("#hr").val();
        if(sheng  != 0 && shi !=0 && qu !=0 && hr ==99){


            $("#div2").show();

            var html ="<button id=\"show2\">边界条件设置</button>\n" +
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
                dataType:"json",
                success: function(data){
                    alert("新建成功");

                }
            });
        }

    });


    $("#show1").click(function(){
        // $("#div1").css("display","block");

        if ($("#div1").css("display")== "none") {

            $("#div1").css("display","block");
        } else {

            $("#div1").css("display","none");
        };

    });
    $("#show2").click(function(){
        // $("#div1").css("display","block");
        alert("asda");
        if ($("#div1").css("display")== "none") {

            $("#div1").css("display","block");
        } else {

            $("#div1").css("display","none");
        };

    });
});


function tiansheng() {
    var pcode = "0001"; //找出省的父级代号
    $.ajax({
        async:false,//同步
        url:"rest/mike/getShuixi",
        data:{pcode:pcode},
        type:"POST",
        dataType:"json",
        success: function(data){
         var haha="<option value=\"0\" selected>水系选择</option>";
           // var haha="";

            for (var i = 0; i < data.length; i++) {
                haha+="<option value='"+data[i]+"'>"+data[i]+"</option>";
            };
            $("#sheng").html(haha);
        }
    });
};

function tianshi() {
    var pcode = $("#sheng").val();//找市的父级代号，省选中项的值
    $.ajax({
        async:false,
        url:"rest/mike/getYiJi",
        data:{shuixi:pcode},
        type:"POST",
        dataType:"json",
        success: function(data){
           var html="<option value=\"0\" selected>一级河流选择</option>";
            //var html="";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i].yijiheliu+"'>"+data[i].yijiheliu+"</option>";
            };
            $("#shi").html(html);

        }
    });
};

function tianqu() {
    var pcode = $("#shi").val();//找区的父级代号，市选中项的值
    $.ajax({
        url:"rest/mike/getMoNi",
        data:{yiji:pcode},
        type:"POST",
        dataType:"json",
        success: function(data){
             var html="<option value=\"0\" selected>二级河流选择</option>";
            //var html="";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i].moni+"'>"+data[i].moni+"</option>";
            };
            $("#qu").html(html);

        }
    });
};

function tianhr() {
    var pcode = $("#qu").val();//找区的父级代号，市选中项的值
    $.ajax({
        url:"rest/mike/getFangan",
        data:{moni:pcode},
        type:"POST",
        dataType:"json",
        success: function(data){
            var html="<option value=\"0\" selected>方案选择</option>";
            html+="<option value=\"99\" >新建方案</option>";
            for (var i = 0; i < data.length; i++) {
                html+="<option value='"+data[i].fangan+"'>"+data[i].fangan+"</option>";
            };
            $("#hr").html(html);

        }
    });
};


$("#btn1").click(function(){
       var sheng = $("#sheng").val();
       var shi = $("#shi").val();
       var qu = $("#qu").val();
       var hr = $("#hr").val();
      if(sheng  != 0 && shi !=0 && qu !=0 && hr !=0 && hr !=99){
          var html ="<button id=\"show1\">边界条件查看</button>\n" +
              "        </br>\n" +
              "        </br>\n" +

              "<button id=\"export\">条件设置导出</button>\n" +
              "        </br>\n" +
              "        </br>\n" +
              "        <button id=\"exportresult\">模拟结果导出</button>\n";
          $("#divbutton").html(html);
         alert(sheng+shi+qu+hr);
          $.ajax({
              url:"rest/mike/openresult",
              data:{
                  sheng:sheng,
                  shi:shi,
                  qu:qu,
                  hr:hr
              },
              type:"POST",
              dataType:"json",
              success: function(data){


              }
          });
         }else{
          alert("选择错误，请重新选择");
      }


    });

$("#show").click(function(){
    // $("#div1").css("display","block");

    if ($("#div1").css("display")== "none") {

        $("#div1").css("display","block");
    } else {

        $("#div1").css("display","none");
    };

});


$("#export").click(function(){
   alert("haha");

});


// $("#sel1").change(function(){
//
//     var shuixi = $("#sel1").val();
//     //alert(shuixi);
//
//     $.ajax({
//         type:"POST",// get或者post
//         url:"rest/mike/yiji",// 请求的url地址
//         data:{shuixi : shuixi},//请求的参数
//         dataType:"json",//json写了jq会帮我们转换成数组或者对象 他已经用JSON.parse弄好了
//         success: function(data) {
//             var html="<option value=\"0\" selected>一级河流选择</option>";
//             for (var i = 0; i < data.length; i++) {
//                 html+="<option value='"+data[i].yijiheliu+"'>"+data[i].yijiheliu+"</option>";
//             };
//             $("#sel2").html(html);
//             //alert(data[0].yijiheliu);
//         },
//     })












    // var url = "rest/kzdm/list";
    // $.get(url, function(data) {
    //     $('#listAll').html(data);
    // });











