package services;

import core.AbstractService;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import models.User;

@Stateless(name = "UserService")
public class UserService extends AbstractService<User> implements UserServiceLocal {

    @PersistenceContext(unitName = "ExamPU")
    EntityManager entityManager;
    
    public UserService() {
        super(User.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
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
       
}
