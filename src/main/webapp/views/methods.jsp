<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form action="<c:url value="/foo" />" method="post">
    <input type="submit" name="userRequired" value="hasAuthority('ROLE_USER')" />
    <input type="submit" name="godRequired" value="hasAuthority('ROLE_GOD')" />
</form>
