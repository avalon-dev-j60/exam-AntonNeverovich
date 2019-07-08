package client.servlets;

import client.beans.AuthenticationService;
import server.core.AbstractService;
import server.models.Profile;
import server.services.ProfileService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
