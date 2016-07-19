<%--
  Created by IntelliJ IDEA.
  User: wangshengzhi
  Date: 2016/7/14
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<% String path=request.getContextPath();%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <form action="<%=path%>/product/save.action" method="post">
        name:<input type="text" name="product.name" />
        <input type="submit" value="保存"/>
    </form>
</body>
</html>

