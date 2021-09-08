package entitys.cells;

import base.Entity;
import base.EntityType;

public abstract class Cell extends Entity {

	public Cell(EntityType type, int x, int y) {
		super(type, x, y);
	}

}
