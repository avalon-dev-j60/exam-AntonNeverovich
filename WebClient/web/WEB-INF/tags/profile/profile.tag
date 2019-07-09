<%@tag description="Личный кабинет" pageEncoding="UTF-8"%>
<%@attribute name="user" required="true" type="models.User"%>
<%@attribute name="publications" required="true" type="models.Publication"%>

<div class="left">
    <img alt="UserPic" src="${user.getProfile.getAvatarPath}" height="150" width="150"/>
    <p>
        ${user.getName} ${user.getSurname}
    </p>
</div>
    
<div>
    <c:choose>

    <c:when test="${publications.isEmpty()}">

        <p>
            There is no publications yet!
        </p>

    </c:when>

    <c:otherwise>
    
        <c:forEach items="${user.getPublications}" var="item">

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
                
</div>