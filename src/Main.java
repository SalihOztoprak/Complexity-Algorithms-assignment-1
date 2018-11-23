import java.util.Arrays;

public class Main {
    private ListGenerator lG = new ListGenerator();
    private SortingAlgorithms sA= new SortingAlgorithms();

    public static void main(String[] args) {

       new Main().run();
    }

    private void run() {
        int[] list = lG.numberList(10);
        System.out.println(Arrays.toString(list));
        list = sA.sortedMinMax(list);
        System.out.println(Arrays.toString(list));
    }

    private long startRecordingTime(){
        return System.currentTimeMillis();
    }

    private long endRecordingTime(long startTime){
        return System.currentTimeMillis() - startTime;
    }
}
