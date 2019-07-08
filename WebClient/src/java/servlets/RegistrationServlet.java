package servlets;

import beans.AuthenticationService;
import java.io.IOException;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Credentials;
import models.User;
import services.UserService;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/registration" )
public class RegistrationServlet extends HttpServlet {
    
    private static final String JSP = "/WEB-INF/pages/registration.jsp";
    
    @Inject 
    AuthenticationService authenticationService;
    
    @EJB
    UserService userService;
    
    private void redirect(HttpServletRequest request, HttpServletResponse response, String location) throws ServletException, IOException {
        response.setHeader("Location", location);
        response.setStatus(302);
    }
    
    private void validateParameters(String login, String password, String confirmation) {
        if (login == null || login.trim().isEmpty()) {
            throw new IllegalStateException("Login is required");
        }
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalStateException("Pasword is required");
        }
        if (confirmation == null || confirmation.trim().isEmpty()) {
            throw new IllegalStateException("Password confirmation is required");
        }
        if (password.equals(confirmation)) {
            throw new IllegalStateException("Password does not matched");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                   throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String confirmation = request.getParameter("confirmation");

        try {
            validateParameters(login, password, confirmation);
            Credentials credentials = new Credentials(login, password);
            User user = new User(login, credentials);
            userService.create(user);
            redirect(request, response, request.getContextPath() + "/login");
        } catch (IllegalStateException e) {
            request.setAttribute("exception", e);
            doGet(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                   throws ServletException, IOException {
        if (authenticationService.isAuth()) {
            String referer = request.getHeader("Referer");
            if (referer == null) {
                referer = request.getContextPath();
            }
            redirect(request, response, referer);
        } else {
            request.getRequestDispatcher(JSP).forward(request, response);
        }
    }
    
}
