package lecture02;

public class Human {
    String name;
    int age;

    Human(String name,int age){
        this.name = name;
        this.age = age;
    }

    void print(){
        System.out.print(this.name+" "+this.age+"歳 ");
        if(this.age<=18){
            System.out.println("生徒です");
        }
        if(18<this.age && this.age<=22) {
            System.out.println("学生です");
        }
    }
}
