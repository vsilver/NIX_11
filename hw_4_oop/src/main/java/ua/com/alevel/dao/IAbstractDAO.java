package ua.com.alevel.dao;

import ua.com.alevel.arraylist.ArrayList;
import ua.com.alevel.entity.AbstractEntity;

public interface IAbstractDAO <E extends AbstractEntity> {
    void create(E entity);

    void update(E entity);

    void delete(String id);

    E findById(String id);

    ArrayList<E> findAll();
}
