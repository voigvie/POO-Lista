public class InsertionSort implements SortA{
    @Override
    public void runSort(int[] arr) {
        int size = arr.length;

            for (int step = 1; step < size; step++) {
            int key = arr[step];
            int j = step - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }

            arr[j + 1] = key;
            }
        }
    }

