class One{
    int arr[];
    One(int arr[]){
        this.arr=arr;
     }
     void display(){
        System.out.println(this.arr);
     }
}

public class Constructor{
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        One obj=new One(arr);
        obj.display();
    }
}