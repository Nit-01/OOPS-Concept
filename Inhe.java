//if one want to take properties of other class this is calss inheritence
//reuse abiity  giveing = base class or parent class
//              reciver = child class 

/* 
1.single level inheritance

class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);

    }
}
*/

/* 

2.Multi level inheritance

class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);

    }
}
class ETriangle extends Triangle{
    public void area(int l,int b){
        System.out.println(1/2*l*b);

    }
}

*/
//if one want to take properties of other class this is calss inheritence
//3. Hirerachial Inheritance. 1 base class other class are chid class
//4 Hibrid Inheritance
//5. Multiple Inheritance. prest in c not in java (Interface are used for in java)

class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class Inhe{
    public static void main(String args[]){

        Triangle t1=new Triangle();
        t1.color="red";
    }
}