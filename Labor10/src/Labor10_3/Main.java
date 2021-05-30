package Labor10_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            //FileUtil.encode("Labor10_3input.txt", "Labor10_3output.txt");
             FileUtil.decode("Labor10_3output.txt", "Labor10_3input.txt");
        } catch (IOException e) {
        }
    }
}
