/*
Accept a number from the user and print its table
 */
import java.util.Scanner;
public class ForLoopImplementation {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a positive integer to print the table:");
        int number=obj.nextInt();
        int i;
        System.out.println("The table of "+number+" is:");
        for(i=1;i<=10;i++) {
            System.out.println(number+" x "+(i)+" = "+(number*i));
        }
        obj.close();
    }
}
