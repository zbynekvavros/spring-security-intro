<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page
	import="org.springframework.security.core.context.SecurityContextHolder"%>

<div style="float: right">
	<a href="methods.jsp">Secured methods</a>
</div>

<div style="float: left">
	User :
	<%=SecurityContextHolder.getContext().getAuthentication().getName()%>
	<br /> Roles :
	<%=SecurityContextHolder.getContext().getAuthentication().getAuthorities()%>
	<br /> <br />

	<form action="<c:url value="/logout" />" method="post">
		<input type="submit" value="Log out" />
	</form>
</div>


