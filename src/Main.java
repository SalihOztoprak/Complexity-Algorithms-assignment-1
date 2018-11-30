public class Main {
    private ListGenerator lG = new ListGenerator();
    private SortingAlgorithms sA = new SortingAlgorithms();

    public static void main(String[] args) {

        new Main().run();
    }

    private void run() {
        final int[] list = lG.numberList(100);
        assignment1(list);
        assignment2(list);
        assignment3(list);
    }


    /**
     * This method will execute all the code for assignment 1
     */
    private void assignment1(int[] list) {
        int[] nList = new int[list.length];
        System.arraycopy(list, 0, nList, 0, list.length);

        long startTime = startRecordingTime();
        nList = sA.sortedMinMax(nList);
        long totalTime = endRecordingTime(startTime);
        System.out.println("------Assignment 1------ ");
        System.out.println("It took " + totalTime + "ms to sort the list");
        System.out.println("The lowest value in the list is " + nList[0] + " and the highest value is " + nList[list.length - 1] + "\n");
    }

    /**
     * this method will execute all the code for assignment 2
     *
     * @param list
     */
    private void assignment2(int[] list) {
        int[] nList = new int[list.length];
        System.arraycopy(list, 0, nList, 0, list.length);

        long startTime = startRecordingTime();
        nList = sA.seqMinMax(nList);
        long totalTime = endRecordingTime(startTime);
        System.out.println("------Assignment 2------ ");
        System.out.println("It took " + totalTime + "ms to sort the list");
        System.out.println("The lowest value in the list is " + nList[0] + " and the highest value is " + nList[nList.length - 1] + "\n");
    }

    private void assignment3(int[] list) {
        int[] nList = new int[list.length];
        System.arraycopy(list, 0, nList, 0, list.length);

        long startTime = startRecordingTime();
        nList = sA.recMinMax(nList);
        long totalTime = endRecordingTime(startTime);
        System.out.println("------Assignment 3------ ");
        System.out.println("It took " + totalTime + "ms to sort the list");
        System.out.println("The lowest value in the list is " + nList[0] + " and the highest value is " + nList[nList.length - 1] + "\n");

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
