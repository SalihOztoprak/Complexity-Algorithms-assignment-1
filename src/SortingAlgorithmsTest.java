import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SortingAlgorithmsTest {

    private int[] unsortedList;
    private int[] sortedList;
    private SortingAlgorithms sA;

    @BeforeAll
    public void startUp() {
        unsortedList = new int[]{20, 10, 90, 2, 150, 100};
        sortedList = new int[]{2,10,20,90,100,150};
        sA = new SortingAlgorithms();
    }

    @org.junit.jupiter.api.Test
    void sortedMinMax() {
        int[] nList = new int[unsortedList.length];
        System.arraycopy(unsortedList, 0, nList, 0, unsortedList.length);

        nList = sA.sortedMinMax(nList);

        assertEquals(sortedList[0], nList[0], "sortedMinMax: The lowest number is not correct");
        assertEquals(sortedList[5],nList[nList.length-1], "sortedMinMax: The highest number is not correct");

    }

    @org.junit.jupiter.api.Test
    void seqMinMax() {
        int[] nList = new int[unsortedList.length];
        System.arraycopy(unsortedList, 0, nList, 0, unsortedList.length);

        nList = sA.seqMinMax(nList);

        assertEquals(sortedList[0],nList[0],"seqMinMax: The lowest number is not correct");
        assertEquals(sortedList[5],nList[1],"seqMinMax The highest number is not correct");
    }

    @org.junit.jupiter.api.Test
    void recMinMax() {
        int[] nList = new int[unsortedList.length];
        System.arraycopy(unsortedList, 0, nList, 0, unsortedList.length);

        nList = sA.recMinMax(nList, 0, nList.length-1);

        assertEquals(sortedList[0],nList[0],"recMinMax :The lowest number is not correct");
        assertEquals(sortedList[5],nList[nList.length-1],"recMinMax : The highest number is not correct");
    }
}