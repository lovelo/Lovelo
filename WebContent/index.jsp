<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <title>SaleService</title>
    <link rel="stylesheet" href="styles/styles.css" type="text/css" media="screen">
</head>
<body>
	<s:form action="insertUser">
<%-- 		<s:push value="user"> --%>
			<s:textfield name="user.user" label="Usuário" />
			<s:textfield name="user.password" label="Password" />
			<s:submit/>
<%-- 		</s:push>		 --%>
	</s:form>
</body>
</html>