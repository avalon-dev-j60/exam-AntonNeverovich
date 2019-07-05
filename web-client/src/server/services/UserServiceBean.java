package server.services;

import server.core.AbstractService;
import server.models.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Stateless(name = "UserServiceBean")
public class UserServiceBean extends AbstractService<User> implements UserServiceLocal {

    @PersistenceContext(unitName = "corfin-pu")
    EntityManager entityManager;

    public UserServiceBean() {
        super(User.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }

    @Override
    public void create(User entity) {
        super.create(entity);
    }

    @Override
    public void update(User entity) {
        super.update(entity);
    }

    @Override
    public void delete(User entity) {
        super.delete(entity);
    }

    @Override
    public User find(String email) {
        try {
            return entityManager.createNamedQuery("wer", User.class)
                    .setParameter("email", email)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }

    }
}
