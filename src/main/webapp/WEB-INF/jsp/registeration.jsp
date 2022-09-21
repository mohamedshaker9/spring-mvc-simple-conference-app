<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<style>
    .error{
        color: red;
    }

</style>
<body>

  <form:form modelAttribute="registeration">
      <form:errors path="*" cssClass="error" element="div" />
    <spring:message code="name" />: <form:input path="name" />
    <input type="submit" value=<spring:message code="save.changes" />>
  </form:form>
</body>
</html>
