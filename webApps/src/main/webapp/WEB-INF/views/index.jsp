<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="zh-CN"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="zh-CN"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="zh-CN"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="zh-CN">
<!--<![endif]-->
<head>
    <title>Welcome to web Analytics</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container " style="padding: 100px;height: 1%;width:90%;">
    <div class="loginBox row">
        <h2 class="text-center">Stack Analytics</h2>
    </div>
</div>
<div class="container text-center" style="margin:0px auto; height: 5%;width:80%;">
    <div class="loginBox row">
        <form class="form-inline">
            <div class="form-group">
                <label class="sr-only" for="contentUrl">Stock</label>

                <div class="input-group">
                    <div class="input-group-addon">Stock Number</div>
                    <input type="text" class="form-control" id="contentUrl" size="50" placeholder="Analytics Stack">
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Submit Stack</button>
        </form>
        <img src="./resources/images/button.png" >
    </div>
</div>
<!--.content-->
<script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
</body>
</html>
