package ua.com.alevel.entity;

public class Watch extends AbstractEntity {

    private String name;
    private WatchShape shape;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WatchShape getShape() {
        return shape;
    }

    public void setShape(WatchShape shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Phone: {" +
                "id='" + getId() + '\'' +
                ", name='" + name + '\'' +
                ", color=" + shape +
                '}';
    }


}
