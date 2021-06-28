import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewYearChaos {

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < q.size(); i++) {
            for (int j = i; j < q.size() - 1; j++) {
                int count = 1;
                if (q.get(i) > q.get(j + 1)) {
                    if(countMap.containsKey(q.get(i))){
                        countMap.replace(q.get(i), countMap.get(q.get(i)) + 1);
                    } else {
                        countMap.put(q.get(i), count);
                    }
                }
            }
        }

        boolean isPresent = countMap.values().stream().filter(integer -> integer > 2).findFirst().isPresent();

        if (isPresent) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(countMap.values().stream().mapToInt(Integer::intValue).sum());
        }

}
