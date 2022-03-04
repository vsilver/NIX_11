package ua.com.alevel.db;

import ua.com.alevel.arraylist.ArrayList;
import ua.com.alevel.entity.Watch;
import ua.com.alevel.idgenerator.GeneratorID;

public class WatchArrayListDB implements IWatchDB {

    private static WatchArrayListDB instance;
    private final ArrayList<Watch> watches = new ArrayList<>();

    private WatchArrayListDB(){}

    public static WatchArrayListDB getInstance() {
        if (instance == null){
            instance = new WatchArrayListDB();
        }
        return instance;
    }

    @Override
    public void create(Watch watch) {
        watch.setId(GeneratorID.createID());
        watches.add(watch);

    }

    @Override
    public void update(Watch watch) {
        Watch watch1 = findById(watch.getId());
        watch1.setName(watch.getName());
        watch1.setShape(watch.getShape());
    }

    @Override
    public void delete(String id) {
        watches.remove(findById(id));
    }

    @Override
    public Watch findById(String id) {
        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getId().equals(id))
            {
                return watches.get(i);
            }
        }
        return null;
    }

    @Override
    public ArrayList<Watch> findAll() {
        return watches;
    }
}
