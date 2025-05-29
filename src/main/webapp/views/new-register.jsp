<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録画面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/style.css">
</head>
<body>
  <h2 class="register-title">会員登録フォーム</h2>
    <div class="container">
    <form action="submit.jsp" method="post">
        <table class="register-table">
            <tr>
                <td>会員ID (MEMBER_ID):</td>
                <td><input type="text" name="member_id" minlength="7" maxlength="10" required></td>
            </tr>
            <tr>
                <td>パスワード (PASSWORD):</td>
                <td><input type="password" name="password" minlength="7" maxlength="32" required></td>
            </tr>
            <tr>
                <td>姓 (LAST_NAME):</td>
                <td><input type="text" name="last_name" maxlength="32" required></td>
            </tr>
            <tr>
                <td>名 (FIRST_NAME):</td>
                <td><input type="text" name="first_name" maxlength="32" required></td>
            </tr>
            <tr>
                <td>住所 (ADDRESS):</td>
                <td><input type="text" name="address" maxlength="128" required></td>
            </tr>
            <tr>
                <td>メールアドレス (MAIL_ADDRESS):</td>
                <td><input type="email" name="mail_address" maxlength="128" required></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center;">
                    <input type="submit" value="登録確認画面へ" class="register-submit-button">
                </td>
            </tr>
        </table>
    </form>

    <a href="login-in.jsp" class="back-to-login">ログイン画面へ戻る</a>
</div>

</body>
</html>