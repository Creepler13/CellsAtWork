package base;

import java.util.ArrayList;
import java.util.HashMap;

public class CellRegistry {

	private HashMap<EntityType, ArrayList<Entity>> registry = new HashMap<>();;

	public void addEntity(Entity entity) {
		if (!registry.containsKey(entity.getType()))
			registry.put(entity.getType(), new ArrayList<Entity>());
		registry.get(entity.getType()).add(entity);
	}

	public void removeEntity(Entity entity) {
		if (registry.containsKey(entity.getType()))
			registry.get(entity.getType()).remove(entity);
	}

	public ArrayList<Entity> getEntitys(EntityType type) {
		return registry.get(type);
	}

	public ArrayList<Entity> getEntitys() {
		ArrayList<Entity> outList = new ArrayList<Entity>();
		for (ArrayList<Entity> list : registry.values()) {
			outList.addAll(list);
		}
		return outList;
	}

}
