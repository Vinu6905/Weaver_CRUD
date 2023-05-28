<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:form action="saveweaver" method="post" modelAttribute="weaver">
<center>
<h1>Enter The Weaver Details</h1>
Name:<input type="text" name="name"><br>
Mobile<input type="text" name="mobile"><br>
Salary:<input type="text" name="salary"><br>
No of Weaven:<input type="text" name="no_weaven"><br>
<button type="reset">RESET</button><button>SAVE</button>
</center>
</spring:form>
</body>
</html>