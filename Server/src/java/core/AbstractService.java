package core;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public abstract class AbstractService<E> implements Crud<E> {

    private final Class<E> eClass;

    public AbstractService(Class<E> eClass) {
        this.eClass = eClass;
    }

    protected abstract EntityManager getEntityManager();

    @Override
    public void create(E entity) {
        getEntityManager().persist(entity);
    }

    @Override
    public void update(E entity) {
        getEntityManager().merge(entity);
    }

    @Override
    public void delete(E entity) {
        getEntityManager().detach(entity);
    }
    
        public List<E> list() {
        try {
            EntityManager entityManager = getEntityManager();
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<E> query = builder.createQuery(eClass);
            Root<E> root = query.from(eClass);
            query.select(root);
            return entityManager.createQuery(query).getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }

    }
}
