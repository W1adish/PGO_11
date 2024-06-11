import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Item2 {
    private int id;
    private String name;

    public Item2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("Item name: " + name);
    }

    @Override
    public String toString() {
        return "Item2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}