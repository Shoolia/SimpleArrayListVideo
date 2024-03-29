package simpleList.model.entity;

public interface Simple<E> extends Iterable {
    boolean add (E e);
    void delete(int index);
    E get (int index);
    int size();
    void update(int index, E e);
}