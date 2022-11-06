package lecture02;

public class Human {
    String name;
    int age;


    Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    String agechecker(int age) {
        if (6 <= age && age <= 18) {
            return "生徒";
        } else if (19 <= age && age <= 22) {
            return "学生";
        }else{
            return "";
        }
    }
    void print(){
        System.out.println(name +age + "歳です");

    }

}
