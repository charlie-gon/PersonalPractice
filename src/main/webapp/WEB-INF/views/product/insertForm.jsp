<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="insertProduct" method="post">
아이디 <input name="product_id"><br>
제품명 <input name="product_name"><br>
가격 <input name="product_price"><br>
정보 <input name="product_info"><br>
날짜 <input type="date" name="product_date"><br>
회사 <input name="company"><br>
매니저id <input name="manager_id"><br>
<p>
<button>등록</button>
</form>
</body>
</html>