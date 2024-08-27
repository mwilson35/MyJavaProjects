/**
 * 
 */
package reviseFileReadWrite;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class WriteAndRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "I go to QUB";
		
		File file= new File("Info.txt");
		
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write(text);
			
			//close
			bufferedWriter.close();
			fileWriter.close();
			
			System.out.println("File created and written to.3");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}

}
