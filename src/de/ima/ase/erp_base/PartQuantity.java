package de.ima.ase.erp_base;

public class PartQuantity {

	private double quantity;
	
	private String unitDescriptor;

	public PartQuantity(String unitDescriptor, double quantity) {
		setQuantity(quantity);
		setUnitDescriptor(unitDescriptor);
	}
	
	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getUnitDescriptor() {
		return unitDescriptor;
	}

	public void setUnitDescriptor(String unitDescriptor) {
		this.unitDescriptor = unitDescriptor;
	}
	
	@Override
	public String toString() {
		return getQuantity() + (getUnitDescriptor() != null ? getUnitDescriptor() : "");
	}
}
