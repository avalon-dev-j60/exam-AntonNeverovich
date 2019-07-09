package services;

import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.Publication;

@Stateless
public class PublicationFacade extends AbstractFacade<Publication> {
    @PersistenceContext(unitName = "exam-2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PublicationFacade() {
        super(Publication.class);
    }
    
    public Publication find(long id) {
        try {
            return em.createNamedQuery("find-publication-by-id", Publication.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

        
}
