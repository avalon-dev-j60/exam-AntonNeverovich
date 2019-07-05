package server.services;

import server.core.AbstractService;
import server.models.Publication;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Stateless
public class PublicationService extends AbstractService<Publication> {

    @PersistenceContext(unitName = "exam-pu")
    EntityManager entityManager;

    public PublicationService() {
        super(Publication.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
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
