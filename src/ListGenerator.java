import java.util.Random;

public class ListGenerator {
    public ListGenerator() {
        //noting to declare.
    }

    /**
     * Generate a list with random numbers in it!
     *
     * @param size the size of the list.
     * @return
     */
    public int[] numberList(int size) {
        int[] list = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(Integer.MAX_VALUE) + 1;
            list[i] = randomNumber;
        }
        return list;
    }
}
