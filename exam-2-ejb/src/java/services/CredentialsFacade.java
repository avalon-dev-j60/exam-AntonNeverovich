package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Credentials;

@Stateless
public class CredentialsFacade extends AbstractFacade<Credentials> {
    @PersistenceContext(unitName = "exam-2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CredentialsFacade() {
        super(Credentials.class);
    }
    
}
