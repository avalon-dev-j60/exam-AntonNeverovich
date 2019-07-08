<%@tag description="Header" pageEncoding="UTF-8" %>

<header class="three fourths centered padded">

    <a href="${pageContext.servletContext.contextPath}">
        HOME
    </a>

    <div class="pull-right">

        <a href="${pageContext.servletContext.contextPath}/profile"
           class="padded">
            $USERNAME$
        </a>

        <a href="${pageContext.servletContext.contextPath}/login"
           class="padded">
            LOG OUT
        </a>

    </div>
</header>