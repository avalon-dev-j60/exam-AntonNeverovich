<%@tag description="ОСновная страница" pageEncoding="UTF-8"%>
<%@taglib prefix="common" tagdir="/WEB-INF/tags/common/" %>

<%-- Заголовок страницы --%>
<%@attribute name="title" required="true"%>

<!DOCTYPE html>
<html>
<head>
    <title>${title}</title>
    <link href="${pageContext.servletContext.contextPath}/css/groundwork-setup.css"
          type="text/css"
          rel="stylesheet">
</head>
<body>

    <common:header/>

    <section class="three fourths centered padded justify">

        <jsp:doBody/>

    </section>
</body>
</html>