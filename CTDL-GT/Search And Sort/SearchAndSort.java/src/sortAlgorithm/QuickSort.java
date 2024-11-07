package sortAlgorithm;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {9, 2, 4, 7, 3, 7, 10};
        System.out.println("Mang ban dau: " + Arrays.toString(arr));
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivot = arr[low + (high - low) / 2];  // Chọn pivot là phần tử giữa
        int i = low, j = high;
        
        while (i <= j) {
            while (arr[i] < pivot) i++;  // Tìm phần tử lớn hơn hoặc bằng pivot từ bên trái
            while (arr[j] > pivot) j--;  // Tìm phần tử nhỏ hơn hoặc bằng pivot từ bên phải
            
            if (i <= j) {
                // Hoán đổi các phần tử
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // Gọi đệ quy cho các phần con
        if (low < j) quickSort(arr, low, j);
        if (i < high) quickSort(arr, i, high);
    }
}
