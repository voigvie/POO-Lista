public class Questao9 {
    public static void main(String[] args) {
       
        int[] arr = {-2, -8, -3, 10, 7, 55, 21, 4, 9};
        BubbleSort b = new BubbleSort();
        InsertionSort i = new InsertionSort();
        Sort s = new Sort(arr, i);

        s.runSort();

        for (int j : s.getArr()) {
            System.out.println(j);
        }
    }
}
