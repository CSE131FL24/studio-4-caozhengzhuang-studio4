package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.3);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.5, 0.45, 0.2);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(0.5, 0.5, 0.2);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(0.5, 0.5, 0.08);
		StdDraw.setPenColor(Color.WHITE);
		double[] x = {0.4, 0.35, 0.3, 0.35};
		double[] y = {0.6, 0.7, 0.6, 0.5};
		StdDraw.filledPolygon(x,y);
		StdDraw.setPenColor(Color.WHITE);
		double[] m = {0.6, 0.65, 0.7, 0.65};
		double[] n = {0.6, 0.7, 0.6, 0.5};
		StdDraw.filledPolygon(m,n);
		
	}
}