package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(0.5, 0.5, 0.2, 0.12);
		
		
		StdDraw.setPenColor(96, 193, 96);
		StdDraw.filledRectangle(0.5, 0.58, 0.2, 0.04);
		
		
		StdDraw.setPenColor(229, 250, 229);
		StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.04);
		
		StdDraw.setPenColor(116, 226, 116);
		StdDraw.filledRectangle(0.5, 0.42, 0.2, 0.04);
		
		StdDraw.setPenColor(192, 82, 82);
		StdDraw.filledCircle(0.5, 0.5-.025, 0.05);
		
		StdDraw.filledCircle(0.47, 0.58-.025, 0.02);
		StdDraw.filledCircle(0.53, 0.58-.025, 0.02);
		StdDraw.filledCircle(0.43, 0.54-.025, 0.02);
		StdDraw.filledCircle(0.57, 0.54-.025, 0.02);
	}
}