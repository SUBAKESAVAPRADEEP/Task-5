package Pradeep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSeparator {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Alex");
        studentNames.add("Amy");
        studentNames.add("Adam");
        studentNames.add("Ben");
        studentNames.add("Anna");
        studentNames.add("Aaron");
        studentNames.add("Amanda");
        studentNames.add("John");

        List<String> studentsStartingWithA = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students whose names start with 'A':");
        for (String student : studentsStartingWithA) {
            System.out.println(student);
 }
}

}
