package ua.com.alevel.db;

import ua.com.alevel.arraylist.ArrayList;
import ua.com.alevel.entity.Watch;
import ua.com.alevel.idgenerator.GeneratorID;

public class WatchArrayListDB implements IWatchDB {

    private static WatchArrayListDB instance;
    private final ArrayList<Watch> watches = new ArrayList<>();

    private WatchArrayListDB(){}

    public static WatchArrayListDB getInstance()
    {
        if (instance == null)
            instance = new WatchArrayListDB();

        return instance;
    }

    @Override
    public void create(Watch watch) {
        watches.setId(GeneratorID.createID());

    }

    @Override
    public void update(Watch watch) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Watch findById(String id) {
        return null;
    }

    @Override
    public ArrayList<Watch> findAll() {
        return null;
    }
}
