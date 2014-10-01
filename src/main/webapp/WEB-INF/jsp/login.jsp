<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <body>
    <c:if test="${!empty error}">
      <div><c:out value="${error}"/></div>
    </c:if>
    <form name="loginForm" action="<c:url value='/loginCheck.html'/>" method="post">
      <div style="text-align:center;width:500px;" >
        <div>用户：<input type="text" name="userName"></input></div>
	<div>密码：<input type="password" name="password"></input></div>
	<div><input type="submit" value="登录"/>
	     <input type="reset" value="重置"/>
      </div>
    </form>
  </body>
</html>
