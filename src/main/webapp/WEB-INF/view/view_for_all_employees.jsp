<%--
  Created by IntelliJ IDEA.
  User: isafronov_at
  Date: 14.07.2025
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>view_for_all_employees</title>
</head>
<body>

<br><h3>Информация доступная всем работникам</h3><br>
<br><input type="button" value="Зарплата" onclick="window.location.href='${pageContext.request.contextPath}/hr_info'"> Только для работников hr <br>
<br><input type="button" value="Нагрузка" onclick="window.location.href='${pageContext.request.contextPath}/manager_info'"> Только для менеджеров <br>


</body>
</html>
