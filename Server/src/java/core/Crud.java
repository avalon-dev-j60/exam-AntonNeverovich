package core;

public interface Crud<E> {

    void create(E entity);

    void update(E entity);

    void delete(E entity);
}
