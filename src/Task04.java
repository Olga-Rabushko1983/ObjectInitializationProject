public class Task04 {
    public static void main(String[] args) {
        Student student1=new Student("Alex", 20, 10, true);
        Student student2=new Student(student1);
        Student student3=new Student(student1);
        Student student4=new Student(student1);

    }
}
