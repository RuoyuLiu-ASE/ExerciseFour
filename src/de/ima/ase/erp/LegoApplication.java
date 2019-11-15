package de.ima.ase.erp;

import java.io.File;
import java.io.IOException;

public class LegoApplication {

	public static void main(String[] args) throws IOException {
		PartBase base = loadBaseFromProductDefinitions();
		System.out.println(base);

		//Load warehouse

		//

		Product product = (Product) base.find("75080-1");
		System.out.println(product.getRequirements());
	}

	private static PartBase loadBaseFromProductDefinitions() {
		PartBase base = new PartBase();
		new BricksetCsvReader().addFolderToBase(base, new File("./lego_files"));
		return base;
	}

}
