
public class Main {
    private NumberGenerator numberGenerator = new NumberGenerator();
    public static void main(String[] args) {

       new Main().run();

    }

    public void run(){
        int [] list = numberGenerator.numberList(10);

        for (int i = 0; i <list.length ; i++) {
            System.out.println(list[i]);
        }
    }



}
