<%-- <html>

<head>
<title>First Web Application</title>
</head>

<body>
	Welcome ${name}!! <a href="/list-todos">Click here</a> to manage your todo's.
</body>

</html> --%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	Welcome ${name}!! <a href="/list-todos">Click here</a> to manage your
	todo's.
</div>
<%@ include file="common/footer.jspf"%>