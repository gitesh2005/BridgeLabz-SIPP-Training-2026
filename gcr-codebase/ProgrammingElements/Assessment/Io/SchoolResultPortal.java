package ProgrammingElements.Assessment.Io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SchoolResultPortal {
    public static double calculateAverage(String[] marks) {
        int total = 0;

        for (int i = 1; i < marks.length; i++) {
            total += Integer.parseInt(marks[i].trim());
        }

        return (double) total / (marks.length - 1);
    }

    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("student_results.txt"));
                PrintWriter writer = new PrintWriter(new FileWriter("report_card.txt", true))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                double average = calculateAverage(data);

                writer.println("Student Name: " + name);
                writer.println("Average Marks: " + average);
                writer.println("-------------------------");
            }

            System.out.println("Report card generated successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found");
        } catch (IOException e) {
            System.out.println("Error while reading or writing file");
        }
    }
}