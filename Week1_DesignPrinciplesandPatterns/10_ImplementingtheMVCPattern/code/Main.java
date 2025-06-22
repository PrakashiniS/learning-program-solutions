public class Main {
    public static void main(String[] args) {
        Student model = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.setStudentName("Alice");
        controller.setStudentId("STU123");
        controller.setStudentGrade("A");
        controller.updateView();
    }
}
