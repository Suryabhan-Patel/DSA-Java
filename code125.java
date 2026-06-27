public class code125 {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 2000, 4000, 8000};

        for (int n : sizes) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = i;

            long start = System.nanoTime();
            linearSearch(arr, -1); // worst case
            long end = System.nanoTime();

            System.out.println(n + " -> " + (end - start));
        }
    }

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }
}

