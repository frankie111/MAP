package pb1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tool> tools = List.of(new Hammer("hammer", 10), new Saw("saw", 5));
        System.out.println(ToolFilter.filterByWeight(tools, 7));
        System.out.println(ToolFilter.filterByCanCut(tools));
    }
}
