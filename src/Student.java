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

    public String getInfo() {
        return name + ":age=" + age + ",mark=" + mark + ",is live=" + (alive ? "yes" : "no");

    }
}
