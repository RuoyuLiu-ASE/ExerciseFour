package de.ima.ase.erp_base;

public class Product extends Part {

	private PartRequirementList requirements;

	public Product(String id, String name) {
		super(id, name);
		this.requirements = new PartRequirementList(this);
	}

	public PartRequirementList getRequirements() {
		return requirements;
	}

	public boolean addRequirement(Part part, PartQuantity requirement) {
		return requirements.addPartAsRequirement(part, requirement);
	}

}
