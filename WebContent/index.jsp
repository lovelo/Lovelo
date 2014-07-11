<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <title>Lovelo</title>
    <link rel="stylesheet" href="styles/styles.css" type="text/css" media="screen">
</head>
<body>
	<s:form action="loginUser">
			<s:textfield name="user.user" key="user" />
			<s:textfield name="user.password" key="password" />
			<s:submit/>
	</s:form>
</body>
</html>