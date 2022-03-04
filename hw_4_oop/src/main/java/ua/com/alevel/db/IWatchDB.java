package ua.com.alevel.db;

import ua.com.alevel.arraylist.ArrayList;
import ua.com.alevel.entity.Watch;

public interface IWatchDB {

    void create(Watch watch);
    void update(Watch watch);
    void delete(String id);
    Watch findById(String id);
    ArrayList<Watch> findAll();
}
