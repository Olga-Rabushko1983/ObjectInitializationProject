public class Student {
    public String name;
    public int age;
    public double mark;
    public boolean alive;


    //defalt constructor
    public Student() {
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }
//full constructor with param
    public Student(String name, int age,double mark, boolean alive){
        this.name=name;
        this.age=age;
        this.mark=mark;
        this.alive=alive;
    }
    //copy constructor
    public Student(Student student){
        name=student.name;
        age=student.age;
        mark=student.mark;
        alive=student.alive;

    }

    public String getInfo() {
        return name + ":age=" + age + ",mark=" + mark + ",is live=" + (alive ? "yes" : "no");

    }
}
