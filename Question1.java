/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question1;
import java.util.*;

/**
 *
 * @author acer
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // List - stores student names
        List<String> students = new ArrayList<>();
        students.add("Arun");
        students.add("Divya");
        students.add("Kavin");
        students.add("Meena");

        // Set - stores unique subjects
        Set<String> subjects = new HashSet<>();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("Database");
        subjects.add("Java"); // Duplicate will not be added

        // Map - stores student and their marks
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Arun", 85);
        grades.put("Divya", 92);
        grades.put("Kavin", 78);
        grades.put("Meena", 88);

        System.out.println("=================================");
        System.out.println("   STUDENT GRADE MANAGEMENT");
        System.out.println("=================================");

        // Display students
        System.out.println("\nStudent List:");
        for (String student : students) {
            System.out.println(student);
        }

        // Display subjects
        System.out.println("\nSubjects:");
        for (String subject : subjects) {
            System.out.println(subject);
        }

        // Display grades
        System.out.println("\nStudent Grades:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }

        // Find highest mark
        String topStudent = "";
        int highestMark = 0;

        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            if (entry.getValue() > highestMark) {
                highestMark = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("\nTop Student:");
        System.out.println(topStudent + " - " + highestMark);

        // Search for a student
        String searchStudent = "Divya";

        if (grades.containsKey(searchStudent)) {
            System.out.println("\n" + searchStudent +
                    "'s Mark: " + grades.get(searchStudent));
        } else {
            System.out.println("\nStudent not found.");
        }
    }
}
        // TODO code application logic here
    
    

