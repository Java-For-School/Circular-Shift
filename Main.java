public class Main {
  public static void main(String[] args) {
    int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    printArray(array);
    shift_array(array, 1);
    printArray(array);
  }
  public static void printArray(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%d, ", array[i]);
    }
    System.out.println("]");
  }
  public static int gcd(int a, int b) {
      while(b != 0) {
          int c = a;
          a = b;
          b = c % a;
      }
      return a;
  }
  
  public static void shift_array(int[] A, int n) {
      int N = A.length;
      n %= N;
      if(n < 0)
          n = N + n;
      int d = gcd(N, n);
      for(int i = 0; i < d; i++) {
          int temp = A[i];
          for(int j = i - n + N; j != i; j = (j - n + N) % N)
              A[(j + n) % N] = A[j];
          A[i + n] = temp;
      }
  }
}
