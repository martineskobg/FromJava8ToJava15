package estafet.java12.task3;

import java.util.*;
import java.util.stream.Collectors;

public class StudentUtils {

    /**
     * Gets the first student with MAX and first student with MIN grade
     * @param students List
     * @return HashMap<String, Student>
     */
    public static HashMap<String, Student> getMaxAndMinStudentGrades(List<Student> students) {
        return students.stream().collect(
                Collectors.teeing(
                        // Get max and min grade
                        Collectors.maxBy(Comparator.comparing(Student::getGrade)),
                        Collectors.minBy(Comparator.comparing(Student::getGrade)),
                        (s1, s2) -> {
                            HashMap<String, Student> map = new HashMap<>();
                            map.put("MAX grade", s1.get());
                            map.put("MIN grade", s2.get());
                            return map;
                        }
                ));
    }

    /**
     * Returns the count of all excellent grades
     * @param students List of Students
     * @return int
     */
    public static int getCountOfExcellentGrades(List<Student> students) {
        int count = 0;
        Map<Double, List<Student>> byGrade = students.stream().collect(Collectors.groupingBy(Student::getGrade));
        for (Map.Entry<Double, List<Student>> entry : byGrade.entrySet()) {
            if (entry.getKey() >= 5.50) {
                // increment student count with excellent grade
                for (Student std : entry.getValue()) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Returns all students with excellent grade
     * @param students List of Students
     * @return Lists of Students
     */
    public static List<Student> collectStudentsWithExcellentGrade(List<Student> students) {
        List<Student> excellentStudents = new ArrayList<>();
        Map<Double, List<Student>> byGrade = students.stream().collect(Collectors.groupingBy(Student::getGrade));
        double maxGrade = Collections.max(byGrade.keySet());

        // Print all students with max grade
        System.out.println("\nStudents with max grade");
        for (Map.Entry<Double, List<Student>> entry : byGrade.entrySet()) {
            if (entry.getKey() >= 5.50) {
                if (entry.getKey() == maxGrade) {
                    excellentStudents.addAll(entry.getValue());
                }
            }
        }
        return excellentStudents;
    }
}
