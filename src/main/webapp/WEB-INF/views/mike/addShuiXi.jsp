<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link href="app/css/mike/public.css" rel="stylesheet" type="text/css">

</head>
<body>

<div class="mainBox"
     style="height: auto !important; height: 550px; min-height: 550px;">
    <h3>添加水系</h3>
    <form id="insertForm">
        <table width="100%" border="0" cellpadding="8" cellspacing="0"
               class="tableBasic">
            <tr>
                <td width="90" align="right">河流名称</td>
                <td><input type="text" name="sxHlmc" id="sxHlmc" size="60"
                           class="inpMain" /></td>
            </tr>

            <tr>
                <td width="90" align="right">河流编号</td>
                <td><input type="text" name="sxHlbh" id="sxHlbh" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">河流级别</td>
                <td><input type="text" name="sxHljb" id="sxHljb" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">所在流域</td>
                <td><input type="text" name="sxSzly" id="sxSzly" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">上级河流</td>
                <td><input type="text" name="sxSjhl" id="sxSjhl" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">下级河流序列</td>
                <td><input type="text" name="sxXjhlxl" id="sxXjhlxl" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">汇水区面积</td>
                <td><input type="text" name="sxHsqmj" id="sxHsqmj" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">林地面积</td>
                <td><input type="text" name="sxLdmj" id="sxLdmj " size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">草地面积</td>
                <td><input type="text" name="sxCdmj" id="sxCdmj" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">水田面积</td>
                <td><input type="text" name="sxStmj" id="sxStmj" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">旱地面积</td>
                <td><input type="text" name="sxHdmj" id="sxHdmj" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">城镇居民用地面积</td>
                <td><input type="text" name="sxCzmj" id="sxCzmj" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">农村居民用地面积</td>
                <td><input type="text" name="sxNcmj" id="sxNcmj" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">公交建设用地面积</td>
                <td><input type="text" name="sxGjmj" id="sxGjmj" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">未利用土地面积</td>
                <td><input type="text" name="sxWlymj" id="sxWlymj" size="60"
                           class="inpMain" /></td>
            </tr>
            <tr>
                <td width="90" align="right">年份</td>
                <td><input type="text" name="sxDate" id="sxDate" size="60"
                           class="inpMain" /></td>
            </tr>
        </table>
    </form>
</div>
<script type="text/javascript" src="app/js/mike/addShuiXi.js"></script>
</body>
</html>