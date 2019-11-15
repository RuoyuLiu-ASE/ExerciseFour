package de.ima.ase.erp_base;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

	private Map<Part, PartQuantity> stock;

	public Warehouse() {
		stock = new HashMap<>();
	}

	public boolean isAvailable(Part part, PartQuantity quantity) {
		PartQuantity availableQuantity = stock.get(part);
		if (availableQuantity == null) {
			return false;
		}
		checkCompatibleUnitDescriptors(availableQuantity, quantity, true);
		return availableQuantity.getQuantity() >= quantity.getQuantity();
	}

	public boolean isAvailable(Map<Part, PartQuantity> partList) {
		for (Map.Entry<Part, PartQuantity> entry : partList.entrySet()) {
			if (!isAvailable(entry.getKey(), entry.getValue())) {
				return false;
			}
		}
		return true;
	}

	public void stockIn(Part part, PartQuantity quantity) {
		PartQuantity availableQuantity = stock.get(part);
		if (availableQuantity == null) {
			stock.put(part, quantity);
		} else if (checkCompatibleUnitDescriptors(availableQuantity, quantity, true)) {
			double newQuantity = availableQuantity.getQuantity() + quantity.getQuantity();
			availableQuantity.setQuantity(newQuantity);
		}
	}

	public void stockOut(Map<Part, PartQuantity> partList) {
		for (Map.Entry<Part, PartQuantity> entries : partList.entrySet()) {
			stockOut(entries.getKey(), entries.getValue());
		}
	}

	public void stockOut(Part part, PartQuantity quantity) {
		if (!isAvailable(part, quantity)) {
			throw new UnsupportedOperationException(
					"Cannot stock out " + part.getName() + " due to insufficient stock quantity");
		}
		PartQuantity availableQuantity = stock.get(part);
		double newQuantity = availableQuantity.getQuantity() - quantity.getQuantity();
		availableQuantity.setQuantity(newQuantity);
	}

	private boolean checkCompatibleUnitDescriptors(PartQuantity quantity1, PartQuantity quantity2,
			boolean throwException) {
		boolean result = (quantity1.getUnitDescriptor() == null && quantity2.getUnitDescriptor() == null)
				|| quantity1.getUnitDescriptor().equals(quantity2.getUnitDescriptor());
		if (!result && throwException) {
			throw new UnsupportedOperationException("Quantity descriptors are unequal [" + quantity1.getUnitDescriptor()
					+ "|" + quantity2.getUnitDescriptor());
		}
		return result;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("The warehouse contains:\n");
		for (Map.Entry<Part, PartQuantity> entry : stock.entrySet()) {
			buffer.append("\t").append(entry.getValue()).append(" ").append(entry.getKey()).append("\n");
		}
		return buffer.toString();
	}

}
