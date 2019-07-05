<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 23.06.2019
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/common"%>
<%@ taglib prefix="pubs" tagdir="/WEB-INF/tags/publications"%>

<common:layout title="Exam Web Application">

    <pubs:publicationList publications="${publications}"/>

</common:layout>

<%--<% request.getRequestDispatcher("/publications").forward(request, response); %>--%>
<%--<jsp:forward page="${pageContext.servletContext.contextPath}/publications"/>--%>