public class Sort {
    private SortA sortingAlgoritm;
    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public Sort(int[] arr, SortA selectedSortingAlgoritm) {
        this.arr = arr;
        this.sortingAlgoritm = selectedSortingAlgoritm;
    }

    void runSort() {
        this.sortingAlgoritm.runSort(arr);
    }
}
