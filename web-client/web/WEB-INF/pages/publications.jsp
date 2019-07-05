<%--
  Created by IntelliJ IDEA.
  User: antonneverovich
  Date: 2019-07-05
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/common"%>
<%@ taglib prefix="pubs" tagdir="/WEB-INF/tags/publications"%>


<common:layout title="Publications">

    <pubs:publicationList publications="${publications}"/>

</common:layout>