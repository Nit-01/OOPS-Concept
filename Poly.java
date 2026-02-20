//poly -many
//morfism - form     
//compile time polymorfism (function overloading)
//here we callled same function for mant time "PintInfo "
//polymorpism called overloading

class Employee{
    String name;
    int age;

    public void PrintInfo(String name){        
        System.out.println(name);              
    }
    public void PrintInfo(int age){
        System.out.println(age);
    }
    public void PrintInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class Poly{
    public static void main(String[]args){
        Employee s1=new Employee();
        s1.age=22;
        s1.name="niteesh";
        s1.PrintInfo(s1.name,s1.age);

    }
}