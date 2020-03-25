import java.util.Scanner;

public class PrimeNumbers {

   public void primes(int n) {
       boolean[] primes = new boolean[n + 1];
       for (int i = 2; i < primes.length; i++) {
           primes[i] = true;
       }
       int num = 2;
       while (true) {
           for (int i = 2;; i++) {
               int multiple = num * i;
               if (multiple > n) {
                   break;
               } else {
                   primes[multiple] = false;
               }
           }
           boolean nextMultiplier = false;
           for (int i = num + 1; i < n + 1; i++) {
               if (primes[i]) {
                   num = i;
                   nextMultiplier = true;
                   break;
               }
           }
           if (!nextMultiplier) {
               break;
           }
       }
       int count=0;
       System.out.println("\nPrime numbers are:\n");
       for (int i = 0; i < primes.length; i++) {
           if (primes[i]) {
               System.out.print(" "+i);
               count++;
           
               if(count%10==0){
           System.out.print("\n");
}
           }
       }
   }
public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number you want to know prime numbers:\n");
       int n = scanner.nextInt();
       System.out.println(n+"\n");
       PrimeNumbers p = new PrimeNumbers();
       p.primes(n);
   }

}