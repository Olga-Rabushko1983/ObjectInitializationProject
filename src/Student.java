public class Student {
    public String name;
    public int age;
    public double mark;
    public boolean alive;

    public Student() {
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }

    public Student(String n, int a,double m, boolean al){
        name=n;
        age=a;
        mark=m;
        alive=al;
    }
    public Student(String n){
        name=n;

    }
    public Student(double m){
        mark=m;
    }
    public Student(String n, double m){
        name =n;
        mark=m;
    }
    public Student( double m, String n){
        mark=m;
        name =n;

    }
    public String getInfo() {
        return name + ":age=" + age + ",mark=" + mark + ",is live=" + (alive ? "yes" : "no");

    }
}
