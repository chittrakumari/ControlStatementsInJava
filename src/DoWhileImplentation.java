/*
Create an application called Magical Number game.
This application will ask a user to enter a number and you will match that number with your selected Magical
number ,if matched then user wins,if not user user will enter number again,user has the option to exit by
pressing 0.
 */
import java.util.Scanner;
public class DoWhileImplentation {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int magicalNumber=6;
        int number;
        System.out.println("Welcome to Magical Number Game");
        do{
            System.out.println("Enter a number.Press 0 to exit the game:");
            number=obj.nextInt();
            if(number==magicalNumber)
            {
                System.out.println("Congrats! You win the game");
                break;
            }
            else if(number!=0)
            {
                System.out.println("Try again");
            }
        } while(number != 0);
        System.out.println("Thanks for playing the game");
        obj.close();

    }

}
