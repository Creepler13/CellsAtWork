package visualls;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Window {

	private JBackgroundPanel JBC = new JBackgroundPanel();
	private JFrame frame = new JFrame();

	public Window(int width, int height) {

		frame.setBounds(0, 0, width, height);
		frame.setVisible(true);
		frame.add(JBC);
	
		img = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_ARGB);

	}

	private BufferedImage img;

	public void updateFrame() {
		JBC.setBackground(img);
		img = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_ARGB);
	}

	public Graphics2D getGraphics2d() {
		return (Graphics2D) img.createGraphics();
	}

}
