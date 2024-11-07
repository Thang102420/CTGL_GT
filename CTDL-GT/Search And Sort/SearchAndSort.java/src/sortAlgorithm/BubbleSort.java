package sortAlgorithm;

public class BubbleSort {

    // Phuong thuc sap xep noi bot (Bubble Sort)
    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;  // Dat co de kiem tra co hoan doi hay khong
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoan doi
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Neu khong co phan tu nao hoan doi, thoat vong lap
            if (!swapped) break;
        }
    }

    // Phuong thuc in mang
    void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();

        // Sap xep va in mang dau tien
        int[] arr1 = {64, 22, 34, 12, 11};
        System.out.println("Mang goc: ");
        bs.printArray(arr1);
        bs.bubbleSort(arr1);
        System.out.println("Mang sau khi sap xep (Bubble Sort): ");
        bs.printArray(arr1);

        // Sap xep va in mang thu hai
        int[] arr2 = {34, 12, 27, 17, 31};
        System.out.println("Mang goc: ");
        bs.printArray(arr2);
        bs.bubbleSort(arr2);
        System.out.println("Mang sau khi sap xep (Bubble Sort toi uu): ");
        bs.printArray(arr2);
    }
}
