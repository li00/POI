<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/3
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>雇员信息</title>
</head>
<style>
    body{
        margin:0 auto;
    }
    h1{
      text-align: center;
    }
    table{
        width:50%;
        margin:0 auto;
    }
    td{
        text-align: center;
    }
    #info:hover{
        background: cornsilk;
    }
    a{
        display: inline-block;
        width: 100px;
        height: 30px;
        border-radius: 5px;
        background: green;
        float: right;
        text-decoration: none;
        line-height: 30px;
        text-align: center;
        margin-top: 10px;
        margin-right: 25%;
        color: white;
    }
    a:hover{
        cursor: pointer;
    }
</style>
<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript">
    $(function () {
        $('a').click(function () {
            $.ajax({
                type:'post',
                url:'/exportExcel',
                success:function (data) {
                    if(data!=null&& data!=""){
                        alert(data);
                    }
                }
            })
        })
    })
</script>
<body>
<h1>职员信息</h1>
<table border="1">
    <tr bgcolor="aqua">
        <td>ID</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>籍贯</td>
        <td>入职日期</td>
    </tr>
    <c:forEach items="${list}" var="list" >
        <tr bgcolor="#f5f5dc" id="info">
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.age}</td>
            <td>${list.sex}</td>
            <td>${list.nativePlace}</td>
            <td>${list.entryDate}</td>
        </tr>
    </c:forEach>
</table>
<a>导出Excel</a>
</body>
</html>
