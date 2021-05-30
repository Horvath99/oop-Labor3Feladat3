package Labor11_1;

public class TakeSomeFromArray extends Thread {
    private String[] array;
    private String str;
    private int counter;
    private int nr=0;

    public TakeSomeFromArray(String[] array, String str, int number) {
        this.array = array;
        this.str = str;
        this.counter = number;
    }

    @Override
    public void run() {
        while(counter>nr){
            synchronized (this.array) {
                for (int i = 0; i < array.length; ++i) {
                    if (array[i].equals(str)) {
                        Main.counter--;
                        nr++;
                        array[i] = " ";
                        System.out.println(str + " Has been replaced " + nr + " times ");

                    }
                }

            }
        }
        System.out.println("String "+str+" has been replaced "+nr+" times, thread finishes its work");
    }
}
