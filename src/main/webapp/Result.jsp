<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix = "v" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<body>
<h1>${msg }</h1>
<h1>Weaver Details</h1>
<br><br>
<table border="2">
<tr>
<td>Id</td>
<td>Name</td>
<td>Mobile</td>
<td>Salary</td>
<td>no_Weaven</td>
</tr>

<v:forEach var="wev" items="${list }" >
<tr>	
<td>${wev.getId()}</td>
<td>${wev.getName()}</td>
<td>${wev.getMobile() }</td>
<td>${wev.getSalary() }</td>
<td>${wev.getNo_weaven()}</td>
<td><a href="edit?id=${wev.getId() }"><button>Edit</button></a></td>
<td><a href="delete?id=${wev.getId() }"><button>Delete</button></a></td>

</tr>
</v:forEach>
</table>
</center>
</body>
</html>