<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <div class="login_row login_row_text">
        <label id="login_lab_user" class="login_lab" >账号</label>
        <input  name="username" type="text" />
    </div>
    <div class="login_row login_row_text">
        <label id="login_lab_pwd" class="login_lab">密码</label>
        <input id="signpwd" class="itext" type="password" name="password" tabindex="2" autocomplete="off"
               placeholder="密码">
    </div>
    <div class="login_row">
        <input id="loginbut" type="submit" name="login_sub" value="登       录" tabindex="4">
    </div>

</form>

</body>
</html>
