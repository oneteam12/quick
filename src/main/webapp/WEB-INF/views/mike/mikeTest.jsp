</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
    <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
    <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>
    <script type="text/javascript" src='app/js/mike/mikeTest.js'></script>
    <link rel="stylesheet" type="text/css" href="app/css/mike/mikeTest.css">
</head>
<body>
<%--<button id="read">读取指定文件夹中文件</button>--%>
<%--<button id="open">选中并打开文件</button>--%>
<%--<button id="readresult">读取指定文件夹中结果文件</button>--%>
<%--<button id="openresult">选中并打开结果文件</button></body></br>--%>
<%--<button id="toTxt">水位生成Txt</button>--%>
<%--<button id="toAd11">水位生成Txt</button>--%>
<%--<div id="listAll" style="width: auto"></div>--%>
<%--<div id="listAll2" style="width: auto"></div>--%>


<div id="selectRiver">

    <select id="shuixi">
        <option value="社河" selected>水系选择</option>
        <option value="清河">清河</option>
        <option value="亮子河">亮子河</option>
    </select>
    <select id="river">
        <option value="社河" selected>一级河流选择</option>
        <option value="清河">清河</option>
        <option value="亮子河">亮子河</option>
    </select>
    模拟年份填写<input value="2017" id="time">
    <button>污染源数据显示</button>
    </br>
    </br>
    <div>
        <button id="start">开始模拟</button>
        <button id="result">模拟结果查看</button>
        <button id="export">模拟结果导出</button>
    </div>
    </br>
    <div id="map">

    </div>


    <div id="div1">
        原始数据：</br>
        <table id="tab1">
            <thead>
            <tr>
                <th>名称</th>
                <th>类型（点元面源）</th>
                <th>入河口位置（上下游里程）</th>
                <th>废水排放量（m^3/s）</th>
                <th>COD排放浓度（mg/l）</th>
                <th>氨氮排放浓度（mg/l）</th>
                <th>总磷排放浓度（mg/l）</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
            </tr>
            <tr>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
            </tr>
            <tr>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
            </tr>
            <tr>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
            </tr>
            <tr>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
            </tr>
            <tr>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
            </tr>
            <tr>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
                <td>2</td>
            </tr>
            </tbody>
        </table>
        </br>
        可修改数据：<button>新增</button></br>
        <table id="tab2">
            <thead>
            <tr>
                <th>名称</th>
                <th>类型（点元面源）</th>
                <th>入河口位置（上下游里程）</th>
                <th>废水排放量（m^3/s）</th>
                <th>COD排放浓度（mg/l）</th>
                <th>氨氮排放浓度（mg/l）</th>
                <th>总磷排放浓度（mg/l）</th>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input value="1" style="width: 40px"></td>
                <td><input value="1" style="width: 40px"></td>
                <td><input value="1" style="width: 40px"></td>
                <td><input value="1" style="width: 40px"></td>
                <td><input value="1" style="width: 40px"></td>
                <td><input value="1" style="width: 40px"></td>
                <td><input value="1" style="width: 40px"></td>
                <td><button>删除</button></td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td><button>删除</button></td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td><button>删除</button></td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td><button>删除</button></td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td><button>删除</button></td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td><button>删除</button></td>
            </tr>
            <tr>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td>1</td>
                <td><button>删除</button></td>
            </tr>
            </tbody>
        </table>
        </br>

    </div>
</div>



</div>


</body>
</html>
</body>
</html>