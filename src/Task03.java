public class Task03 {
    public static void main(String[] args) {

        Student student=new Student("Alex", 20, 9.5, true);

//        student.name="Alex";
//        student.age=20;
//        student.mark=9.5;
//        student.alive=true;

        System.out.println(student.getInfo());

        Student student1=new Student("Anna", 18, 8, true);

//        student1.name="Anna";
//        student1.age=18;
//        student1.mark=8;
//        student1.alive=true;

        System.out.println(student1.getInfo());

        Student student2=new Student("Harry",16,10,true);

//        student2.name="Harry";
//        student2.age=16;
//        student2.mark=10;
//        student2.alive=true;

        System.out.println(student2.getInfo());
    }
}
