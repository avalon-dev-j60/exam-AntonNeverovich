package servlets;

import beans.AuthenticationService;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.ProfileService;

@WebServlet(urlPatterns = "/profile")
public class ProfileServlet extends HttpServlet {

    @Inject
    ProfileService profileService;
    AuthenticationService authenticationService;

    private static final String URL = "/WEB-INF/pages/profile.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(URL).forward(request, response);
    }
}
