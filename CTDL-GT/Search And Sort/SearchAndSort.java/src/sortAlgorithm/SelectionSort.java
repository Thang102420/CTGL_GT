package sortAlgorithm;

public class SelectionSort {
    
    // Phương thức sắp xếp Selection Sort
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            
            // Tìm phần tử nhỏ nhất trong mảng con
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên trong mảng con
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
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
        SelectionSort ss = new SelectionSort();
        int[] arr = {65, 22, 11, 45, 9};
        
        // In mảng ban đầu
        System.out.println("Mang ban dau :");
        ss.printArray(arr);
        
        // Sắp xếp mảng
        ss.sort(arr);
        
        // In mảng sau khi sắp xếp
        System.out.println("Mang sau khi sap xep:");
        ss.printArray(arr);
    }
}
