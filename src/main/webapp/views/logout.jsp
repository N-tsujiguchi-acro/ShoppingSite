<%@page import="jp.co.aforce.servlet.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    // セッションを取得して破棄
   UserInfo username = (UserInfo) session.getAttribute("userName");
    if (session != null) {
        session.invalidate();
    }

    // ログインページにリダイレクト
    response.sendRedirect("login-in.jsp");
%>
</body>
</html>