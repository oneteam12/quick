<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<div id="list" style="display: block;overflow:auto;width:100%;">
    <table width="100%" border="0" cellpadding="7" cellspacing="0"
           class="tableBasic" id="list_t">
        <tr>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">操作</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">河流名称</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">河流编号</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">河流级别</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">所在流域</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">上级河流</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">下级河流序列</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">汇水区面积</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">林地面积</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">草地面积</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">水田面积</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">旱地面积</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">城镇居民用地面积</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">农村居民用地面积</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">公交建设用地面积</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">未利用土地面积</th>
            <th align="center" style="white-space: nowrap;text-align: center;background:#99A4AF;color:white">年份</th>
        </tr>

        <c:forEach var="shuiXi" items="${list}">
            <tr id="${shuiXi.id}">
                <td align="center" style="white-space: nowrap;">
                    <a href="rest/mikeShuJu/shuiXiId?id=${shuiXi.id}" class="updateButton" style="color: white;background:#FAAD5E;padding:2px 6px">修改</a>
                    <a href="rest/mikeShuJu/shuiXiDelete?id=${shuiXi.id}" class="deleteButton" style="color: white;background:#00C0BF;padding:2px 6px">删除</a>
                </td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxHlmc}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxHlbh}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxHljb}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxSzly}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxSjhl}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxXjhlxl}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxHsqmj}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxLdmj}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxCdmj}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxStmj}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxHdmj}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxCzmj}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxNcmj}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxGjmj}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxWlymj}</td>
                <td align="center" style="white-space: nowrap;">${shuiXi.sxDate}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<!-- 分页功能 start -->
<div align="center" id="page">
    <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第
    ${page.pageNow} 页</font> <a href="rest/mikeShuJu/ShuiXi?pageNow=1">首页</a>
    <c:choose>
        <c:when test="${page.pageNow - 1 > 0}">
            <a href="rest/mikeShuJu/ShuiXi?pageNow=${page.pageNow - 1}">上一页</a>
        </c:when>
        <c:when test="${page.pageNow - 1 <= 0}">
            <!-- <a href="rest/controlunit/list?pageNow=1">上一页</a>   -->
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${page.totalPageCount==0}">
            <a href="rest/mikeShuJu/ShuiXi?pageNow=${page.pageNow}">下一页</a>
        </c:when>
        <c:when test="${page.pageNow + 1 <= page.totalPageCount}">
            <a href="rest/mikeShuJu/ShuiXi?pageNow=${page.pageNow + 1}">下一页</a>
        </c:when>
        <c:when test="${page.pageNow + 1 > page.totalPageCount}">
            <!-- <a href="rest/controlunit/list?pageNow=${page.totalPageCount}">下一页</a> -->
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${page.totalPageCount==0}">
            <a href="rest/mikeShuJu/ShuiXi?pageNow=${page.pageNow}">尾页</a>
        </c:when>
        <c:otherwise>
            <a href="rest/mikeShuJu/ShuiXi?pageNow=${page.totalPageCount}">尾页</a>
        </c:otherwise>
    </c:choose>
</div>
<script>
    $('.search_A').click(function(e) {
        e.preventDefault();
        var tmp = $('#jumpTmp').val();
        var test;
        if(tmp=="")	{
            tmp = $('#jsonInput').val();
        }
        test = JSON.parse(tmp);

        $.ajax({
            type : "POST",
            dataType : "html",
            async : false,
            url : this.href,
            data : test,
            success : function(data) {
                $('#listAll').html(data);
            }
        });
    });
</script>
<!-- 分页功能 end -->
<script type="text/javascript" src="app/js/mike/ShuiXiList.js"></script>
</body>
</html>