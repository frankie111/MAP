package pb1;

import java.util.ArrayList;
import java.util.List;

public class ToolFilter {
    public static List<Tool> filterByWeight(List<Tool> tools, int weight) {
        List<Tool> filtered = new ArrayList<>();

        for (Tool tool : tools) {
            if (tool.getWeight() >= weight)
                filtered.add(tool);
        }

        return filtered;
    }

    public static List<Tool> filterByCanCut(List<Tool> tools) {
        List<Tool> filtered = new ArrayList<>();

        for (Tool tool : tools) {
            if (tool instanceof Cut)
                filtered.add(tool);
        }

        return filtered;
    }
}
