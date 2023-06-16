package site.telion.yandex.d20230618.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{

        StreamTokenizer in = new StreamTokenizer(
                new BufferedInputStream(
                        new FileInputStream(new File("input.txt"))));
        PrintStream out = new PrintStream(new File("output.txt"));

        int n = 0;
        in.nextToken();
        n = (int) in.nval;

        int x = 0;
        int y = 0;
        int step = 1;
        int currentStep = 1;
        int direction = 0;
        for (int i = 1; i <= n; i++) {
            switch (direction) {
                case 0 -> x--;
                case 1 -> y--;
                case 2 -> x++;
                case 3 -> y++;
            }

            currentStep--;
            if (currentStep == 0) {
                if (direction == 1 || direction == 3) {
                    step++;
                }
                currentStep = step;
                direction = direction == 3 ? 0 : direction + 1;
            }
        }

        String result = x + " " + y;

        out.write(result.getBytes());
    }
}