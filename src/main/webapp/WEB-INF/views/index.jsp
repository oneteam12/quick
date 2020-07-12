<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<!-- -->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
  <base href="<%=basePath%>">
  <meta charset="utf-8"/>
  <title>辽宁省水环境综合管理系统</title>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
  <meta content="" name="description"/>
  <meta content="" name="author"/>
  <meta name="MobileOptimized" content="320">

  <!-- BEGIN GLOBAL MANDATORY STYLES -->
  <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
  <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
  <link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
  <!-- END GLOBAL MANDATORY STYLES -->

  <!-- BEGIN THEME STYLES -->
  <link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
  <link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
  <link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
  <link href="assets/css/plugins.css" rel="stylesheet" type="text/css"/>
  <link href="assets/css/pages/tasks.css" rel="stylesheet" type="text/css"/>
  <link href="assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
  <link href="assets/css/custom.css" rel="stylesheet" type="text/css"/>
  <!-- END THEME STYLES -->
  <link rel="stylesheet" href="app/js/Ueditor/themes/default/css/ueditor.css">
  <link rel="shortcut icon" href="app/img/favicon.ico"/>
  <link rel="stylesheet" type="text/css" href="app/css/tipso.css">

</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="page-header-fixed">
<!-- BEGIN HEADER -->
<div class="header navbar navbar-inverse navbar-fixed-top" style="">
  <!-- BEGIN TOP NAVIGATION BAR -->
  <div class="header-inner">
    <%--<img src="assets/img/title.jpg" width="100%">--%>
    <!-- BEGIN LOGO -->
    <span class="navbar-brand" style="color: white;font-style: italic"><strong><span style="font-size: 24px;">辽宁省水环境综合管理系统</span><br/><span
            style="font-size: 10px;color: lightgrey">Environmental protection project of Liaoning</span></strong></span>
    <!-- END LOGO -->
    <!-- BEGIN RESPONSIVE MENU TOGGLER -->
    <a href="javascript:;" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
      <img src="assets/img/menu-toggler.png" alt=""/>
    </a>
    <!-- END RESPONSIVE MENU TOGGLER -->
    <!-- BEGIN TOP NAVIGATION MENU -->
    <ul class="nav navbar-nav pull-right">
      <li style="margin-top: 28px;margin-right: -30px">
        <a>
          <!-- BEGIN STYLE CUSTOMIZER -->
          <div class="theme-panel hidden-xs hidden-sm">
            <div class="toggler"></div>
            <div class="toggler-close"></div>
            <div class="theme-options">
              <div class="theme-option theme-colors clearfix">
                <span> 主题颜色 </span>
                <ul>
                  <li class="color-black current color-default" data-style="default"></li>
                  <li class="color-blue" data-style="blue"></li>
                  <li class="color-brown" data-style="brown"></li>
                  <li class="color-purple" data-style="purple"></li>
                  <li class="color-grey" data-style="grey"></li>
                  <li class="color-white color-light" data-style="light"></li>
                </ul>
              </div>
              <div class="theme-option">
                <span> 布局 </span>
                <select class="layout-option form-control input-small">
                  <option value="fluid">顺序</option>
                  <option value="boxed">盒状</option>
                </select>
              </div>
              <div class="theme-option">
                <span> 标题 </span>
                <select class="header-option form-control input-small">
                  <option value="fixed">固定</option>
                  <option value="default">默认</option>
                </select>
              </div>
              <div class="theme-option">
                <span> 工具栏 </span>
                <select class="sidebar-option form-control input-small">
                  <option value="fixed">固定</option>
                  <option value="default">默认</option>
                </select>
              </div>
              <div class="theme-option">
                <span> 工具栏位置 </span>
                <select class="sidebar-pos-option form-control input-small">
                  <option value="left">左边</option>
                  <option value="right">右边</option>
                </select>
              </div>
              <div class="theme-option">
                <span> 页脚 </span>
                <select class="footer-option form-control input-small">
                  <option value="fixed">固定</option>
                  <option value="default">默认</option>
                </select>
              </div>
            </div>
          </div>
          <!-- END STYLE CUSTOMIZER -->
        </a>

      </li>
      <li class="dropdown user">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown"
           data-close-others="true">
          <img alt="" src="assets/img/avatar1_small.jpg"/>
          <span class="username"> ${userInfo.username } </span>
          <i class="fa fa-angle-down"></i>
        </a>
        <ul class="dropdown-menu">
          <li>
            <a href="javascript:;" id="trigger_fullscreen">
              <i class="fa fa-move"></i> 全屏
            </a>
          </li>
          <li>
            <a href="rest/user/logout">
              <i class="fa fa-key"></i> 退出
            </a>
          </li>
        </ul>
      </li>
      <!-- END USER LOGIN DROPDOWN -->
    </ul>
    <!-- END TOP NAVIGATION MENU -->
  </div>
  <!-- END TOP NAVIGATION BAR -->
