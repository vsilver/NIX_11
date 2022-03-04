package ua.com.alevel.service;

import ua.com.alevel.arraylist.ArrayList;
import ua.com.alevel.dao.WatchDaoImpl;
import ua.com.alevel.entity.Watch;

public class WatchService {
    private final WatchDaoImpl watchDao = new WatchDaoImpl();

    public void create(Watch watch) {
        watchDao.create(watch);
    }

    private boolean checkExistId(String id) {
        if (findById(id) == null) {
            System.out.println("Watch with such id doesn't exist!!!");
            return false;
        }
        return true;
    }

    public void update(Watch watch) {
        if (checkExistId(watch.getId())) {
            watchDao.update(watch);
        }
    }

    public void delete(String id) {
        if (checkExistId(id)) {
            watchDao.delete(id);
        }
    }

    public Watch findById(String id) {
        return watchDao.findById(id);
    }

    public ArrayList<Watch> findAll() {
        return watchDao.findAll();
    }
}
