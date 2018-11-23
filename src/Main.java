import java.util.Arrays;

public class Main {
    private NumberGenerator numberGenerator = new NumberGenerator();
    public static void main(String[] args) {

       new Main().run();

    }

    public void run() {
        int[] list = {1, 5, 8, 2, 73, 52, 13, 67};
        System.out.println(Arrays.toString(list));
        list = sortedMinMax(list);
        System.out.println(Arrays.toString(list));
    }

    /**
     * This method will sort a given array
     *
     * @param unsortedList the list that you want to sort
     * @return the sorted list
     */
    private int[] sortedMinMax(int[] unsortedList) {
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
