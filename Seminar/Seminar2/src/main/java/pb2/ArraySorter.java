package pb2;

public class ArraySorter {
    private Sorter sorter;

    public void setSortingStrategy(Sorter sorter) {
        this.sorter = sorter;
    }

    public void sortArray(int[] arr){
        sorter.sort(arr);
    }
}
