import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Plik implements Runnable {
	
	private String path;
	private String fileName;
	public Plik(String path)
	{
		this.path = path;
		this.fileName = fileName;
	}
	public void getFileFromPath()
	{
		File folder = new File(path);
		File[] listOfFile = folder.listFiles();
		for(int i=0;i<listOfFile.length;i++)
		{
			System.out.println(listOfFile[i]);
		}
	}
	@Override
	public void run() {
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
				System.out.println("Total number of line in this file is : " + lineCounter.getLineNumber());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}