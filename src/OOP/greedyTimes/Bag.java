package OOP.greedyTimes;

import java.util.Map;

public class Bag {
    private Map <String,Integer> bag;

    public Bag(Map<String, Integer> bag) {
        this.bag = bag;
    }

    public Map<String, Integer> getBag() {
        return bag;
    }

    public void setBag(Map<String, Integer> bag) {
        this.bag = bag;
    }
}
