import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {64, 34, 25, 12, 22, 47};

        int[][] matrice1={{4,8,6},{8,9,7}};
        int[][] matrice2={{7,9},{7,9},{2,8}};

        int[][] produs = inmultireMatrici(matrice1, matrice2);

        int x = 52;
        int y = 15;
        int result = russe(x, y);
        System.out.println("Lista nesortata: " + Arrays.toString(a));

        insertionSort(a);

        System.out.println("Lista sortata prin insertie: " + Arrays.toString(a));
        selectionSort(a);
        System.out.println("Lista sortata prin selectarea min: " + Arrays.toString(a));

        System.out.println("euclid " + euclid(18, 12));
        System.out.println("fibonacci " + fibonacci(8));

        System.out.println("Produsul matricelor:");
        System.out.println(Arrays.deepToString(produs));
        System.out.println("Produsul dintre " + x + " si " + y + " este " + result);
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;


            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        int i;
        for (i = 1; i < n - 1; i++) {
            int minj = i;
            int minx = a[i];
            int j;
            for (j = i + 1; j < n; j++) {
                if (a[j] < minx)
                    minj = j;
                minx = a[j];

            }
            a[minj] = a[i];
            a[i] = minx;
        }
    }

    public static int euclid(int m, int n) {

        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static int fibonacci(int n) {
        if (n < 2)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int[] fibo(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        return fib;
    }

    public static int[][] inmultireMatrici(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        int[][] C = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;

    }
    public static int russe(int a,int b)
    {
        int[] X=new int [100];
        int[] Y = new int[100];
        X[0] = a;
        Y[0] = b;
        int i = 0;
        while (X[i] > 1) {
            X[i + 1] = X[i] / 2;
            Y[i + 1] = Y[i] + Y[i];
            i++;
        }
        int prod = 0;
        while (i >= 0) {
            if (X[i] % 2 == 1) {
                prod += Y[i];
            }
            i--;
        }
        return prod;

    }
}