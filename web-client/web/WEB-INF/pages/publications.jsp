<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/common"%>
<%@ taglib prefix="pubs" tagdir="/WEB-INF/tags/publications"%>


<common:layout title="Publications">

    <pubs:publicationList publications="${publications}"/>

</common:layout>