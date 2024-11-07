package sortAlgorithm;

public class MergeS {

    // Phương thức sắp xếp (Merge Sort)
    public void mergeSort(int[] arr) {
        if (arr.length < 2) return;  // Nếu mảng có ít hơn 2 phần tử thì không cần sắp xếp
        int mid = arr.length / 2;  // Tìm chỉ số giữa
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);  // Sao chép phần trái
        System.arraycopy(arr, mid, right, 0, arr.length - mid);  // Sao chép phần phải

        mergeSort(left);  // Đệ quy sắp xếp bên trái
        mergeSort(right);  // Đệ quy sắp xếp bên phải
        merge(arr, left, right);  // Gộp lại
    }

    // Phương thức gộp 2 mảng
    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Gộp phần tử từ 2 mảng vào mảng gốc
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }

        // Nếu còn phần tử trong mảng left, sao chép vào arr
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Nếu còn phần tử trong mảng right, sao chép vào arr
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Phương thức in mảng
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeS ms = new MergeS();
        int[] arr = {12, 23, 7, 56, 27, 42, 10};
        
        // In mảng gốc
        System.out.println("Mang goc: ");
        ms.printArray(arr);
        
        // Sắp xếp mảng và in mảng đã sắp xếp
        ms.mergeSort(arr);
        System.out.println("Mang sau khi sap xep: ");
        ms.printArray(arr);
    }
}
