<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
  <body>
  <c:out value="${user.userName}"></c:out>, 欢迎您登录系统。您的积分是<c:out value="${user.credits}"></c:out>
  </body>
</html>
