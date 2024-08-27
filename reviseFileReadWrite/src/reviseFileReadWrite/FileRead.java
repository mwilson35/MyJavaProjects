/**
 * 
 */
package reviseFileReadWrite;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * 
 */
public class FileRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File dir = new File("Micks files");
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("Dir created");
		} else {
			System.out.println("Dir already exists");
		}

		File file = new File(dir.getName() + "/QUB.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("File created");
			} catch (IOException e) {
					System.out.println("Unable to create file");
			}
		} else

		{
			System.out.println("File already exists");
		}
		System.out.println("Dir "+ dir.getAbsolutePath());
		System.out.println("File "+ file.getAbsolutePath());
		
		System.out.println("Last mod file "+file.lastModified());
		
		Date lastModDate= new Date(file.lastModified());
		System.out.println("Last mod date: "+ lastModDate);
		
		String[] allFiles=dir.list();
		System.out.println("Number of files "+allFiles.length );
		for(String fileName : allFiles) {
			System.out.println(fileName);
		}
		//delete the file
		file.delete();
		
		//dir.delete();
	}
}