public class Student {
   String studentName;
   String studentID = "000000000";
   int studentAge;
   char studentGender;
   String studentEmail="por asignar";
    // Constructor
    public Student() {
        System.out.println("Estudiante creado sin datos!");
    }
    public Student(String name, String id, int age, char gender) {
        studentName = name;
        studentID = id;
        studentAge = age;
        studentGender = gender;
        System.out.println("Estudiante \"" + studentName +"\" + creado!");
    }
    public Student(String name, String id, int age, char gender, String email) {
        studentName = name;
        studentID = id;
        studentAge = age;
        studentGender = gender;
        studentEmail = email;
        System.out.println("Estudiante \"" + studentName +"\" + creado!");
    }
    public String getStudentEmail() {
        return studentEmail;
    }

    public String toString() {
        return "Student with name: " + studentName;

    }
}
