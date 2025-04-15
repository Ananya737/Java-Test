public class Main {
    public static void main(String args[]){
        
      int n=10;
      if(n<10){
          System.out.println(n);  
      }
      else{
        int last=n%10;
        int first=0;
        while(n!=0){
          first=n%10;
          n=n/10;
        }
        System.out.println("The sum of first and last digit is "+ first+last);
      }
     
      }
     
   

    
}
