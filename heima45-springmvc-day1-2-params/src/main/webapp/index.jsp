<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试springMVC中的参数封装</title>
</head>
<body>
<h4>数据封装--基本数据类型</h4>
<form action="${pageContext.request.contextPath}/addAccount" method="post">
用户名：<input name="username"><br/>
年龄：<input name="age"><br/>
生日：<input name="birthday"><br/>
<input type="submit" value="提交">
</form>
</br></br>
<h4>数据封装--封装java实体类对象</h4>
<form action="${pageContext.request.contextPath}/updateAccount" method="post">
用户名：<input name="username"><br/>
年龄：<input name="age"><br/>
<input type="submit" value="提交">

</form>
<h4>数据封装--封装List集合</h4>
<form action="${pageContext.request.contextPath}/updateAccount1" method="post">
地址一的国家名称：<input name="list[0].country"><br/>
地址一的城市名称：<input name="list[0].city"><br/>
地址二的国家名称：<input name="list[1].country"><br/>
地址二的城市名称：<input name="list[1].city"><br/>

<br>
key为one的地址的国家名称:<input name="map['one'].country"><br/>
key为one的地址的城市名称:<input name="map['one'].city"><br/>
key为two的地址的国家名称:<input name="map['two'].country"><br/>
key为two的地址的城市名称:<input name="map['two'].city"><br/>
<input type="submit" value="提交">


</form>


</body>
</html>