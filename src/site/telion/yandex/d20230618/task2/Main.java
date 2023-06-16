package site.telion.yandex.d20230618.task2;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        String s;
        String result = null;
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        List<String> inputData = new ArrayList<>();
        while ((s = br.readLine()) != null) {
            inputData.add(s);
        }
        String periodType = inputData.get(0);
        String period = inputData.get(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate periodStart = LocalDate.parse(period.split(" ")[0], formatter);
        LocalDate periodFinish = LocalDate.parse(period.split(" ")[1], formatter);
        LocalDate currentPeriod = periodStart;

        switch (periodType) {
            case "MONTH" -> {
                while (currentPeriod.isBefore(periodFinish)) {
                    int m = currentPeriod.getMonthValue();
                    int y = currentPeriod.getYear();

                    System.out.println("currentPeriod = " + currentPeriod);
                    result = currentPeriod.toString();
                    currentPeriod = LocalDate.of(y, m, 22);
                    result += " " + currentPeriod.toString();
                    System.out.println("result = " + result);
                }
            }
        }

    }
}