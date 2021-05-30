package Labor12_3;

public class Main {
    public static void main(String[] args) {
        Process process=new Process("Labor12/nevek1.txt");
        process.SetRo("Labor12/roman.txt");
        process.SetHun("Labor12/magyar.txt");
        process.SetMath("Labor12/matek.txt");
        System.out.println("Passed students:"+process.CountPassed());
        process.PrintFailed();
    }
}
