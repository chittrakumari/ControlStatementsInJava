/*
Accept a number from user,and check if the given number is greater than 50 or not.
 */
import java.util.Scanner;
public class IfImplementation {
    public  static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
                int number=obj.nextInt();
                if(number>50)
                {
                    System.out.println("Number is greater than 50");
                }
                obj.close();
    }
}
