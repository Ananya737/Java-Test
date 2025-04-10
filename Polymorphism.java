
// //Compile-time Polymorphism: Function Overloading-

// class One{
//     void show(){
//         System.out.println("Hello");
//     }

//     void show(int a){
//         System.out.println(a);
//     }
// }


// public class Polymorphism {
//     public static void main(String args[]){

//         One obj=new One();
//         obj.show(9);

//     }
    
// }



//Run-time Polymorphism: Function Overriding-



class One{
   void show(){
    System.out.println("hello");
   }
    
}
class Two extends One
{
    void show(){
        System.out.println("Method overridden!");
    }

}

public class Polymorphism {
    public static void main(String args[]){
    One obj=new Two();
    obj.show();

    One obj1=new One();
    obj1.show();


    }
    
}




