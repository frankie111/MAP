import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class ItemUtils {
    public static ArrayList<MenuItem> readItems(String path) throws IOException {
        List<MenuItem> items = Files.lines(Path.of(path))
                .map(MenuItem::fromString)
                .toList();

        return new ArrayList<>(items);
    }

    public static void countItems(ArrayList<MenuItem> items){
        HashMap<String, Long> grouped = (HashMap<String, Long>) items.stream()
                .collect(Collectors.groupingBy(MenuItem::getCategory, Collectors.counting()));

        HashMap<String, Long> sorted = grouped.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                                .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (e1, e2) -> e1, LinkedHashMap::new
                                ));


        sorted.forEach((key, value) ->{
            System.out.println(key + " : " + value);
        });
    }

    public static void saveAvailabilityFalse(ArrayList<MenuItem> items, String path) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        items.stream()
                .filter(item -> item.getAvailability().equals("false"))
                .map(item -> item.getName().length())
                .forEach(len -> {
                    try {
                        bw.write(len + " ");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });

        bw.close();
    }
}
