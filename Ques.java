
class Students{
    int students[];
    //Constructor
    Students(int arr[]){
        students=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            students[i]=arr[i];
        }
    }

    void sort(){
        for(int i=0;i<students.length;i++){
            for(int j=i+1;j<students.length;j++){
                if(students[i]>students[j]){
                    int temp=students[i];
                    students[i]=students[j];
                    students[j]=temp;
                }
            }
            
        }

        
    }
    void display(){
        for(int i:students){
            System.out.print(i+" ");
        }
    }

   
}

public class Ques {
    public static void main(String args[]){
        int arr[]={70,60,50,80,10};
        Students obj=new Students(arr);
        obj.sort();
        obj.display();


    }
    
}
