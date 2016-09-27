import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Plik implements Runnable {

	public void getFileFromPath(String path)
	{
		File folder = new File(path);
		File[] listOfFile = folder.listFiles();
		for(int i=0;i<listOfFile.length;i++)
		{
			System.out.println(listOfFile[i]);
		}
	}
	public void countLineInEachFile(String path, String fileName)
	{
		try {
			LineNumberReader lineCounter = new LineNumberReader(new InputStreamReader(new FileInputStream(path +"//" + fileName)));
			
			try {
				while(lineCounter.readLine() != null)
				{
					if(lineCounter.equals(null))
					{
						break;
					}
				}
				System.out.println("Total number of line in " + fileName + " is : " + lineCounter.getLineNumber());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		
	}

}
