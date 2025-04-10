class One{
    int a=9;
    void display(){
        System.out.println(a);
    }
}
class Two extends One
{
    
}
public class Inheritance extends Two{
    public static void main(String args[]){

        Inheritance obj=new Inheritance();
        obj.display();
    }
    
}
