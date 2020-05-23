package top.zhujiayu;

/**
 * @auther zjy
 * @date 2020/5/23
 **/

public class Student extends Person {

    private int grade;

    public int number;

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, int grade, int number) {
        super(name, age);
        this.grade = grade;
        this.number = number;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void study() {
        System.out.println(name + "学java,学无止境，学吧～");
    }

    public void study(String course) {
        System.out.println(name + "还要学" + course + "学无止境，学吧～");
    }


}
