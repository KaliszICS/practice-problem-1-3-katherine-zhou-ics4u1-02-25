import java.io.*; 
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String filename){
		String file = "";
        try {
            FileReader inputStream = new FileReader(filename);
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
        	return null; 

        } 
		finally {
            try {
                if (inputStream != null) {
                    inputStream.close(); 
                }
            } 
			catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
        return file;
    }
}
