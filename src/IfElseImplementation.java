/*
Input a number from the user and check if its even or odd.
 */
import java.util.Scanner;
public class IfElseImplementation {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=obj.nextInt();
        if(number%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
        obj.close();
    }
}
