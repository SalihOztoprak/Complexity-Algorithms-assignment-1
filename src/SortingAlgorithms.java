
import java.util.Arrays;

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

    /**
     * Search in the list for the lowest and the highest value
     *
     * @param unsortedList the list.
     */
    public int[] seqMinMax(int[] unsortedList) {
        int min = unsortedList[0];
        int max = unsortedList[0];
        int[] list = new int[2];

        for (int i = 0; i < unsortedList.length; i++) {
            if (unsortedList[i] < min) {
                min = unsortedList[i];
            }
            if (unsortedList[i] > max) {
                max = unsortedList[i];
            }
        }

        list[0] = min;
        list[1] = max;
        return list;
    }

    public int[] recMinMax(int[] list) {
        if (list.length < 2) {
            return list;
        } else {
            int splitNumber = list.length / 2;
            int[] list1 = new int[splitNumber];
            int[] list2 = new int[list.length - splitNumber];

            System.arraycopy(list, 0, list1, 0, list1.length);
            System.arraycopy(list, list1.length, list2, 0, list2.length);

            int[] part1 = recMinMax(list1);
            int[] part2 = recMinMax(list2);

            int[] merge = new int[part1.length + part2.length];
            System.arraycopy(part1, 0, merge, 0, part1.length);
            System.arraycopy(part2, 0, merge, part1.length, part2.length);

            Arrays.sort(merge);

            return new int[]{merge[0], merge[merge.length - 1]};
        }
    }
}
