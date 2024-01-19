package P2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CourseRegistrationReader {
    public static ArrayList<Student> readFromCSV(String path) throws IOException {
        List<Student> registrations = Files.lines(Path.of(path))
                .map(Student::fromString)
                .toList();

        return new ArrayList<>(registrations);
    }

    public static void printFiltered(ArrayList<Student> registrations) {
        Map<String, Long> grouped = registrations.stream()
                .collect(Collectors.groupingBy(Student::getCourse_code, Collectors.counting()));

        Map<String, Long> sortedByCount = grouped.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        sortedByCount.forEach((courseCode, count) -> System.out.println(courseCode + " : " + count));
    }

    public static void writeFailedStudents(ArrayList<Student> students, String path) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        students.stream()
                .filter(student -> student.getStatus().equals("Failed"))
                .map(Student::getStudentId)
                .forEach(studentId -> {
                    try {
                        bw.write(studentId + "_");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        bw.close();
    }
}
