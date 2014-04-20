package Task7;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vipmax on 14.04.2014.
 */
public class Task7 {


    public Task7() {

        new Task7Form(this);
    }

    public Map<Integer, Double> summ(Map<Integer, Double> map1, Map<Integer, Double> map2) {
        Map<Integer, Double> resultMap = new HashMap<>();

        if (map2.size() < map1.size()) {
            for (int i = map2.size(); i < map1.size(); i++) {
                map2.put(i, 0.0);
            }
        }

        if (map1.size() < map2.size()) {
            for (int i = map1.size(); i < map2.size(); i++) {
                map1.put(i, 0.0);
            }
        }

        for (int i = 0; i < map1.size(); i++) {
            resultMap.put(i, map1.get(i) + map2.get(i));
        }

        return resultMap;
    }
}
