import java.util.Scanner;


public class Method1 
{
static int diceTotal=0;
public static void main(String[] args) 
{
	//greetUser();
	//favoriteColor();
	rollDice();	
	
}
public static void rollDice()
{
	System.out.println("Roll two dice!");
	int die1=(int)(Math.random()*6)+1;
	int die2=(int)(Math.random()*6)+1;
	diceTotal=die1+die2;
	System.out.println("You rolled a "+ (diceTotal));
}
	

public static void greetUser() 

{
	Scanner userInput=new Scanner(System.in);
    System.out.println("What is your name");
    String name=userInput.nextLine();
    System.out.println("Hi,"+ name + "Nice to meet you!");
}
public static void favoriteColor()
{
	Scanner userInput=new Scanner(System.in);
    System.out.println("What is your favorite color");
    String favoriteColor=userInput.nextLine();
    System.out.println("Cool,"+ favoriteColor + "Is my fav too!");
}

}
