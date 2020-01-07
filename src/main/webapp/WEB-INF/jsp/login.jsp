<%-- <html>

<head>
<title>First Web Application</title>
</head>

<body>
	<font color="red">${errorMessage}</font>
	<form method="post">
		Name : <input type="text" name="name" />
		Password : <input type="password" name="password" /> 
		<input type="submit" />
	</form>
</body>

</html> --%>

<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">

	<font color="red">${errorMessage}</font>
	<form method="post">
		Name : <input type="text" name="name" />
		Password : <input type="password" name="password" /> 
		<input type="submit" />
	</form>
</div>

<%@ include file="common/footer.jspf" %>