
//public class Lines2 extends DrawingPanel {

	
	import java.awt.Graphics;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.Timer;

	public class Lines2 extends JPanel implements ActionListener {

		
		
		/*
		 * Use the drawing methods below to draw a smiley face
		 */
		public void paint(Graphics pen) {
			
			// *note* on computers (0,) is in top left corner, down is positive y, right is positive x (its just flipped) 
			// practice calling methods 
			//pen.drawLine(200, 0, 200, 200);
						// x , y ("top point") x, y ("bottom point") 
			
			
			
			
			
	
		

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

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

	}

