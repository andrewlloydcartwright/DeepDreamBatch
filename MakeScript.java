import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class MakeScript
{
	public static void main(String[] args) throws IOException
	{
		File imglist = new File("ImageList.txt");

		if (!imglist.exists())
		{
			JOptionPane.showMessageDialog(null, "FILE NOT FOUND!\nClosing the program now.") ;
			System.exit(0);
		}

		Scanner reader = new Scanner(imglist);
		PrintWriter imgscript = new PrintWriter("imgscript.py");

		while (reader.hasNext())
		{
			int img = reader.nextInt();			
			imgscript.println("python dreamify.py " + img + ".jpg " + img + "out.png;");
		}

		imgscript.close();

		JOptionPane.showMessageDialog(null, "The script has been written.\nNow terminating.");
		System.exit(0);
	}
}
