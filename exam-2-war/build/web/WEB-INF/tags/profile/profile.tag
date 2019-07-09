<%@tag description="Личный кабинет" pageEncoding="UTF-8"%>
<%@attribute name="users" type="models.User"%>
<%@attribute name="publications" type="models.Publication"%>

<div class="left">
    <img alt="UserPic" src="${users.getProfile.getAvatarPath}" height="150" width="150"/>
    <p>
        ${users.getName} ${users.getSurname}
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
    
        <c:forEach items="${users.getPublications}" var="item">

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