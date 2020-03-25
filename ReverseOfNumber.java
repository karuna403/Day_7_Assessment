import java.util.Scanner;
 public class ReverseOfNumber{
     public static void main(String[] args){
         
         System.out.println("enter number:");
         //Enter input by the Scanner
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         System.out.println(n);
          int r=0;
         //here we are using while loop 
         while(n!=0){
             int x=n%10;
             r=r*10+x;
             n=n/10;
            }//end of the while loop
            
         System.out.println("reverse of a number is: "+r);
         
     }
 }