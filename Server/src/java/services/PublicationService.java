package services;

import core.AbstractService;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import models.Publication;

@Stateless 
public class PublicationService extends AbstractService<Publication>{

    @PersistenceContext(unitName = "ExamPU")
    EntityManager entityManager;
    
    @Override
    protected EntityManager getEntityManager() {
        return entityManager;   
    }
    
    public PublicationService() {
        super(Publication.class);
    }
    
    public Publication find(long id) {
        try {
            return entityManager.createNamedQuery("find-publication-by-id", Publication.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
}
