<%--
  Created by IntelliJ IDEA.
  User: wangshengzhi
  Date: 2016/7/15
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<%@taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<s:form action="/user/login.action" method="POST" >
    <s:textfield label="username" name="user.name"></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>
</body>
</html>
