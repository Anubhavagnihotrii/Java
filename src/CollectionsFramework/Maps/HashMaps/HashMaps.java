package CollectionsFramework.Maps.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Add student names and their corresponding scores to the HashMap
        studentScores.put("Anubhav", 80);
        studentScores.put("Himanshu", 90);
        studentScores.put("Amit", 50);

        // Retrieve and print the score for a specific student
        String studentName = "Anubhav";
        Integer score = studentScores.get(studentName);
        System.out.println(studentName + "'s score: " + score);

        // Check if the HashMap contains a specific student
        String searchStudent = "Amit";
        boolean containsStudent = studentScores.containsKey(searchStudent);
        System.out.println("Does the HashMap contain " + searchStudent + "? " + containsStudent);

        // Check if the HashMap contains a specific score (value)
        int searchScore = 10;
        boolean containsScore = studentScores.containsValue(searchScore);
        System.out.println("Does the HashMap contain the score " + searchScore + "? " + containsScore);

        // Iterating over the HashMap using a for-each loop
        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String student = entry.getKey();
            Integer studentScore = entry.getValue();
            System.out.println(student + ": " + studentScore);
        }
    }
}
