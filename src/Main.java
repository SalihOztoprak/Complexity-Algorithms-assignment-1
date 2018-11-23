import java.util.Arrays;

public class Main {
    private ListGenerator lG = new ListGenerator();
    private SortingAlgorithms sA = new SortingAlgorithms();

    public static void main(String[] args) {

        new Main().run();
    }

    private void run() {
        opdracht1();
    }

    /**
     * This method will execute all the code for opdracht 1
     */
    private void opdracht1() {
        int[] list = lG.numberList(1000);
        long startTime = startRecordingTime();
        list = sA.sortedMinMax(list);
        long endTime = endRecordingTime(startTime);
        System.out.println("It took " + endTime + "ms to sort the list");
        System.out.println("The lowest value in the list is " + list[0] + " and the highest is " + list[list.length - 1]);
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
