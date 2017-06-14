<%--
  Created by IntelliJ IDEA.
  User: hangyanjiang
  Date: 2017/6/14
  Time: 下午1:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:getAsString name="title" /></title>
</head>
<body>

    <tiles:insertAttribute name="body" />

    <br><br>

    <center>
        <tiles:insertAttribute name="footer" />
    </center>

</body>
</html>
