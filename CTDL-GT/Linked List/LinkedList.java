public class LinkedList {
    public static void main(String[] args) {
        // Tạo danh sách liên kết và kiểm thử các phương thức
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // In danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        printList(head);

        // In kích thước danh sách ban đầu
        System.out.println("Kích thước ban đầu: " + size(head));

        // Thêm phần tử vào đầu danh sách
        head = addToHead(head, 0);
        System.out.println("Sau khi thêm 0 vào đầu danh sách:");
        printList(head);
        System.out.println("Kích thước sau khi thêm 0 vào đầu: " + size(head));

        // Thêm phần tử vào cuối danh sách
        head = addToTail(head, 5);
        System.out.println("Sau khi thêm 5 vào cuối danh sách:");
        printList(head);
        System.out.println("Kích thước sau khi thêm 5 vào cuối: " + size(head));

        // Xóa phần tử cuối cùng
        head = removeAtTail(head);
        System.out.println("Sau khi xóa phần tử cuối cùng:");
        printList(head);
        System.out.println("Kích thước sau khi xóa phần tử cuối: " + size(head));
    }

    // Định nghĩa lớp Node
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Phương thức tính kích thước của danh sách
    public static int size(Node headNode) {
        int count = 0;
        Node tmp = headNode;

        // Duyệt qua các phần tử của danh sách và đếm số nút
        while (tmp != null) {
            count++;  // Tăng giá trị đếm
            tmp = tmp.next;  // Chuyển đến phần tử tiếp theo
        }

        return count;  // Trả về tổng số phần tử
    }

    // Phương thức thêm phần tử vào đầu danh sách
    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    // Phương thức thêm phần tử vào cuối danh sách
    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            // B1. Xác định Last node (Last node là node có lastNode.next = null)
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            // B2. Gán next cho lastNode = newNode
            lastNode.next = newNode;
        }
        return headNode;
    }

    // Phương thức xóa phần tử cuối cùng
    public static Node removeAtTail(Node headNode) {
        // Kiểm tra danh sách có phần tử nào không
        if (headNode == null) {
            return null;
        }

        // B1. Xác định Last và previous
        Node lastNode = headNode;
        Node preNode = null;
        while (lastNode.next != null) {
            preNode = lastNode;
            lastNode = lastNode.next;
        }

        // B2. Next của preNode trỏ tới null
        if (preNode == null) {
            return null; // Nếu chỉ có một phần tử trong danh sách
        } else {
            preNode.next = null; // Xóa nút cuối cùng
        }
        return headNode; // Trả về danh sách cập nhật
    }

    // Phương thức để in danh sách
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
