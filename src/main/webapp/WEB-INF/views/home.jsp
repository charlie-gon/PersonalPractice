<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="getProductList">상품조회</a>
<a href="insertProduct">상품등록</a>
<a href="https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=58af8a9c9bccab47b5c2ac1720573dc8&redirect_uri=http://localhost/temp/callback

">카카오 로그인</a>
</body>
</html>
