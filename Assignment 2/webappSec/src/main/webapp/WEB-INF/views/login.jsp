<%@page contentType = "text/html;charset = UTF-8" language = "java" %>

<%@page isELIgnored = "false" %>



<html>
<head>
<title>Yahoo!!</title>
</head>
<body>





<small><font color="red">${errorMessage}</font></small>
	<form action="/login.do" method="POST">
		Name : <input name="name" type="text" /> Password : <input name="password" type="password" /> 
		Email : <input name="email" type="text" /><input type="submit" />
	</form>


</body>
</html>