package server.core;

import javax.persistence.EntityManager;

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

}
