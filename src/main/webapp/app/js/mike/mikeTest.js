$(function () {


    // $('#read').click(function () {
    //     var url = "rest/mike/list";
    //     $.get(url, function (data) {
    //         $('#listAll').html(data);
    //     });
    // });
    //
    //
    // $('#open').click(function () {
    //     var name = $('#fileselect').val();
    //     $.ajax({
    //         type: "post",
    //         async: false,
    //         url: "rest/mike/open",
    //         data: {name: name},
    //         success: function (data) {
    //         }
    //     });
    //
    // });
    //
    //
    //     $('#readresult').click(function () {
    //         var url = "rest/mike/resultlist";
    //         $.get(url, function (data) {
    //             $('#listAll2').html(data);
    //         });
    //     });
    //
    //
    //     $('#openresult').click(function () {
    //         var name = $('#resultselect').val();
    //         $.ajax({
    //             type: "post",
    //             async: false,
    //             url: "rest/mike/openresult",
    //             data: {name: name},
    //             success: function (data) {
    //             }
    //         });
    //
    //
    //     });
    //
    // $('#toTxt').click(function () {
    //     window.location.href="http://localhost:8080/quich4j_war_exploded/rest/mike/toTxt";
    // });
    //
    //
    // $('#toAd11').click(function () {
    //     window.location.href="http://localhost:8080/quich4j_war_exploded/rest/mike/toAd11";
    // });

    $(document).ready(function() {

        $('#plan').change(function(){

            var p1=$(this).children('option:selected').val();//这就是selected的值
            var html=" 时间： <input value=\"2019\" id=\"time\">" +
                "边界：<input>";
            if(p1==1){







            }else if(p1==2){






            }else if(p1==3){






            }else if(p1==4){






            };
            $("#form").append(html);














        })





















        var vdefault = $('#time').val();

        $('#time').focus(function() {
            //获得焦点时，如果值为默认值，则设置为空
            if ($(this).val() == vdefault) {
                $(this).val("");
            }
        });
        $('#time').blur(function() {
            //失去焦点时，如果值为空，则设置为默认值
            if ($(this).val()== "") {
                $(this).val(vdefault); ;
            }
        });























        $("#submit").click(function(){


            var data = $("#Form").serialize();
            $.ajax({
                url:'debt/saveNew.do'+'?t='+Math.random(),
                data:$('#form').serialize(),                 //将表单数据序列化，格式为name=value
                type:'POST',
                dataType:'json',
                success:function(data){
                    //success
                },
                error:function(){
                    console.log("提交ajax函数异常");
                },

            });

        });
        $("#").click(function(){


            var data = $("#addForm").serialize();
            $.ajax({
                url: data,
                data:$('#form').serialize(),                 //将表单数据序列化，格式为name=value
                type:'POST',
                dataType:'json',
                success:function(data){
                    //success
                },
                error:function(){
                    console.log("提交ajax函数异常");
                },

            });

        });
        $("#").click(function(){


            var data = $("#addForm").serialize();
            $.ajax({
                url: data,
                data:$('#form').serialize(),                 //将表单数据序列化，格式为name=value
                type:'POST',
                dataType:'json',
                success:function(data){
                    //success
                },
                error:function(){
                    console.log("提交ajax函数异常");
                },

            });

        });









    });

});