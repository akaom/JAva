import java.io.*;

public class FileCreateProgram {
    public static void main(String args[]) {
    byte cities[] = {'h','e','l','l'};
    
  
            // Create a new file
            File f1 = new File("example0w0.txt");

	      try
		{
		FileOutputStream inputfile = new FileOutputStream(f1);
		inputfile.write(cities);

		FileInputStream outfile = new FileInputStream(f1);
		int b;
		while((b=outfile.read())!=-1) {
		System.out.println((char)b);
		} }

		catch(Exception e) {
		System.out.println("error");
		}
    }
}
