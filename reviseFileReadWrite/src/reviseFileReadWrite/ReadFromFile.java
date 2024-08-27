/**
 * 
 */
package reviseFileReadWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class ReadFromFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String line;
		File file = new File("Info.txt");
		try {
			FileReader filereader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(filereader);

			line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
			filereader.close();

		} catch (IOException e) {
			System.out.println("Sorry problem reading file");
		}
	}

}
