import java.util.Scanner;
public class Password {
             public static final int PASSWORD_LENGTH = 8;
public static void main(String[] args) {
    //here we are entering the input by the Scanner
        Scanner input = new Scanner(System.in);
        //printing the conditions for entering the password;
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n\n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): \n");
        String s = input.nextLine();
        System.out.println(s+"\n");
// here printing the output
        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }
    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        //here we are writing the for loop for counting the characters and numbers
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >=2 && numCount >= 2);
    }
//here writing the method for returning the characters
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
}
//here we are writing the method for returning the numbers
    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
}