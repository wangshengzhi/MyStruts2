<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path=request.getContextPath();%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Document</title>
</head>
<body>
  <a href="<%=path%>/product/input.action">product input</a>
  <br/>
  <a href="<%=path%>/user/tologin.action">user tologin</a>
  <br/>
  <a href="<%=path%>/user/save.action">user save</a>
  <br/>
  <a href="<%=path%>/user/update.action">user update</a>
  <br/>
  <a href="<%=path%>/user/delete.action">user delete</a>
  <br/>
  <a href="<%=path%>/user/query.action">user query</a>
  <br/>
  <a href="<%=path%>/dynamic/dynamic!save.action">dynamic save</a>
  <br/>
  <a href="<%=path%>/dynamic/dynamic!update.action">dynamic update</a>
  <br/>
  <a href="<%=path%>/context/context.action?pname=pname">actionContext context</a>
  <br/>
  <a href="<%=path%>/aware/aware.action?pname=pname">actionContext aware</a>
  <br/>
  <a href="<%=path%>/ognl/teacherOgnl.action">Teacher ONGL</a>
  <br/>
  <a href="<%=path%>/tag/tag.action">Tag</a>
  <br/>
</body>
</html>