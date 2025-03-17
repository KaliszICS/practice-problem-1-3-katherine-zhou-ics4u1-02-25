import java.io.*; 
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String filename){
		Scanner input = new Scanner(System.in); 
        String file = input.nextLine();
        FileReader inputStream = null;
        try {
            inputStream = new FileReader(filename);
            int c;
            while ((c = inputStream.read()) != -1) {
                file += (char) c;
            }
            inputStream.close();
        } 
		catch (IOException e) {
            return null;
        }
        return file;
	}

    //help
	public static String backwardsReadFile(String filename){
		String file = "";
        FileReader inputStream = null;
        try {
            inputStream = new FileReader(filename);
            int c;
            while ((c = inputStream.read()) != -1) {
                file = (char) c + file;
            }
        } 
		catch (IOException e) {
        	System.out.println(e);

        } 
		finally {
            try {
                if (inputStream != null) {
                    inputStream.close(); 
                }
            } 
			catch (IOException e) {
                System.out.println(e);

            }
        }
        return file;
    }
}
