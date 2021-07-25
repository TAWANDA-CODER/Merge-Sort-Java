public class Main {
    public static void main(String args[])
    {
        System.out.println("--------------------");
        System.out.println("Merge Sort");
        System.out.println("--------------------");
        int arr_merge[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given Array");
        MergeSort og = new MergeSort();
        og.printArray(arr_merge);
        og.sort(arr_merge, 0, arr_merge.length - 1);
        System.out.println("\nSorted array:");
        og.printArray(arr_merge);
        System.out.println();
    }
}