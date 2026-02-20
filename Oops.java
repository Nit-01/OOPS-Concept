// class Car{
//     int speed;
//     String name;
//     String color;

//     public void Carspeed(){
//     System.out.println("car is very fast");
//    }
//    public void Carcolor(){
//     System.out.println(this.color);
//    }
// }

class Student{
    String name;
    int rollno;
    int age;

    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.rollno);
        System.out.println(this.age);

    }
    Student(){
        System.out.println("yessssssssss");
    }
    //  Student(String name,int age){.    parametreized constructer
    //     this.name=name;
    //     this.age=age;
    // }  

    Student(Student s2){          //copy constructer
        this.name=s2.name;
        this.age=s2.age;
    }
}
public class Oops{
    public static void main(String[] args){
        // Car c1=new Car();
        // Car c2=new Car();

        
        // // c1.speed=200;

        // // c1.color="blue";
        // // c2.color="gold";

        // c1.Carspeed();
        // c1.Carcolor();
        // c2.Carcolor();
        Student s1=new Student();
        s1.age=22;
        s1.name="niteesh";
        s1.rollno=065;

        Student s2=new Student(s1);

        s2.PrintInfo();

    }
}