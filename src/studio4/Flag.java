package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenRadius(.005);
		StdDraw.rectangle(.5,.5,.3,.2);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledCircle(.5, .5, .1);
		StdDraw.setPenColor(0, 0, 255);
		StdDraw.filledRectangle(.5,.5,.05,.05);
		
	}
}