
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src='app/js/jquery/jquery-1.7.2.min.js'></script>
    <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
<%--    <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>--%>
<%--    <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>--%>
    <script type="text/javascript" src='app/js/mike/mikeTestTwo.js'></script>
    <link rel="stylesheet" type="text/css" href="app/css/mike/mikeTestTwo.css">


    <script type="text/javascript" src="app/js/jquery/jquery.fixedheadertable.js"></script>
    <link href="app/css/mike/defaultTheme.css" rel="stylesheet" media="screen" />
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
    <div id="listAll">

    </div>
        </br>
    <div id="list2">
        <button id="btn1">选择当前项目查看</button>

        <input style="display:none" id="inp1">

<%--        <div id ="div2"  style="display:none">--%>

<%--            <button id="btn3">新建项目</button>--%>
<%--        </div>--%>

    </div>
        </br>
    <div id="divbutton">

    </div>

    <div id="div1" >
        <div id="div3" style="height: 200px;width: 600px">
           原始数据：</br>
           <table id="tbl1" class="fancyTable">
         <thead style="width: 400px;height: 20px;" >
               <tr>
                   <th>企业名称</th>
                   <th>废水排放量（t/a）</th>
                   <th>COD浓度（mg/l）</th>
                   <th>COD排放量（t/a）</th>
                   <th>氨氮浓度（mg/l）</th>
                   <th>氨氮排放量（t/a）</th>
                   <th>总磷浓度（mg/l）</th>
                   <th> 总磷排放量（t/a）</th>
                </tr>
                </thead>
            <tbody style="width: 400px;height: 80px;" id="tbd1" >
           </tbody>
            </table>
        </div>
    </br>
        <div id="div4" style="height: 200px;width: 600px">
            可修改数据：<button>新增</button></br>
            <table id="tbl2" class="tbl">
                <thead style="width: 400px;height: 20px;" >
                <tr>
                    <th>名称</th>
                    <th>类型（点元面源）</th>
                    <th>入河口位置（上下游里程）</th>
                    <th>废水排放量（m^3/s）</th>
                    <th>COD排放浓度（mg/l）</th>
                    <th>氨氮排放浓度（mg/l）</th>
                    <th>总磷排放浓度（mg/l）</th>
                    <th>企业名称</th>
                    <th>？？？</th>
                    <td>操作</td>
                </tr>
                </thead>
                <tbody style="width: 400px;height: 20px;" >
                <tr>
                    <td><input value="1" >1</td>
                    <td><input value="1" >1</td>
                    <td><input value="1" >1</td>
                    <td><input value="1" >1</td>
                    <td><input value="1">1</td>
                    <td><input value="1" >1</td>
                    <td><input value="1">1</td>
                    <td><input value="1" >1</td>
                    <td><input value="1">1</td>
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
                    <td>1</td>
                    <td>1</td>
                    <td><button>删除</button></td>
                </tr>
                </tbody>
            </table>
        </div>

    </div>









</div>






</body>
</html>
<script type="text/javascript">

    $(document).ready(function() {


        $('#tbl1').fixedHeaderTable({ footer: true, altClass: 'odd' });
        $('#tbl2').fixedHeaderTable({ footer: true, altClass: 'odd' });




    });
</script>