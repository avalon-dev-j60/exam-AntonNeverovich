package server.services;

import server.core.AbstractService;
import server.models.Profile;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProfileService extends AbstractService<Profile> {

    @PersistenceContext(unitName = "exam-pu")
    EntityManager entityManager;

    public ProfileService() { super(Profile.class); }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }





}
