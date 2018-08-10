<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>这是个成功页面</title>
    <script type="text/javascript" src=""></script>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/login" method="post">
    username:<input type="text" name="username"></br>
    password:<input type="text" name="password"></br>
    <button type="submit"/>
</form>
</body>
</html>