</div>
<!-- END HEADER -->
<div class="clearfix"></div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
  <!-- BEGIN SIDEBAR -->
  <div class="page-sidebar-wrapper">
    <div class="page-sidebar navbar-collapse collapse">
      <!-- BEGIN SIDEBAR MENU -->
      <ul class="page-sidebar-menu" id="page-sidebar-menu">
        <li class="start active">
          <a href="javascript:;">
            <i class="glyphicon glyphicon-th-list"></i><span class="title"> 控制断面管理 </span><span
                  class="arrow "> </span>
          </a>

          <ul class="sub-menu" style="display: block;">
            <li>
              <a href="rest/page/newQmp" id="newQmp" >
                基本信息管理
              </a>
            </li>
            <li>
              <a href="rest/page/kzdmTotal" id="kzdmTotal">
                点源总量计算
              </a>
            </li>
            <li>
              <a href="rest/page/qmpMianyuan" id="qmpMianyuan">
                面源总量计算
              </a>
            </li>
            <li>
              <a href="rest/page/qmpDMrate" id="qmpDMrate">
                点源面源贡献率
              </a>
            </li>
            <li>
              <a href="rest/page/kzdmwater" id="kzdmwater">
                断面水质识别
              </a>
            </li>
            <li>
              <a href="rest/page/qmpAnalysis" id="qmpAnalysis">
                水质变化趋势分析
              </a>
            </li>


          </ul>
        </li>
        <li class="open">
          <a href="javascript:;">
            <i class="glyphicon glyphicon-tasks"></i><span class="title"> 断面补偿资金计算 </span><span
                  class="arrow open"> </span>
          </a>

          <ul class="sub-menu">
            <li>
              <a href="rest/page/newQmpCount" id="newQmpCount">
                断面信息维护
              </a>
            </li>
            <li>
              <a href="rest/page/qmpTestData" id="qmpTestData">
                实测数据维护
              </a>
            </li>
            <li>
              <a href="rest/page/qmpSzxz" id="qmpSzxz">
              水质类别判断
              </a>
            </li>
            <li>
              <a href="rest/page/qmpZijinCount" id="qmpZijinCount">
                断面补偿资金计算
              </a>
            </li>
            <li>
              <a href="rest/page/qmpBczjtz" id="qmpBczjtz">
                补偿资金通知单
              </a>
            </li>
            <%--<li>--%>
            <%--<a href="rest/page/DMrate" id="DMrate">--%>
            <%--点源面源贡献率--%>
            <%--</a>--%>
            <%--</li>--%>
          </ul>
        </li>
        <li class="">
          <a href="javascript:;">
            <i class="glyphicon glyphicon-tasks"></i><span class="title"> 控制单元管理 </span><span
                  class="arrow "> </span>
          </a>

          <ul class="sub-menu">
            <li>
              <a href="rest/page/newCu" id="newCu">
                基本信息管理
              </a>
            </li>
            <li>
              <a href="rest/page/kzdyTotal" id="kzdyTotal">
                点源总量计算
              </a>
            </li>
            <li>
              <a href="rest/page/cuMianyuan" id=cuMianyuan"">
                面源总量计算
              </a>
            </li>
            <%--<li>--%>
            <%--<a href="rest/page/DMrate" id="DMrate">--%>
            <%--点源面源贡献率--%>
            <%--</a>--%>
            <%--</li>--%>
          </ul>
        </li>

        <li class="">
          <a href="javascript:;">
            <i class="glyphicon glyphicon-leaf"></i><span class="title"> 污染源管理 </span><span
                  class="arrow "> </span>
          </a>

          <ul class="sub-menu">
            <li>
              <a href="rest/page/newPollSource" id="newPollSource">
                点源信息管理
              </a>
            </li>
            <li>
              <a href="javascript:;">
                面源信息管理（待完成）
              </a>
            </li>
          </ul>

        </li>

        <li class="">
          <a href="javascript:;" id="">
            <i class="glyphicon glyphicon-briefcase"></i><span class="title"> 排污许可管理 </span><span
                  class="arrow "> </span>
          </a>
          <ul class="sub-menu">
            <li>
              <a href="javascript:;">
                排污许可量（待完成）
              </a>
            </li>
            <li>
              <a href="rest/page/pwxkz" id="pwxkz">
                排污许可证
              </a>
            </li>
          </ul>
        </li>

        <li class="">
          <a href="javascript:;">
            <i class="glyphicon glyphicon-book"></i><span class="title"> 政策法规管理 </span><span
                  class="arrow "> </span>
          </a>

          <ul class="sub-menu">
            <%--<li>--%>
            <%--<a href="rest/page/newZcfg" id="newZcfg">--%>
            <%--现行制度--%>
            <%--</a>--%>
            <%--</li>--%>
            <%--<li>--%>
            <%--<a href="rest/page/newZcfg" id="newZcfg">--%>
            <%--课题完善与建设制度--%>
            <%--</a>--%>
            <%--</li>--%>
            <%--<input type="hidden" id="getUserName" value="${userName}">--%>
            <li>
              <a id="nationalLevel" href="rest/page/zcfgGjj">
                国家级
              </a>
            </li>
            <li>
              <a id="provincialLevel" href="rest/page/zcfgSj">
                省级
              </a>
            </li>
            <li>
              <a id="getUser" href="rest/page/zcfgShj">
                市级
              </a>

            </li>
            <li>
              <a id="projectResults" href="rest/page/zcfgKtcg">
                课题成果
              </a>
            </li>
          </ul>

        </li>


        <li class="">
          <a href="javascript:;">
            <i class="glyphicon glyphicon-folder-close"></i><span class="title"> 考核管理 </span><span
                  class="arrow "> </span>
          </a>

          <ul class="sub-menu">
            <li>
              <a href="rest/page/wzglGJJ" id="wzglGJJ">
                国家级
              </a>
            </li>
            <li>
              <a href="rest/page/wzglSJ" id="wzglSJ">
                省级
              </a>
            </li>
          </ul>
        </li>
        <li class=" ">
          <a href="javascript:;">
            <i class="glyphicon glyphicon-briefcase"></i><span class="title"> 污染物输入与水质响应 </span><span
                  class="arrow "> </span>
          </a>

          <ul class="sub-menu">
            <li>
              <a href="rest/page/mike" id="mike">
                MIKE测试
              </a>
            </li>
            <li>
              <a href="rest/page/mikeTwo" id="mikeTwo">
                MIKE测试2
              </a>
            </li>
            <li>
              <a href="rest/page/" id="11">
                模型基础数据管理
              </a>
            </li>
            <li>
              <a href="rest/page/xzpf" id="xzpf">
                现状污染物排放和水质的响应关系
              </a>
            </li>
            <li>
              <a href="rest/page/" id="12">
                水环境容量计算
              </a>
            </li>
            <li>
              <a href="rest/page/" id="13">
                污染物排放限值计算
              </a>
            </li>

            <li>
              <a href="rest/page/shuJu" id="shuJu">
                MIKE模块数据维护
              </a>
            </li>
          </ul>
        </li>
      </ul>

      <span id="jumpOrNot" display="none">1</span>
      <input id="myRole" type="hidden" value="${role}"/>
      <input id="jumpTmp" type="hidden" value=""/>
      <input id="city" type="hidden" value=""/>

      <!-- END SIDEBAR MENU -->

    </div>
    <!-- END SIDEBAR -->
    <!-- BEGIN CONTENT -->
    <div class="page-content-wrapper">
      <div class="page-content">
        <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
        <div class="modal fade" id="portlet-config" tabindex="-1" role="dialog"
             aria-labelledby="myModalLabel"
             aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-hidden="true"></button>
                <h4 class="modal-title">Modal title</h4>
              </div>
              <div class="modal-body">
                Widget settings form goes here
              </div>
              <div class="modal-footer">
                <button type="button" class="btn blue">
                  Save changes
                </button>
                <button type="button" class="btn default" data-dismiss="modal">
                  Close
                </button>
              </div>
            </div>
            <!-- /.modal-content -->
          </div>
          <!-- /.modal-dialog -->
        </div>
        <!-- /.modal -->
        <!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->


        <!-- BEGIN PAGE HEADER-->
        <div class="row">
          <div class="col-md-12">
            <!-- BEGIN PAGE TITLE & BREADCRUMB-->
            <h3 class="page-title" style="">
              <div style="padding-bottom: 10px;border-bottom: 2px solid #F3F3F3">
                <div style="border-left: solid 10px #00C0C2;padding-left: 2px;">
                  <div id="index-page-title"
                       style="padding-left:8px;border-left: solid 3px #00C0C2;">

                  </div>
                </div>
              </div>
            </h3>
            <!-- <ul class="page-breadcrumb breadcrumb">
                <li>
                    <i class="fa fa-home"></i>
                    <a href="javascript:;">
                        首页
                    </a>
                    <i class="fa fa-angle-right"></i>
                </li>
                <li>
                    <a href="javascript:;">
                        Dashboard
                    </a>
                </li>
            </ul> -->
            <!-- END PAGE TITLE & BREADCRUMB-->
          </div>
        </div>
        <!-- END PAGE HEADER-->

        <!-- BEGIN DASHBOARD STATS -->
        <div id="main-content"></div>

        <!-- END PORTLET-->
      </div>
    </div>
    <!-- END CONTENT -->
  </div>
  <!-- END CONTAINER -->
  <!-- BEGIN FOOTER -->
  <div class="footer">
    <div class="footer-inner">
      2017 &copy; By NEU&SYLU.
    </div>
    <div class="footer-tools">
      <span class="go-top"><i class="fa fa-angle-up"></i></span>
    </div>
  </div>
  <!--[if lt IE 9]>
  <script src="assets/plugins/respond.min.js"></script>
  <script src="assets/plugins/excanvas.min.js"></script>
  <![endif]-->

  <script src="assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
  <script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
  <script src="assets/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
  <script src="assets/plugins/bootstrap/js/bootstrap.js" type="text/javascript"></script>
  <script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js"
          type="text/javascript"></script>
  <script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
  <script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
  <script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
  <script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
  <script src="assets/plugins/jquery-validation/dist/jquery.validate.min.js" type="text/javascript"></script>
  <script src="assets/plugins/select2/select2.min.js" type="text/javascript"></script>
  <script src="assets/scripts/app.js" type="text/javascript"></script>
  <script type="text/javascript" src="app/js/My97DatePicker/WdatePicker.js"></script>
  <script src="app/js/index.js" type="text/javascript"></script>
  <script src="app/js/init-arcgis.js"></script>
  <script type="text/javascript" src="app/js/tipso.js"></script>
</div>
</body>
</html>
