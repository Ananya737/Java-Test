
// class Students{
//     int students[];
//     //Constructor
//     Students(int arr[]){
//         students=new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             students[i]=arr[i];
//         }
//     }

//     void sort(){
//         for(int i=0;i<students.length;i++){
//             for(int j=i+1;j<students.length;j++){
//                 if(students[i]>students[j]){
//                     int temp=students[i];
//                     students[i]=students[j];
//                     students[j]=temp;
//                 }
//             }
            
//         }

        
//     }
//     void display(){
//         for(int i:students){
//             System.out.print(i+" ");
//         }
//     }

   
// }

// public class Ques {
//     public static void main(String args[]){
//         int arr[]={70,60,50,80,10};
//         Students obj=new Students(arr);
//         obj.sort();
//         obj.display();


//     }
    
// }




// class Cons{
//     String name;
//     double roll;
//     int marks;

//     Cons(String name){
//         this.name=name;
//     }
//     Cons(String name,double roll){
//         this.name=name;
//         this.roll=roll;
//     }
//     Cons(String name,double roll,int marks){
//         this.name=name;
//         this.roll=roll;
//         this.marks=marks;
//     }
  

// }

// public class Ques{
// public static void main (String args[]){
//     Cons obj=new Cons("Ananya");
//     Cons obj1=new Cons("Ananya",4444);
//     Cons obj2=new Cons("Ananya",5657,90);


// }
// }



class Reverse{
    int arr[];
    Reverse(int arr[]){
        this.arr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            this.arr[i]=arr[i];
        }
    }

    void rev(){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr [i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    void display(){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

public class Ques{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Reverse obj=new Reverse(arr);
        obj.rev();
        obj.display();

       

    }
}