public class SortingTest {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9};
        int[] unsortedArray = {3, 1, 5, 2, 8};

        boolean isSorted1 = ArraySortChecker.isSortedAscending(sortedArray);
        boolean isSorted2 = ArraySortChecker.isSortedAscending(unsortedArray);

        System.out.println("Is sortedArray sorted in ascending order? " + isSorted1);
        System.out.println("Is unsortedArray sorted in ascending order? " + isSorted2);
    }
}



