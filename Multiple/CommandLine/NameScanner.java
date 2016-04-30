import java.util.Scanner;

public class NameScanner{

    public static void main(String args[]){
	
	// Grab name and age from command line
	// Variables
	// arguments in command line start with index 0
	// EX: args[0]... args[1]... args[2]..
	
	// A string will be the first commmand line argument
	String prompt = args[0];
	System.out.println(prompt);
	
	String name;
	int age;

	Scanner in = new Scanner(System.in);
	name = in.nextLine();
	age = in.nextInt();
	System.out.println(" Hello "+ name + "Nice To meet you\n You are " +age+ " years old ");

    }




}
