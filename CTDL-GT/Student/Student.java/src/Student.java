class Student {
    String studentId;
    String name;
    int age;
    double gpa;

    public Student(String studentId, String name, int age, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", Age: " + age + ", GPA: " + gpa;
    }
}

// Lớp Node đại diện cho một node trong danh sách liên kết đơn
class Node {
    Student student;
    Node next;

    public Node(Student student) {
        this.student = student;
        this.next = null;
    }
}

// Lớp StudentList để quản lý danh sách sinh viên
class StudentList {
    private Node head;

    // Thêm sinh viên vào đầu danh sách
    public void addStudent(Student student) {
        Node newNode = new Node(student);
        newNode.next = head;
        head = newNode;
    }

    // Xóa sinh viên theo mã sinh viên
    public void removeStudent(String studentId) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.student.studentId.equals(studentId)) {
                if (previous == null) { // Nếu node đầu tiên là node cần xóa
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                System.out.println("Student with ID " + studentId + " has been removed.");
                return;
            }
            previous = current;
            current = current.next;
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    // Tìm kiếm sinh viên theo mã sinh viên
    public Student findStudent(String studentId) {
        Node current = head;
        while (current != null) {
            if (current.student.studentId.equals(studentId)) {
                return current.student;
            }
            current = current.next;
        }
        return null;
    }

    // Hiển thị danh sách sinh viên
    public void displayStudents() {
        Node current = head;
        if (current == null) {
            System.out.println("No students in the list.");
            return;
        }
        System.out.println("Student List:");
        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }
}