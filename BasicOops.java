class One{
    int a=9;
    One(){
        System.out.println("Constructor is called");
        System.out.println("Value of a :" +a );

    }
    void display(){
       
        System.out.println("Method called!");
    }
   
}

public class BasicOops{
    public static void main(String args[]){
        System.out.println("Object is still not created!");

        One obj=new One();
        System.out.println("Object is created!");

    }
}




// Difference between strong implemented oops, pure oops and half oops.    Done!
// Class ko memory assign nhi hoti to kyun nhi hoti ?                      Done!
// Ek file mai ek hi class public hoti hai.                                Done!