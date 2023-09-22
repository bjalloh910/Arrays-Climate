import java.io.*;
import java.util.Scanner;

public class ClimateQueries {
    public static void main(String[] args) {
        String filename = (args.length > 0) ? args[0] : "YUMA_2023.txt";
        Scanner file = null;
        try {
            file = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.err.println("Cannot locate file.");
            System.exit(-1);
        }

        float[] temperatures = new float[365]; // Store daily temperatures

        int dayIndex = 0;

        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] fields = line.split("\\s+");
            if (fields.length >= 9) {
                float temperature = Float.parseFloat(fields[8]);
                temperatures[dayIndex++] = temperature;
            }
        }
        file.close();

        // Calculate annual mean temperature
        float annualMeanTemperature = ArrayMethods.mean(temperatures);

        // Calculate minimum and maximum temperature using ArrayMethods
        float minTemperature = ArrayMethods.min(temperatures);
        float maxTemperature = ArrayMethods.max(temperatures);

        System.out.println("Source file: " + filename);
        System.out.printf("Annual mean temperature: %.1f degrees Celsius%n", annualMeanTemperature);
        System.out.printf("Minimum average daily temperature: %.1f degrees Celsius%n", minTemperature);
        System.out.printf("Maximum average daily temperature: %.1f degrees Celsius%n", maxTemperature);
    }
}


