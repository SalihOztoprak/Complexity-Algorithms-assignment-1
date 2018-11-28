public class Main {
    private ListGenerator lG = new ListGenerator();
    private SortingAlgorithms sA = new SortingAlgorithms();

    public static void main(String[] args) {

        new Main().run();
    }

    private void run() {
        int[] list = lG.numberList(50000);
        assignment1(list);
        assignment2(list);
    }

    /**
     * This method will execute all the code for assignment 1
     * @param list the unsorted list.
     */
    private void assignment1(int[] list) {
        long startTime = startRecordingTime();
        list = sA.sortedMinMax(list);
        long endTime = endRecordingTime(startTime);
        System.out.println("------Assignment 1------ ");
        System.out.println("It took " + endTime + "ms to sort the list");
        System.out.println("The lowest value in the list is " + list[0] + " and the highest value is " + list[list.length - 1]+"\n");
    }

    /**
     * this method will execute all the code for assignment 2
     * @param list the unsorted list.
     */
    private void assignment2(int[] list) {
        long startTime = startRecordingTime();
        int[] newList = sA.seqMinMax(list);
        long endTime = endRecordingTime(startTime);
        System.out.println("------Assignment 2------ ");
        System.out.println("It took " + endTime + "ms to sort the list");
        System.out.println("The lowest value in the list is " + newList[0] + " and the highest value is " + newList[newList.length - 1]+"\n");
    }

    /**
     * This method will set the startTime
     *
     * @return the startTime
     */
    private long startRecordingTime() {
        return System.currentTimeMillis();
    }

    /**
     * This method will calculate the time between the startTime and endTime
     *
     * @param startTime the startTime
     * @return the time between the startTime and endTime in milliseconds
     */
    private long endRecordingTime(long startTime) {
        return System.currentTimeMillis() - startTime;
    }
}
