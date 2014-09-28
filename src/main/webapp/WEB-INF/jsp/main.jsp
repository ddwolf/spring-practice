
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <body>
    <%=user.getUserName()%>, 欢迎您登录系统。您的积分是<%=user.getCredits()%>
  </body>
</html>
