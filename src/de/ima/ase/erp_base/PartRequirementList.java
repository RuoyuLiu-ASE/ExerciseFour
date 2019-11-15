package de.ima.ase.erp_base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PartRequirementList {

	private Map<Part, PartQuantity> partList;

	private Product product;

	public PartRequirementList(Product product) {
		this.product = product;
		partList = new HashMap<>();
	}

	public boolean addPartAsRequirement(Part part, PartQuantity quantity) {
		return partList.put(part, quantity) != null;
	}

	public Map<Part, PartQuantity> get() {
		return Collections.unmodifiableMap(partList);
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Requirements of ").append(product.getName()).append(":\n");
		for (Map.Entry<Part, PartQuantity> entry : partList.entrySet()) {
			buffer.append("\t").append(entry.getValue()).append(" ").append(entry.getKey().getName()).append("\n");
		}
		return buffer.toString();
	}

}
