package searchAlgorithm;
public class BinarySearch {

    // Tìm kiếm nhị phân đệ quy
    int binarySearchRecur(int arr[], int l, int r, int x) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) return mid;  // Tìm thấy phần tử
            return (arr[mid] > x)
                    ? binarySearchRecur(arr, l, mid - 1, x)  // Tìm bên trái
                    : binarySearchRecur(arr, mid + 1, r, x);  // Tìm bên phải
        }
        return -1;  // Không tìm thấy
    }

    // Tìm kiếm nhị phân vòng lặp
    int binarySearchIter(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) return mid;  // Tìm thấy phần tử
            if (arr[mid] > x) r = mid - 1;  // Tìm bên trái
            else l = mid + 1;  // Tìm bên phải
        }
        return -1;  // Không tìm thấy
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1, 3, 5, 7, 9};
        int x = 8;

        // Tìm kiếm nhị phân đệ quy
        int resultRecur = bs.binarySearchRecur(arr, 0, arr.length - 1, x);
        System.out.println(resultRecur != -1 
                ? "Tim kiem de quy: Phan tu " + x + " tim thay tai vi tri: " + resultRecur
                : "Tim kiem de quy: Phan tu " + x + " khong ton tai trong mang.");

        // Tìm kiếm nhị phân vòng lặp
        int resultIter = bs.binarySearchIter(arr, x);
        System.out.println(resultIter != -1 
                ? "Tim kiem vong lap : Phan tu " + x + " tim thay tai vi tri: " + resultIter
                : "Tim kiem vong lap : Phan tu " + x + " khong ton tai trong mang.");
    }
}
