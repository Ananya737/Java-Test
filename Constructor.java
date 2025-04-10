
// class One{


//     //Shallow Copy of primitive datatypes: Value gets copied;
//     int b;
//     One(int b){
//         this.b=b;
//     }
//     One(One obj){
//         this.b=obj.b;
//     }
//     void display(){
//         System.out.println(this.b);
//     }
// }




// public class Constructor {
//     public static void main(String args[]){
//         One obj=new One(9);
//         One obj1=new One(obj);

//         obj.display();
//         obj1.display();

//         obj.b=10;
//         obj.display();
//         obj1.display();
        
//     }
// }










//Shallow Copy of Resference type: copies address and not value;

// class One{
//     int arr[];
//     One(int arr[]){
//         this.arr=arr;
//      }
//      One(One obj){
//         this.arr=obj.arr;
//      }
//      void display(){
//         for(int i:arr){
//             System.out.print(i + " ");
//          }
//          System.out.println();
//      }
// }

// public class Constructor{
//     public static void main(String args[]){
//         int arr[]={1,2,3,4};

//         One obj=new One(arr);
//         One obj1=new One(obj);

//         obj.display();
//         obj1.display();

//         obj.arr[0]=9;

//         obj.display();
//         obj1.display();

//     }
// }





// Deep copy : Allocates new memory to the object.


class One{
    int arr[];
    One(int arr[]){
        this.arr=arr;
    }
    One(One obj){
        this.arr=new int[obj.arr.length];
        for(int i=0;i<obj.arr.length;i++){
            this.arr[i]=obj.arr[i];
        }
    }
    void display(){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

public class Constructor{
    public static void main(String args[]){
        int arr[]={1,2,3};
        One obj=new One(arr);
        One obj1=new One(obj);
      
        obj.display();
        obj1.display();

        obj.arr[0]=9;

        obj.display();
        obj1.display();
    
    }
}