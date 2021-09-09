package base;
import java.awt.Graphics2D;

import entitys.Macrophage;
import entitys.virus.Virus;
import visualls.Window;

public class Simulation {

	public static CellRegistry registry = new CellRegistry();

	public static int maxNormalCellCount = 50;

	public static void main(String[] args) {

		Window window = new Window(500, 500);

		
		registry.addEntity(new Virus(200,200));
		registry.addEntity(new Macrophage(50,50));
		
		while (true) {
			Graphics2D g2d = window.getGraphics2d();

			for (Entity e : registry.getEntitys()) {
				e.update();
				e.draw(g2d);
			}
			
			window.updateFrame();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
