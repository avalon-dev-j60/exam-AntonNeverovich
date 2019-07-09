package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Profile;

@Stateless
public class ProfileFacade extends AbstractFacade<Profile> {
    @PersistenceContext(unitName = "exam-2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProfileFacade() {
        super(Profile.class);
    }
    
}
