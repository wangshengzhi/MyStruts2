<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="sun.security.util.Length" %><%--
  Created by IntelliJ IDEA.
  User: wangshengzhi
  Date: 2016/7/18
  Time: 11:31
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
<s:debug></s:debug><br/>
<s:property value="v"></s:property>
product1: id:<s:property value="product.id"></s:property>&nbsp;
          name:<s:property value="product.name"></s:property>值栈中：
<%--从值栈中取值--%>
<s:property value="[0].product.name"></s:property><br/>
new prodcut：name:<s:property value="name"></s:property>&nbsp;<s:property value="id"></s:property><br/>
<%--[0]表示栈顶--%>
result: <s:property value="result"></s:property>值栈中：<s:property value="[0].result"></s:property>
<%--
#attr.productName按request，session，application的顺序从域中取值，使用#object.product的方式
如果指定从session中读取则用#session.object.product的形式
--%>
<br/>
Application:<s:property value="#application.applicationKey"></s:property><br/>
Session:<s:property value="#session.sessionKey"></s:property><br/>
Request:<s:property value="request.requestKey"></s:property><br/>
request->session->application->:<s:property value="#attr.sessionKey"></s:property><br/>
static field:<s:property value="@java.lang.Math@PI"></s:property><br/>
static method:<s:property value="@java.lang.Math@cos(0)"></s:property><br/>
<%--调用静态方法--%>
TeacherOnglAction static Method:<s:property value="@com.wsz.action.TeacherOgnlAction@test('hello ')"></s:property><br/>
<%--调用对象栈里的set方法--%>
<s:property value="setResult('status')"></s:property><br/>
<%
    String[] names={"王","盛","之",};
    request.setAttribute("names",names);
%>
names length: <s:property value="#attr.names.length"></s:property><br/>
names[1]:<s:property value="#attr.names[1]"></s:property><br/>
<%
    Map<String,String> letters=new HashMap<String,String>();
    letters.put("AA","aa");
    letters.put("BB","bb");
    request.setAttribute("letters",letters);
%>
Map size:<s:property value="#attr.letters,size"></s:property><br/>
Map Key AA:<s:property value="#attr.letters['AA']"></s:property><br/>
</body>
</html>















