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
     * @param unsortedList the list.
     */
    public int[] seqMinMax(int[] unsortedList){
        int min = unsortedList[0];
        int max = unsortedList[0];
        int [] list = new int[2];

        for (int i = 0; i <unsortedList.length ; i++) {
            if(unsortedList[i]<min){
                min = unsortedList[i];
            }
            if (unsortedList[i]>max){
                max = unsortedList[i];
            }
        }


        list[0]= min;
        list[1]= max;
        return list;
    }
}
