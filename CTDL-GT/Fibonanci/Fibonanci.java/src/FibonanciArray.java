static long[] t = new long[100];

public static long fib1(int n) {
    if (t[n] != 0) return t[n];  
    System.out.println("tinh fib1(" + n + ")");

    if (n <= 1) {
        t[0] = 0;
        t[1] = 1;  
        return n;
    } else {
        t[n] = fib1(n - 1) + fib1(n - 2);
    }
    return t[n];
}
