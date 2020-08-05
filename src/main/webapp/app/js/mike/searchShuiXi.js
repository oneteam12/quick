$(function() {
    var i = 0;
    var selectArray = {};
    var searchCount = 2;
    var json = {
        "test" : "test"
    };
    var hash = {
        "sx_hlmc": "河流名称",
        "sx_hlbh": "河流编号",
        "sx_hljb":"河流级别",
        "sx_szly": "所在流域",
        "sx_sjhl":"上级河流",
        "sx_xjhlxl": "下级河流序列",
        "sx_hsqmj": "汇水区面积",
        "sx_ldmj": "林地面积",
        "sx_cdmj": "草地面积",
        "sx_stmj":"水田面积",
        "sx_hdmj": "旱地面积",
        "sx_czmj":"城镇居民用地面积",
        "sx_ncmj":"农村居民用地面积",
        "sx_gjmj": "公交建设用地面积",
        "sx_wlymj": "未利用土地面积",
        "sx_date": "年份",
    }

    var reHash = {
        "河流名称" : "sx_hlmc",
        "河流编号": "sx_hlbh",
        "河流级别": "sx_hljb",
        "所在流域": "sx_szly",
        "上级河流":  "sx_sjhl",
        "下级河流序列": "sx_xjhlxl",
        "汇水区面积": "sx_hsqmj",
        "林地面积": "sx_ldmj",
        "草地面积": "sx_cdmj",
        "水田面积": "sx_stmj",
        "旱地面积":  "sx_hdmj",
        "城镇居民用地面积": "sx_czmj",
        "农村居民用地面积": "sx_ncmj",
        "公交建设用地面积": "sx_gjmj",
        "未利用土地面积":  "sx_wlymj",
        "年份": "sx_date",
    }
    function JSONLength(obj) {
        var size = 0, key;
        for (key in obj) {
            if (obj.hasOwnProperty(key)) size++;
        }
        return size;
    };

    function createJson(json, prop, val) {
        if (typeof val === "undefined") {
            delete json[prop];
        } else {
            json[prop] = val;
        }
    }

    function appendSelect(splitArray) {
        for (i = 0; i < splitArray.length; i++) {
            if (splitArray[i] != "is_del") {
                var selectLi = "";
                selectLi += "<li><a>";
                selectLi += hash[splitArray[i]];
                selectLi += "</a></li>";
                $('#searchSelectTable tr:last td:first div ul').append(selectLi);
            }
        }
    }

    function removeByValue(arr, val) {
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                arr.splice(i, 1);
                break;
            }
        }
    }

    $.ajax({
        type : "POST",
        url : "rest/mikeShuJu/getTableNameShuiXi",
        dataType : "json",
        async : false,
        success : function(result) {
            selectArray = result.toString().split(",");
            appendSelect(selectArray);
        }
    });

    $("#addSearch").click(function() {
        if(searchCount <= JSONLength(hash)){
            if($('#searchSelectTable tr:last td:first div button').text() != "查询条件"){
                var temp = "";
                temp += "<tr>";
                temp += "<td><div class='dropdown'>";
                temp += "<button class='btnz btnz-info dropdown-toggle' type='button' id='dropdownMenu";
                temp += searchCount;
                temp += "' data-toggle='dropdown' aria-haspopup='true' aria-expanded='true'>";
                temp += "查询条件";
                temp += "<span class='caret'></span>";
                temp += "</button>";
                temp += "<ul class='dropdown-menu' aria-labelledby='dropdownMenu";
                temp += searchCount++;
                temp += "'>";
                temp += "</ul></div></td>";
                temp += "<td><input type='text' size='40' class='inpMain' /></td>";
                temp += "</tr>";
                $("#searchSelectTable").append(temp);//向所有段落中追加一些HTML标记，加到末尾
                appendSelect(selectArray);
            }else{
                alert("请您填写完整上一条查询后，再添加新的查询条件，谢谢。")
            }
        }else{
            alert("您不能添加更多的查询条件了=。=")
        }
    });

    $("#removeSearch").click(function() {
        if(searchCount == 2){
            alert("您必须保留至少一条查询条件 ：）")
        }else{
            selectArray.push(reHash[$('#searchSelectTable tr:last td:first div button').text()]);
            $("#searchSelectTable tr:last").remove();
            searchCount--;
        }

    });


    $("#searchSelectTable").on("blur","tr:last td:last input",function(){
        if ($('#searchSelectTable tr:last td:first div button').text().replace(/(^\s*)|(\s*$)/g, '') != "Dropdown") {
            if (reHash[$(this).parent().parent().find('button').text()] != "undefined") {
                var key = reHash[$(this).parent().parent().find('button').text()];
            }else{
                var key = $(this).parent().parent().find('button').text();
            }
            var value = $(this).val();
            createJson(json, key, value);
            createJson(json, "test");
        }
    });

    $('#searchSelectTable').on("click","tr td div ul a",function(e) {
        e.preventDefault();
        var text = reHash[$(this).text()];
        $(this).parent().parent().parent().find('button').text(hash[text]);
        removeByValue(selectArray, text);
    });

    $('#search_x').unbind("click").bind("click",function(){

        $('#jsonInput').val("").val(JSON.stringify(json));
        $('#jumpTmp').val("");

        $.ajax({
            type : "POST",
            dataType : "html",
            async : false,
            url : "rest/mikeShuJu/searchShuiXi_S",
            data : json,
            success : function(data) {
                $('#listAll').html(data);
                var name=$("#nameForMap").val();
                //console.log(name)
                click();
                filterArcGISDynamicMapServiceLayer(name);
            }
        });
    });
});


