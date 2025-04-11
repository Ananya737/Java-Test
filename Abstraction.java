
//Abstraction using abstract class:

// abstract class One{
//     abstract void display();
// }
// class Two extends One
// {
//     void display(){
//         System.out.println("Two's method!");
//     }

// }
// class Three extends One{
//     void display(){
//         System.out.println("Three's method!");
//     }
// }


// public class Abstracttion {
//     public static void main(String args[]){
//         One obj=new Two();
//         obj.display();

//     }
    
// }






//Abstraction using interface:

// interface engine{
//     void start();
// }
// class Car implements engine
// {
//    public void start(){
//         System.out.println("Car engine started!");
//     }

    
// }
// class Scooty implements engine
// {
//     public void start(){
//         System.out.println("Scooty engine started!");
//     }
// }


// public class Abstraction{
//    public static void main(String args[]){
//     engine obj=new Car();
//     obj.start();

//     engine obj1=new Scooty();
//     obj1.start();

//    } 
// }




//Multiple inheritance using interfaces:




interface start{
    void on();
}
interface close{
    void off();
}
class Control implements start,close{
    public void on(){
        System.out.println("TV is on!");
    }
    public void off(){
        System.out.println("TV is off!");
    }

}



public class Abstraction{
   public static void main(String args[]){
    Control obj=new Control();
    obj.on();
    obj.off();
   
   } 
}

