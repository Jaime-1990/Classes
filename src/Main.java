public class Main {
    public static void main(String[] args) {
        Student jaime = new Student("jaime", "568196", 35, 'm');
        Student john = new Student();
        System.out.println(jaime);
        System.out.println(john);
        System.out.println(jaime.studentID);
        System.out.println(jaime.studentName);
        System.out.println(jaime.studentAge);
        System.out.println(jaime.studentGender);
        System.out.print(jaime.studentEmail);
        System.out.println(john.studentID);
        System.out.println(john.studentAge);
    }
}
