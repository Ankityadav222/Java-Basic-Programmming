public class Singlepointer {

    static void Reversenumber(int i, int n, int a[]) {
        if (i >= n / 2) // Correct condition for reversing
            return;

        // Swap elements
        int temp = a[i];
        a[i] = a[n - i - 1];
        a[n - i - 1] = temp;

        // Recursive call with correct parameter order
        Reversenumber(i + 1, n, a);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        // Call Reversenumber
        Reversenumber(0, a.length, a);

        // Print the reversed array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
