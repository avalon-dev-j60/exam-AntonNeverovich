package client.servlets;

import server.services.PublicationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/publications")
public class IndexServlet extends HttpServlet {

    private static final String JSP = "/WEB-INF/pages/publications.jsp";
    PublicationService publicationService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("publications", publicationService.list());
        request.getRequestDispatcher(JSP).forward(request, response);
    }
}
