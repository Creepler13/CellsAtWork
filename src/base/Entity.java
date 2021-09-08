package base;

import java.awt.Graphics2D;

public abstract class Entity {

	private EntityType type;

	private int x, y;

	public Entity(EntityType type,int x,int y) {
		this.type = type;
		setX(x);
		setY(y);
		// TODO Auto-generated constructor stub
	}

	public EntityType getType() {
		return type;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public abstract void draw(Graphics2D g2d);

	public abstract void update();

}
