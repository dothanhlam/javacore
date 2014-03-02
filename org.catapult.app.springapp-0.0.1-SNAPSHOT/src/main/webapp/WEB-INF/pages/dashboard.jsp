<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Dashboard</title>
<link
	href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.css"
	rel="stylesheet" type="text/css" media="screen">
</head>
<body>
	<ul>
		<li><a href="<%=request.getContextPath()%>/security/changePassword">Change password</a></li>
		<li><a href="<%=request.getContextPath()%>/j_spring_security_logout">logout</a></li>

	</ul>
</body>
</html>