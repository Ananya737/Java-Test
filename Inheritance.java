class One{
    int a=9;
    void display(){
        System.out.println(a);
    }
}
class Two extends One
{
    
}


public class Inheritance {
    public static void main(String args[]){

        Two obj=new Two();
        obj.display();
    }
    
}
