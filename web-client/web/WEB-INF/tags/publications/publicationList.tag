<%@ tag description="Страница со списком публикаций" pageEncoding="UTF-8" %>

<%@attribute name="publications" required="true" type="java.util.List<server.models.Publication>" %>

<c:choose>

    <c:when test="${publications.isEmpty()}">

        <p>
            There is no publications!
        </p>

    </c:when>

    <c:otherwise>

        <c:forEach items="${publications}" var="item">

            <div>

                <h3>
                    <a href="${pageContext.servletContext.contextPath}/publications?id=${item.id}">
                       ${item.title}
                    </a>
                </h3>

                <p>
                   ${item.content.substring(0, 256)}...
                </p>

            </div>

        </c:forEach>

    </c:otherwise>




</c:choose>

