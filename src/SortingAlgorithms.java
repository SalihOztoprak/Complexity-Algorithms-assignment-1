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
}
