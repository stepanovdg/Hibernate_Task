<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
     <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ie.css" type="text/css" media="screen"/>
    <title>Employee jsp page</title>
</head>
<body>
      <table border="1" cellspacing=3 align="center">
    <TR>
        <TH>Employee Name</TH>
        <TH>Employee LastName</TH>
        <TH>Employee Address</TH>
        <TH>Company Name</TH>
        <TH>Company City</TH>
        <TH>Company Country</TH>
        <TH>Office size</TH>
        <TH>Employee position</TH>
    </TR>
    <c:forEach items="${requestScope.list}" var="tabl">
        <tr>
            <td align="center"><c:out value="${tabl.getEmpName()}"/></td>
            <td align="center"><c:out value="${tabl.getEmpLastName()}"/></td>
            <td align="center"><c:out value="${tabl.getAdrName()}"/></td>
            <td align="center"><c:out value="${tabl.getCompName()}"/></td>
            <td align="center"><c:out value="${tabl.getCityName()}"/></td>
            <td align="center"><c:out value="${tabl.getCountryName()}"/></td>
            <td align="center"><c:out value="${tabl.getContain() }"/></td>
            <td align="center"><c:out value="${tabl.getPos()}"/></td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/QueryServlet">EmployeeList</a>
<a href="${pageContext.request.contextPath}/index.jsp">Back</a>
</body>
</html>