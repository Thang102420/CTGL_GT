public class FibonacciRecursion {

    // Phương pháp đệ quy để tính số Fibonacci thứ n
    public static int fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Số thứ tự phải là số nguyên dương.");
            return -1;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; 
        int result = fibonacci(n);
        if(result != -1){
            System.out.println("Số Fibonacci thứ " + n + " là: " + result);
        }
    }
}
