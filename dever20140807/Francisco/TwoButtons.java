
import javax.sound.midi.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Object;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.sound.sampled.*;
import java.awt.Toolkit;

public class TwoButtons {
	JFrame frame;
	MyDrawPanel drawPanel;
	int drawWhat = 0;
	public static int contador1 = 0;
	public static int contador2 = 0;
	JLabel label;
	JLabel label2;

	public static void main(String[] args) {
		TwoButtons gui = new TwoButtons();
		gui.go();
	}
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = new JLabel("Contador de quadrados");
		label2 = new JLabel("Contador de Círculos");

		JButton button2 = new JButton("faz circulu");
		button2.addActionListener(new CirculoListener());
		
		JButton button = new JButton("faz kuadrado");
		button.addActionListener(new QuadradoListener());

		drawPanel = new MyDrawPanel();

		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.NORTH, button2);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.getContentPane().add(BorderLayout.EAST, label2);

		frame.setSize(600,600);
		frame.setVisible(true);


      
	}

	

	class QuadradoListener implements ActionListener {
		public void actionPerformed(ActionEvent event){
			


			
			drawWhat = 1;
			frame.setSize(1000,1000);
			drawPanel.repaint();
			contador1++;
			label.setText("Quantidade de Quadrados :" + contador1);
			//frame.getContentPane().add(BorderLayout.WEST,"quantidade de kuadrados" contador1);			
			Toolkit.getDefaultToolkit().beep();
		}
	}		
	class CirculoListener implements ActionListener {
		public void actionPerformed(ActionEvent event){
			
			drawWhat = 2;
			drawPanel.repaint();
			contador2++;
			label2.setText("Quantidade de Circulos :" + contador2);
			
			//frame.getContentPane().add(BorderLayout.EAST,"quantidade de circulos" contador2);
			Toolkit.getDefaultToolkit().beep();
		}
	}
	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics graph){
			Graphics2D g2d = (Graphics2D) graph;

			float opacity = (float) (Math.random());

			int x = (int) (Math.random( )*600);
			int y = (int)(Math.random( )*600);				

			int w = (int) (Math.random( )*300);

			int r = (int) (Math.random( )*256);
			int g = (int)(Math.random( )*256);
			int b = (int)(Math.random( )*256);
			Color randomColor = new Color(r, g, b);

			g2d.setColor(randomColor);
			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));

			if (drawWhat == 1){
				g2d.fillRect(x,y,w,w);	
			}
			else if (drawWhat == 2) {
				g2d.fillOval(x,y,w,w);					
			}
		}
	}
}		

	



	
