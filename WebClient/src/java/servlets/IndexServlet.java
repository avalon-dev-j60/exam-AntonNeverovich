package servlets;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.PublicationService;

@WebServlet(urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
    
    private static final String JSP = "/WEB-INF/pages/index.jsp";
    
    @Inject
    PublicationService publicationService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("publications", publicationService.list());
        request.getRequestDispatcher(JSP).forward(request, response);
    }
    
    
    
    
    
}
