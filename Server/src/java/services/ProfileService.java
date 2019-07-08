package services;

import core.AbstractService;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.Profile;

@Stateless
public class ProfileService extends AbstractService<Profile> {
    
    @PersistenceContext(unitName = "ExamPU")
    EntityManager entityManager;
    
    public ProfileService() { super(Profile.class); }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
