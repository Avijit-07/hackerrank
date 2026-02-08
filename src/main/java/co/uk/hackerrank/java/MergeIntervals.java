package co.uk.hackerrank.java;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        if(intervals.length != 0) {
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

            List<int[]> mergedList = new ArrayList<>();

            mergedList.add(intervals[0]);

            for(int i = 1; i < intervals.length ; i++) {

                int[] currentInterval = intervals[i];

                int[] lastMerged = mergedList.get(mergedList.size() - 1);

                if (currentInterval[0] <= lastMerged[1]) {
                    lastMerged[1] = Math.max(currentInterval[1], lastMerged[1]);
                } else {
                    mergedList.add(currentInterval);
                }
            }
            return mergedList.toArray(new int[mergedList.size()][]);
        } else {
            return new int[0][];
        }
    }

    public static void main(String[] args) {
        merge(new int[][]{{1,3}, {8,10}, {2,6}});
    }
}
