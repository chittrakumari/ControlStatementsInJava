/*
Create an Application which accepts numbers from user and stop when gets 3 even numbers
 */
import java.util.Scanner;
public class whileImplementation {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int c=0;
        while(c!=3){
            System.out.println("Enter a number:");
            int number=obj.nextInt();
            if(number%2==0)
            {
                c=c+1;
            }
        }
        System.out.println("We got three numbers");
        obj.close();
    }
}
