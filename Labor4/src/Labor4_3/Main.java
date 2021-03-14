package Labor4_3;

public class Main {
    public static void main(String[] args) {
        /*MyArray array = new MyArray("Labor4/lab4_3_input.txt");
        System.out.println(array.toString());
        MyArray array1=new MyArray(5);
        array1.fillRandom(0,10);
        System.out.println(array1.toString());
        double elements[]={2,3,4,5};
        MyArray array2=new MyArray(elements);
        System.out.println(array2.toString());
        System.out.println("Mean:"+array2.Mean());
        System.out.println("Sttdev:"+array2.stddev());
        array1.sort();
        System.out.println("Sort array1" + array1.toString());
        array1.print("array1");*/
        MyArray a1 = new MyArray(10);
        a1.print("a1");
        a1.fillRandom(0, 9);
        a1.print("a1");
        a1.sort();
        a1.print("a1");
        System.out.printf("\tMean: %10.2f Stddev: %10.2f\n",
                a1.Mean(), a1.stddev());
        double t[] = {4, 9, 0, -34, 28, 76, 100, -1};
        MyArray a2 = new MyArray(t);
        a2.print("a2");
        a2.sort();
        a2.print("a2");
        System.out.printf("\tMean: %10.2f Stddev: %10.2f\n",
                a2.Mean(), a2.stddev());
        MyArray a3 = new MyArray("Labor4/lab4_3_input.txt");
        a3.print("a3");
        MyArray a4 = new MyArray( a3 );
        a3.sort();
        a3.print("a3");
        System.out.printf("\tMean: %10.2f Stddev: %10.2f\n",
                a3.Mean(), a3.stddev());
        a4.print("a4");

    }
}
