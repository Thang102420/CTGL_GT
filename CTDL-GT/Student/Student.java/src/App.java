public class App {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        // Thêm sinh viên
        studentList.addStudent(new Student("S01", "Nguyen Van A", 20, 8.5));
        studentList.addStudent(new Student("S02", "Tran Thi B", 22, 7.8));
        studentList.addStudent(new Student("S03", "Le Hoang C", 21, 9.0));

        // Hiển thị danh sách sinh viên
        studentList.displayStudents();

        // Tìm sinh viên theo mã
        Student foundStudent = studentList.findStudent("S02");
        if (foundStudent != null) {
            System.out.println("\nFound student: " + foundStudent);
        } else {
            System.out.println("\nStudent not found.");
        }

        // Xóa sinh viên
        studentList.removeStudent("S01");

        // Hiển thị danh sách sau khi xóa
        studentList.displayStudents();
    }
}