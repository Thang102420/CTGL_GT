package sortAlgorithm;

public class InsertionSort {

    // Phương thức sắp xếp chèn (Insertion Sort)
    void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {  // Đổi vòng lặp từ i=1 đến n-1 thành i<n
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr[0..i-1] có giá trị lớn hơn key, sang vị trí tiếp theo
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;  // Chèn key vào đúng vị trí
        }
    }

    // Phương thức in mảng
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertionSort is = new InsertionSort();
        int[] arr = {31, 24, 53, 24, 32};

        // In mảng gốc
        System.out.println("Mang goc: ");
        is.printArray(arr);

        // Sắp xếp mảng và in mảng sau khi sắp xếp
        is.insertionSort(arr);
        System.out.println("Mang sau khi sap xep: ");
        is.printArray(arr);
    }
}
