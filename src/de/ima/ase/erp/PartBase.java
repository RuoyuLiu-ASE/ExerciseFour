package de.ima.ase.erp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/*
map the part and their id

 */
public class PartBase {

	private Map<String, Part> idMap;

	public PartBase() {
		idMap = new HashMap<>();
	}

	public Part add(Part part) {
		if (idMap.containsKey(part.getId())) {
			return null;
		}
		idMap.put(part.getId(), part);
		return part;
	}

	public void addAll(Part... parts) {
		for (Part part : parts) {
			add(part);
		}
	}

	public Part find(String id) {
		return idMap.get(id);
	}

	public Collection<Part> getAll() {
		return Collections.unmodifiableCollection(idMap.values());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product base contains ").append(idMap.size()).append(" parts or products\n");
		return builder.toString();
	}

}
