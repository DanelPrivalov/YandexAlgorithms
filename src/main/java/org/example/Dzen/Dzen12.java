package org.example.Dzen;

import java.util.*;

//56
public class Dzen12 {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,9},{2,5},{19,20},{10,11},{12,20},{0,3},{0,1},{0,2}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> result = new LinkedList<>();
        for(int i = 0; i<intervals.length; i++) {
            if (result.isEmpty() || result.getLast()[1] < intervals[i][0]) {
                result.add(intervals[i]);
            } else {
                result.getLast()[1] = Math.max(result.getLast()[1], intervals[i][1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
