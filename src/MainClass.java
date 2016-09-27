import java.util.Scanner;

public class MainClass {

	public static String path="C://Users//Maciej//PAI//Zadanie1//file";
	public static String userInput;
	public static String[] fileName;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Type what file u wanna read separate ' ' ");
		Scanner scan = new Scanner(System.in);
		userInput = scan.nextLine(); // fileName from user 
		fileName = userInput.split(" ");
		
		Plik pl = new Plik(path);
		pl.getFileFromPath();
		pl.run();
		
	}

}
