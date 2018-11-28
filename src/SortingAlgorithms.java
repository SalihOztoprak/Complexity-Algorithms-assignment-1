import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SortingAlgorithms {

    public SortingAlgorithms() {
        //Noting to declare.
    }

    /**
     * This method will sort a given array
     *
     * @param unsortedList the list that you want to sort
     * @return the sorted list
     */
    public int[] sortedMinMax(int[] unsortedList) {
        for (int i = 0; i < unsortedList.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < unsortedList.length; j++) {
                if (unsortedList[j] < unsortedList[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = unsortedList[i];
            unsortedList[i] = unsortedList[minIndex];
            unsortedList[minIndex] = temp;
        }
        return unsortedList;
    }

    public int[] recMinMax(int[] list){
        if (list.length <= 2){
            return list;
        } else {
            int splitNumber = list.length/2;
            int[] list1 = new int[splitNumber];
            int[] list2 = new int[list.length - splitNumber];

            for (int i = 0; i < list.length/2; i++) {
                list1[i] = list[i];
                list2[i] = list[i+splitNumber];
            }

            int[] part1 = recMinMax(list1);
            int[] part2 = recMinMax(list2);

            int[] merge = new int[part1.length + part2.length];
            System.arraycopy(part1, 0, merge, 0, part1.length);
            System.arraycopy(part2, 0, merge, part1.length, part2.length);

            Arrays.sort(merge);

            return new int[]{merge[0],merge[merge.length-1]};
        }
    }
}
