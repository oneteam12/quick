$(function(){
    //
    // $('#addKzdm').click(function() {
    //     $.ajax({
    //         type : "POST",
    //         dataType : "KzdmJbxx",
    //         async : false,
    //         url : "rest/kzdm/insert",
    //         data : $('#insertForm').serialize(),
    //
    //     });
    //
    //     var url = "rest/kzdm/list";
    //     $.get(url, function(data) {
    //         $('#main-content').html(data);
    //     });
    // });

    // $('#listKzdy_1').click(function(e) {
    //     e.preventDefault();
    //     var url = this.href;
    //     $.get(url, function(data) {
    //         $('#main-content').html(data);
    //     });
    // });

    $('#add_x').unbind("click").bind("click",function(){
        $.ajax({
            type : "POST",
            dataType : "ShuiXi",
            async : true,
            url : "rest/mikeShuJu/insertShuiXi",
            data : $('#insertForm').serialize(),
            success : function() {

                var url = "rest/mikeShuJu/ShuiXi";
                $.get(url, function(data) {
                    $('#listAll').html(data);
                });
            }
        });
    });
});
