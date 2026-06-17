package ProgrammingElements.DailyPracticeClass.ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) {

        try {
            File fr = new File("C:\\Users\\lenovo\\IdeaProjects\\BridgeLabz-SIPP-Training-2026\\gcr-codebase\\ProgrammingElements\\DailyPracticeClass\\ExceptionHandling\\abc.txt");
            FileReader fileReader = new FileReader(fr);
            System.out.println("File opened successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}