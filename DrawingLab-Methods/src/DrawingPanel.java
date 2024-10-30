import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DrawingPanel extends JPanel implements ActionListener {

	
	
	/*
	 * Use the drawing methods below to draw a smiley face
	 */
	public void paint(Graphics pen) {
		
		// *note* on computers (0,) is in top left corner, down is positive y, right is positive x (its just flipped) 
		// practice calling methods 
		//pen.drawLine(200, 0, 200, 200);
					// x , y ("top point") x, y ("bottom point") 
		
		
		
		
		
		
//	
//		public void setup(){
//			  size(800,600);
//			 
//			}
//
//			public void draw(){
//			  //Point A coordinates
//			  int x1 = 800;
//			  int y1 = 0;
//			 
//			  //Point B coordinates
//			  int x2 = 800;
//			  int y2 = 600;
//			 
//			  //loop that repeats 150 times
//			  int counter = 0; //control variable
//			  for(counter = 0; counter < 150; counter++){
//				//draw the line
//				line(x1,y1,x2,y2);
//			    
//				//update point A so that it moves down
//				 
//			    
//				//update point B so that it moves
//				

		
		
		/*

		// DRAW CUBE
			//draw rectangle 
				//drawRect(topLeftX, topLeftY, width, height) 
				pen.drawRect(50, 50, 300, 300);
				pen.drawRect(150, 150, 300, 300);
				pen.drawLine(50, 50, 150, 150);
				pen.drawLine(50, 350, 150, 450);
				pen.drawLine(350, 50, 450, 150);
				pen.drawLine(350, 350, 450, 450);



		// DRAW SPHERE
		//g.drawOval(int x, int y, int w, int h);
				pen.drawOval( 600, 20, 300, 300); // full circle 
				pen.drawOval( 600, 40, 300, 250); // hori inner # 1 circle  
				pen.drawOval( 600, 80, 300, 175); // hori inner # 2 circle  
				pen.drawOval( 600, 120, 300, 100); // hori inner # 3 circle  

				pen.drawOval( 620, 20, 250, 300); // vert inner # 1 full circle 
				pen.drawOval( 660, 20, 175, 300); // vert inner # 2 full circle 
				pen.drawOval( 700, 20, 100, 300); // vert inner # 2 full circle 




		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
				pen.drawOval( 750, 450, 200, 200); // (OUTER) full circle 
		
				//triangle 
				pen.drawLine(750, 560, 930, 490); //(top line)
				pen.drawLine(810, 640, 930, 490); // bottom line 
				pen.drawLine(750, 560, 810, 640); // bottom of tri 
				
				//inner circle 
				pen.drawOval( 775, 540, 75, 75);




		// DRAW APCS
				
		//A 
				//pen.setColor(Color.PINK);  
		pen.fillRect(50, 500, 30, 150); // vert (L) lines
		pen.fillRect(120, 500, 30, 150); // vert (R) lines 
		pen.fillRect(50, 500, 70, 35); // hori (TOP) lines
		pen.fillRect(50, 550, 70, 35); // hori (BOTTOM) lines
		
		//P 
		pen.fillRect(170, 500, 30, 150); // vert (L) line
		pen.fillRect(250, 500, 30, 75); // vert (R) lines 
		pen.fillRect(170, 500, 80, 35); // hori (TOP) lines
		pen.fillRect(170, 550, 110, 35); // hori (BOTTOM)lines

		//C 
		pen.fillRect(300, 500, 30, 150); // vert (L) line
		pen.fillRect(300, 500, 80, 35); // hori (TOP) lines
		pen.fillRect(300, 620, 80, 35); // hori (BOTTOM) lines

		//S 
		pen.fillRect(400, 500, 30, 65); // vert (LEFT) lines 
		pen.fillRect(475, 580, 30, 75); // vert (RIGHT) lines 
		pen.fillRect(430, 500, 80, 35); // hoir (TOP) lines
		pen.fillRect(400, 555, 105, 35); // hori (MID) lines
		pen.fillRect(400, 620, 105, 35); // hori (BOTTOM) lines






		// DRAW PACMEN FLOWER
		//drawArc(int x, int y, int w, int h, int start, int end);
		pen.fillArc(500,400,100,100, 220, 270); // left circ
		pen.fillArc(560,340,100,100, 135, 270); // top circ
		pen.fillArc(620,400,100,100, 45, 270); // right circ
		pen.fillArc(560,460,100,100, 315, 270); // top circ
		
		


		
	}
	
*/	
	

	public DrawingPanel() {
		JFrame f = new JFrame("Methods Lab");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,700);
		f.setResizable(false);
		f.add(this);
		
		Timer t = new Timer(16, this);
		t.start();
		f.setVisible(true);
	}
	 

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		

		
		

		
		
		
	}

}
