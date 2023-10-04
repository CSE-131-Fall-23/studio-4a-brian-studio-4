package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
			String shapeType = in.next();
			int redComponent = in.nextInt();
			int greenComponent = in.nextInt();
			int blueComponent = in.nextInt();
			boolean isFilled = in.nextBoolean();
			double parameterone = in.nextDouble();
			double parametertwo = in.nextDouble();
			double parameterthree = in.nextDouble();
			double parameterfour = in.nextDouble();
			if (shapeType.equals("triangle")) {
				double parameterfive = in.nextDouble();
				double parametersix = in.nextDouble();
			
			}
			if (shapeType.equals("rectangle")) {
				StdDraw.rectangle(parameterone, parametertwo, parameterthree, parameterfour);
			}
			if (shapeType.equals("ellipse")) {
				StdDraw.ellipse(parameterone, parametertwo, parameterthree, parameterfour);
			}
			
	}
		
}

