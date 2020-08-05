
$(document).ready(function() {




})

$("#name").change(function(){
    var name = $("#name").val();
    alert(name);
    get(name);
    add(name);
    addClick(name);
    search(name);
    bulkImport(name);
    exportExcel(name);
    bulkImportButton(name);
});



/**
 * 显示数据列表
 * **/

    function get(dat){
    var url = "rest/mikeShuJu/"+dat;
    $.get(url, function(data) {
        $('#listAll').html(data);
    });

    }

/**
 * 添加按钮事件
 * **/

    function add(dat){

        $('#addButton').click(function(){
            var url = "rest/mikeShuJu/add"+dat;
            $.get(url, function(data) {
                $('#addDiv').html(data);
            });
        });
    }
/**
 * 添加按钮弹窗事件
 * **/
    function addClick(dat){

        $('#add_x').click(function() {
            $.ajax({
                type : "POST",
                dataType : dat,
                async : false,
                url : "rest/mikeShuJu/insert"+dat,
                data : $('#insertForm').serialize(),
            });

            var url = "rest/mikeShuJu/"+dat;
            $.get(url, function(data) {
                $('#main-content').html(data);
            });
        });
    }

/**
 * 搜索按钮事件
 * **/

    function search(dat){
        $('#searchButton').click(function() {
            var url = "rest/mikeShuJu/search"+dat;
            $.get(url, function(data) {
                $('#searchDiv').html(data);
            });
        });
    }

/**
 * 导入事件
 * **/



function bulkImport(dat){
       $('#bulkImportButton').click(function() {
           var url = "rest/mikeShuJu/bulkImport"+dat;
           $.get(url, function(data) {
               $('#bulkImportDiv').html(data);
           });
       });

   }

    function bulkImportShow() {
    var fileName = $("#fileName").text();
    $.ajax({
        type:"POST",
        dataType : "json",
        url:"rest/mikeShuJu/bulkImportShowShuiXi",
        async:false,
        data: {name:fileName},
        success: function(data) {
            console.log(data);
            var msg = data.msg;
            console.log(data.msg)
            var time = data.time;
            console.log(data.updateCount)
            var updateCount = data.updateCount;
            console.log(data.insertCount)
            var insertCount = data.insertCount;
            var newMsg = msg+"\n用时: "+time+"\n更新了："+updateCount+"条数据；\n新增了："+insertCount+"条数据。";
            alert(newMsg);
            // alert(data);
        }
    })

}

    function exportExcel(dat){
        $("#exportExcel").click(function () {
            $.ajax({
                type : "POST",
                dataType : "html",
                async : false,
                url : "rest/mikeShuJu/exportExcel"+dat,
                success : function(data) {
                    window.location.href="rest/mikeShuJu/upload";
                }
            });
        });


    }

    function bulkImportButton(dat){
        $('#bulkImportButton').click(function() {
            var url = "rest/mikeShuJu/bulkImport"+dat;
            $.get(url, function(data) {
                $('#bulkImportDiv').html(data);
            });
        });

    }
















