
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You created a Animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Now u created a horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Hen extends Animal{
    Hen(){
        System.out.println("You created a hen");
    }
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}


//INTERFACES

// interface Animal {
//     int eyes=4;
//     void walk();
// }
// class Horse implements Animal{
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }

// }

// public class Abs {
//     public static void main(String args[]){

//         Horse h=new Horse();
//         h.walk();
//         System.out.println("horse have "+ h.eyes +" eyes");
//     }
// }
