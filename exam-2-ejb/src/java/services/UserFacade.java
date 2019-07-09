package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import model.User;

@Stateless
public class UserFacade extends AbstractFacade<User> {
    @PersistenceContext(unitName = "exam-2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
    
    public User find(String email) {
        try {
            return em.createNamedQuery("wer", User.class)
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
    public void edit(User entity) {
        super.edit(entity);
    }

    @Override
    public void remove(User entity) {
        super.remove(entity);
    }
    
}
