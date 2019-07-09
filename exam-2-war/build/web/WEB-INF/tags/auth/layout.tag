<%@ attribute name="title" %>
<%@tag description="Личный кабинет" pageEncoding="UTF-8" %>
<%@ taglib prefix="auth" tagdir="/WEB-INF/tags/auth" %>

<!-- Заголовок страницы -->
<%@attribute name="layout" required="true" %>

<!DOCTYPE html>
<html>
<head>
    <title>${title}</title>
    <link href="${pageContext.servletContext.contextPath}/css/groundwork-setup.css"
          type="text/css"
          rel="stylesheet">
</head>
<body>

<auth:header/>

<section class="three fourths centered padded justify">

    <jsp:doBody/>

</section>
</body>
</html>