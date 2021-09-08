package base;

public class Entity {

	private EntityType type;

	private int x, y;

	public Entity(EntityType type) {
		this.type = type;
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

}
