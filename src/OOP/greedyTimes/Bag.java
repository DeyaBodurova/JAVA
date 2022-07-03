package OOP.greedyTimes;

import java.util.Map;

public class Bag {
    private Map <String,Integer> bag;
    private int capacity;

    public Bag(Map<String, Integer> bag, int capacity) {
        this.bag = bag;
        this.capacity = capacity;
    }

    public Map<String, Integer> getBag() {
        return bag;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setBag(Map<String, Integer> bag) {
        this.bag = bag;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
