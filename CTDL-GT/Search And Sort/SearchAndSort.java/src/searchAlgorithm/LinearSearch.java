package searchAlgorithm;

public class LinearSearch {

    public int search(int arr[], int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;  // Trả về chỉ số nếu tìm thấy phần tử
            }
        }
        return -1;  // Trả về -1 nếu không tìm thấy phần tử
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] arr = {1, 3, 5, 7, 9};
        int x = 7;

        int result = ls.search(arr, x);  // Gọi phương thức tìm kiếm và lưu kết quả

        if (result != -1) {
            // Nếu tìm thấy phần tử, in ra chỉ số
            System.out.println("Phan tu so " + x + " da duoc tim thay tai vi tri so : " + result);
        } else {
            // Nếu không tìm thấy phần tử
            System.out.println("Phan tu " + x + " khong ton tai trong mang.");
        }
    }
}

