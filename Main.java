public class Main {
    public static void main(String args[]){
      int n=12346;
      int last=n%10;
      int first=0;
      while(n!=0){
        first=n%10;
        n=n/10;
      }
      System.out.println(first+last);
    }
   
   

    
}
