package beans;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

@Stateless
public class AuthenticationService {

    @Inject
    HttpSession session;

    public boolean isAuth() {
        Boolean auth = (Boolean) session.getAttribute("auth");
        return auth != null && auth;
    }

    public void setAuth(boolean isAuth) {
        session.setAttribute("auth", isAuth);
    }
}


