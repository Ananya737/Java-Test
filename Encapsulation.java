
class One{
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public void getName(){
        System.out.println(name);
    }

}



public class Encapsulation {
    public static void main(String args[]){
        One obj=new One();
        obj.setName("Ananya");
        obj.getName();


        // obj.name="Ananya";  (Not allowed because name is private);
    }
    
}
