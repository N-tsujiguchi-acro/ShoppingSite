<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<h1>Book to Book</h1>
<p>ようこそ！こちらはログインページです！</p>
<form action="login-in" method="POST">
ID:<input type="text" name="id" required ><br>
PassWord:<input type="password" name="password" required>
<input type="submit" value="ログイン">
</form>

</body>
</html>