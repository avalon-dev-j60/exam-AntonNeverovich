<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@tag description="Страница со списком публикаций" pageEncoding="UTF-8" %>

<%@attribute name="publications" required="true" %>

<c:choose>

    <c:when test="${publications.isEmpty()}">
        <p>
            There is no publications!
        </p>

    </c:when>

    <c:otherwise>

        <c:forEach items="${publications}" var="item">

            <p>
            <h3>
                <a href="${pageContext.servletContext.contextPath}/publications?id=${item.id}">
                        ${item.title}
                </a>
            </h3>
            ${item.content.substring(0, 256)}...
            </p>

        </c:forEach>

    </c:otherwise>




</c:choose>

