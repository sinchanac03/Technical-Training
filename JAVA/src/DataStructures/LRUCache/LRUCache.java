package DataStructures.LRUCache;

import java.util.*;

class LRUCache {

    private LinkedHashMap<Integer, Integer> map;
    private int capacity;

    // constructor
    LRUCache(int capacity) {

        this.capacity = capacity;

        // true → access order maintained
        map = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    // GET
    public int get(int key) {

        // if not present
        if (!map.containsKey(key)) {
            return -1;
        }

        // this makes it recently used
        return map.get(key);
    }

    // PUT
    public void put(int key, int value) {

        map.put(key, value);

        // if capacity exceeded → remove oldest
        if (map.size() > capacity) {

            int firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
        }
    }

    // DISPLAY
    public void display() {
        System.out.println(map);
    }
}

// DRIVER
class LRUDriver {
    public static void main(String[] args) {

        LRUCache cache = new LRUCache(3);

        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);

        cache.get(1); // makes 1 recent

        cache.put(4, 40); // removes 2

        cache.display();
    }
}