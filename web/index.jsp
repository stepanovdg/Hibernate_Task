<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:forward page="QueryServlet"/>
<html>
  <head><title>Index</title></head>
<body><a href="${pageContext.request.contextPath}/QueryServlet">EmployeeList</a>
<a href="${pageContext.request.contextPath}/index.jsp">Back</a></body>
</html>