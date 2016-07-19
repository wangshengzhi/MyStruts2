<%--
  Created by IntelliJ IDEA.
  User: wangshengzhi
  Date: 2016/7/19
  Time: 8:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <s:debug></s:debug>
    <s:property/><br/>
    <s:url value="/product/getProduct" var="url">
        <%--
        这个value可以直接来于值栈，自动进行ognl解析，如果之栈中有个属性值为productId
        则value="product串"。如果value中要使用字符链接
        --%>
        <s:param name="id" value="10001"></s:param>
    </s:url>
    <s:property value="#attr.url"></s:property>
    <br/>
<s:url action="exception" namespace="/exception" var="url1">

</s:url>
<s:property value="url1"></s:property>
</body>
</html>
