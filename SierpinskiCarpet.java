/************************************
 * Sushant Raj
 * 12/2/15
 * AP CS G
 **********************************/
import java.awt.*;
import java.util.*;
public class SierpinskiCarpet {
	public static final int PANELSIZE = 729;
/*
 * create a method that draws a square that fulfills the requirements, then repeat the method , but divide the length of the square by 3
 * use a while loop to repeat, set the condition for the pixel size to be >0
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingPanel panel = new DrawingPanel(PANELSIZE,PANELSIZE);
		panel.setBackground(Color.BLACK);
		Graphics g = panel.getGraphics();
		int size = PANELSIZE;
		drawSquare(g, panel, 1, 1, size, size, size);
	}
	public static void drawSquare(Graphics g, DrawingPanel panel, int squareNum, int iterations, int size, int x, int y){
		Random rand= new Random();
		Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		if(size>0){
		g.setColor(color);
		panel.sleep(1);
		g.fillRect(x/3, y/3, size/3, size/3);
		
		





		drawSquare(g, panel, squareNum, iterations, size/3, x+size/3, y+ (size*4)/3);
		drawSquare(g, panel, squareNum, iterations, size/3, x+(size*4)/3, y+(size*4)/3);
		drawSquare(g, panel, squareNum, iterations, size/3, x-(size*2)/3, y+(size*4)/3);
		

		drawSquare(g, panel, squareNum, iterations, size/3, x+(size*4)/3, y+size/3);
		drawSquare(g, panel, squareNum, iterations, size/3, x-(size*2)/3, y+ size/3);

		drawSquare(g, panel, squareNum, iterations, size/3, x+(size*4)/3,  y- 2*size/3);
		drawSquare(g, panel, squareNum, iterations, size/3, x-(size*2)/3,  y- 2*size/3);
		drawSquare(g, panel, squareNum, iterations, size/3, x+size/3, y- 2*size/3);
		

		
		
		}
	}

}
