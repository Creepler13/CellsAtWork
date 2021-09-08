package entitys;

import java.awt.Color;
import java.awt.Graphics2D;

import base.Entity;
import base.EntityType;
import base.Simulation;

public class Macrophage extends Entity {

	public Macrophage(int x, int y) {
		super(EntityType.MACROPHAGE, x, y);
	}

	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(Color.BLUE);
		g2d.fillRect(getX(), getY(), 20, 20);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		Entity closestVirus = null;
		for (Entity virus : Simulation.registry.getEntitys(EntityType.VIRUS)) {
			if (closestVirus == null)
				closestVirus = virus;

			closestVirus = Math.sqrt(Math.pow(closestVirus.getY(), 2) + Math.pow(closestVirus.getX(), 2)) < Math
					.sqrt(Math.pow(virus.getY(), 2) + Math.pow(virus.getX(), 2)) ? virus : closestVirus;

		}

		if (closestVirus != null) {
			setX((getX() - closestVirus.getX() > 0 ? -5 : 5) + getX());
			setY((getY() - closestVirus.getY() > 0 ? -5 : 5) + getY());

		}

	}

}
