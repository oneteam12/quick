$(function() {

    $('#update').click(function() {
        $.ajax({
            type : "POST",
            dataType : "ShuiXi",
            async : false,
            url : "rest/mikeShuJu/shuiXiUpdate",
            data : $('#editForm').serialize()
        });

        list();
    });

    function list(){
        var url = "rest/mikeShuJu/ShuiXi";
        $.get(url, function(data) {
            $('#main-content').html(data);
        });
    }

    $('#edit_1').unbind("click").bind("click",function(){
        $.ajax({
            type : "POST",
            dataType : "ShuiXi",
            async : true,
            url : "rest/mikeShuJu/shuiXiUpdate",
            data : $('#editForm').serialize(),
            success : function() {
                var url = "rest/mikeShuJu/ShuiXi";
                $.get(url, function(data) {
                    $('#listAll').html(data);
                });
            }
        });
    });
});