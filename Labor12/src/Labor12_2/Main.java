package Labor12_2;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Storage storage=new Storage("Labor12/data1000000.txt");
        storage.update("Labor12/update1000000.txt");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " +
                timeElapsed / 1000000);
    }
}
