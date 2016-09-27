
public class MainClass {

	public static String path="C://Users//Maciej//PAI//Zadanie1//file";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Plik pl = new Plik(path);
		pl.getFileFromPath();
		pl.run();
		
	}

}
