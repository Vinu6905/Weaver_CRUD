<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
       <%@ taglib prefix="v" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter The Details to Update</h1>

<v:form action="updateweaver" method="post" modelAttribute="weaver">
Id:<v:input type="text" path="id" readonly="readonly" /><br>
Name:<v:input type="text" path="name"/><br>
Id:<v:input type="text" path="mobile"/><br>
Id:<v:input type="text" path="salary"/><br>
Id:<v:input type="text" path="no_weaven"/><br>
<button type="reset">RESET</button><button>UPDATE</button>

</v:form>
</body>
</html>