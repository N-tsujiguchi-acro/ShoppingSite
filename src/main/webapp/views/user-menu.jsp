<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー画面</title>
</head>
<body>
<%@ include file="globalMenu.jsp" %>
<div class="main">
	<%
	
	String username = (String) session.getAttribute("userName");
	
	%>
	<h2>ようこそ！<%=username %>さん</h2>
	<div class="button">
		<form action="edit.jsp" method="get" style="display: inline;">
		    <button type="submit">修正</button>
		</form>

		
		<form action="delete.jsp" method="post" style="display: inline;" onsubmit="return confirm('本当に削除しますか？') onsubmit="return confirm('本当に削除しますか？');;">
		    <input type="hidden" name="memberId" value="${memberId}">
		    <button type="submit">削除</button>
		</form>

		
		<form action="logout.jsp" method="get" style="display: inline;">
		    <button type="submit">ログアウト</button>
		</form>

	
	</div>


</div>
</body>
</html>