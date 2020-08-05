<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/16 0016
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>数据维护</title>
    <script type="text/javascript" src='app/js/jquery/jquery-1.7.2.min.js'></script>
    <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
    <script type="text/javascript" src='app/js/mike/mikeShuJu.js'></script>




    <link rel="stylesheet" type="text/css" href="app/css/mike/mikeShuJu.css">

    <link rel="stylesheet" type="text/css" href="app/css/mike/public.css">



</head>
<body>

<div id="all">
    <div id="up">
        <div id="left">
            <div class="box">
                <div id="head-title">
                    <a class="" style="font-size: 15px">MIKE模块数据维护</a>
                    <select id="name" >
                        <option value="0" selected>======请选择======</option>
                        <option value="ShuiXi">水系信息表</option>
                        <option value="2">输出系数信息表</option>
                        <option value="3">河流大断面信息表</option>
                        <option value="4">水文信息表</option>
                        <option value="5">监测断面基本信息表</option>
                        <option value="6">断面水质监测信息表</option>
                        <option value="7">断面水质在线监测信息表</option>
                        <option value="8">污水处理厂基本信息表</option>
                        <option value="9">环统污水处理厂信息表</option>
                        <option value="10">污水处理厂在线监测信息表</option>
                        <option value="11">企业基本信息表</option>
                        <option value="12">环统企业填报数据表</option>
                        <option value="13">企业在线监测信息表</option>
                    </select>
                </div>
                <div class="flex-row">
                    <button type="button" class="btnz btnz-info"
                            data-toggle="modal" data-target="#myModal_add" id="addButton">添加
                    </button>
                    <button type="button" class="btnz btnz-info"
                            data-toggle="modal" data-target="#myModal_search" id="searchButton">查询
                    </button>
                    <button type="button" class="btn btn-primary btn-lg hide"
                            data-toggle="modal" data-target="#myModal_edit" id="editModelButton"></button>
                </div>
                <div class="flex" style="margin-bottom: 0px;">
                    <button type="button" class="btnz btnz-black"
                            data-toggle="modal" data-target="#myModal_bulkImport" id="bulkImportButton">批量导入
                    </button>

                    <button type="button" class="btnz btnz-black" id="exportExcel">导出表格</button>
                </div>
            </div>
            <input type="text" id="jsonInput" class="hide" value=""/>
            <input type="text" id="currentplace" class="hide" value=""/>
            <div class="box" style="margin-top: 10px;padding-top: 5px;padding-bottom: 10px;align-items: flex-start;">
                <div>
                    <div id="citylisthead" class="flex1-row" style="margin-bottom: 10px;margin-top: 5px">
                    </div>
                </div>

                <div id="citylist" style="width: 100%;display: flex;flex-direction: row;justify-content: center;flex-wrap: wrap"></div>
            </div>
            <div class="box" style="width:100%;position:absolute;bottom:0px;padding-top: 5px;padding-bottom: 10px;align-items: flex-start;">

            </div>
        </div>
        <div id="right" style="position:relative">
<%--            <div id="map"></div>--%>

        </div>
    </div>
    <div id="down">
        <div id="listAll" style="width: auto"></div>
    </div>
    <div id="down2">
        <div id="listAll2" class="hide"></div>
    </div>
</div>



<div class="modal fade" id="myModal_add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">添加</h4>
            </div>
            <div class="modal-body">
                <div id="addDiv"></div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="add_x">确认添加</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="myModal_edit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">修改</h4>
            </div>
            <div class="modal-body">
                <div id="editDiv"></div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="edit_1">确认修改</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="myModal_search" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">查询</h4>
            </div>
            <div class="modal-body">
                <div id="searchDiv">
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btnz btnz-info" data-dismiss="modal" id="search_x">查询</button>
            </div>
        </div>
    </div>
</div>


<div class="modal fade" id="myModal_bulkImport" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">批量导入</h4>
            </div>
            <div class="modal-body">
                <div id="bulkImportDiv">
                </div>
            </div>
            <div class="modal-footer">
                <a type="button" class="btnz btnz-info" data-dismiss="modal" id="bulkImport_x"
                   onclick="bulkImportShow()">批量导入</a>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>
