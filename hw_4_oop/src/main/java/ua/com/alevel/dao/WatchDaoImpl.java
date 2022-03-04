package ua.com.alevel.dao;

import ua.com.alevel.arraylist.ArrayList;
import ua.com.alevel.db.WatchArrayListDB;
import ua.com.alevel.entity.Watch;

public class WatchDaoImpl implements IWatchDAO{

    private final WatchArrayListDB watchArrayListDB = WatchArrayListDB.getInstance();

    @Override
    public void create(Watch entity) {
        watchArrayListDB.create(entity);
    }

    @Override
    public void update(Watch entity) {
        watchArrayListDB.update(entity);
    }

    @Override
    public void delete(String id) {
        watchArrayListDB.delete(id);
    }

    @Override
    public Watch findById(String id) {
        return watchArrayListDB.findById(id);
    }

    @Override
    public ArrayList<Watch> findAll() {
        return watchArrayListDB.findAll();
    }
}
