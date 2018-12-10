import java.util.Arrays;

public class SortingAlgorithms {

    public SortingAlgorithms() {
        //Noting to declare.
    }

    /**
     * This method will sort a given array
     *
     * @param unsortedList the values from this list
     * @return the lowest and highest value
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

        int[] lowHigh = new int[2];
        lowHigh[0] = unsortedList[0];
        lowHigh[1] = unsortedList[unsortedList.length - 1];

        return lowHigh;
    }

    /**
     * Search in the list for the lowest and the highest value
     *
     * @param unsortedList the values from this list
     * @return the lowest and highest value
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

    /**
     * Split the list until you have two or less items left, then return the lowest and highest value.
     *
     * @param list the values from this list
     * @param beginIndex the index where this method starts looking
     * @param listLength the length of the list
     * @return the lowest and highest value
     */
    public int[] recMinMax(int[] list, int beginIndex, int listLength) {
        if (listLength == 1) {
            return new int[]{list[beginIndex], list[beginIndex]};
        } else {
            int[] part1 = recMinMax(list, beginIndex, listLength / 2);
            int[] part2 = recMinMax(list, beginIndex + listLength / 2, listLength / 2);

            int[] newList = new int[2];

            if (part1[0] <= part2[0]) {
                newList[0] = part1[0];
            } else {
                newList[0] = part2[0];
            }

            if (part1[1] >= part2[1]) {
                newList[1] = part1[1];
            } else {
                newList[1] = part2[1];
            }

            return newList;
        }
    }
}
