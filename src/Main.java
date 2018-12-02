public class Main {
    private ListGenerator lG = new ListGenerator();
    private SortingAlgorithms sA = new SortingAlgorithms();

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        runallAssignments(5000, 10);
        runallAssignments(10000, 10);
        runallAssignments(50000, 10);
        runallAssignments(100000, 10);
        runallAssignments(500000, 10);
        runallAssignments(1000000, 10);
        runallAssignments(5000000, 10);
        runallAssignments(10000000, 10);
        runallAssignments(50000000, 10);
        runallAssignments(100000000, 10);
    }

    private void runallAssignments(int size, int times) {
        System.out.println("Size: " + size);
        final int[] list = lG.numberList(size);
        for (int i = 0; i < times; i++) {
            System.out.println("Round: " + times+1);
            assignment1(list);
            assignment2(list);
            assignment3(list);
        }
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
        System.out.println("It took " + totalTime + "ns to find the lowest and highest value");
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
        System.out.println("It took " + totalTime + "ns to find the lowest and highest value");
        System.out.println("The lowest value in the list is " + nList[0] + " and the highest value is " + nList[nList.length - 1] + "\n");
    }

    /**
     * This method will execute all the code for assignment 3
     *
     * @param list
     */
    private void assignment3(int[] list) {
        int[] nList = new int[list.length];
        System.arraycopy(list, 0, nList, 0, list.length);

        long startTime = startRecordingTime();
        nList = sA.recMinMax(nList);
        long totalTime = endRecordingTime(startTime);
        System.out.println("------Assignment 3------ ");
        System.out.println("It took " + totalTime + "ns to find the lowest and highest value");
        System.out.println("The lowest value in the list is " + nList[0] + " and the highest value is " + nList[nList.length - 1] + "\n");
    }

    /**
     * This method will set the startTime
     *
     * @return the startTime
     */
    private long startRecordingTime() {
        return System.nanoTime();
    }

    /**
     * This method will calculate the time between the startTime and endTime
     *
     * @param startTime the startTime
     * @return the time between the startTime and endTime in milliseconds
     */
    private long endRecordingTime(long startTime) {
        return (System.nanoTime() - startTime);
    }
}
