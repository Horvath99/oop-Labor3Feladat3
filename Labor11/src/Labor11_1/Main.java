package Labor11_1;

public class Main {
    public static int counter=300;
    public static void main(String[] args) {
        String[] sa_array=new String[10];
        for (int i = 0; i <sa_array.length; ++i) {
            sa_array[i]=" ";
        }
        Thread producer=new AddToArray(sa_array);
        Thread costumer=new TakeSomeFromArray(sa_array,"ppp",10);
        producer.start();
        costumer.start();
    }
}
