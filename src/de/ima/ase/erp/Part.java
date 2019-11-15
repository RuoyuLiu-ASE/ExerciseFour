package de.ima.ase.erp;

public class Part {

	private String id;
	
	private String name;

	public Part(String id, String name) {
		setId(id);
		setName(name);
	}
	
	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return getName() + " [id: " + getId() + "]";
	}
}
