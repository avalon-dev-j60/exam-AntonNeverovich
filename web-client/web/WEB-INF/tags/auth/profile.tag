<%@tag description="Личный кабинет" pageEncoding="UTF-8" %>

<!-- Заголовок страницы -->
<%@attribute name="Profile" required="true" %>

<div class="left-one padded">

    <img width="100" height="100"
         src="${pageContext.servletContext.contextPath}/images/avatar.jpg"
         alt="avatar">


    <p class="left padded">
        ${profile.user.name}
    </p>

</div>

<div>

</div>