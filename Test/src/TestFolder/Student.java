import java.util.Random;

public class Student {

    public String name;
    public Integer age;
    public String studentNo;
    public boolean gender;

    Student(int num) {

        boolean isEven = num % 2 == 0;
        
        this.name = "鈴木" + num + (isEven ? "男" : "子");
        this.age = new Random().nextInt(3) + 16;
        this.studentNo = "2024" + (num <= 9 ? "0" + num : num);
        this.gender = isEven;
        

    }

}
