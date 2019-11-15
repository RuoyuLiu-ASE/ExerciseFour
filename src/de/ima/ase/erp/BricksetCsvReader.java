package de.ima.ase.erp;

import java.io.File;
import java.util.List;

public class BricksetCsvReader extends AbstractLegoCsvReader {

	private static final int EXPECTED_LENGTH = 9;

	private static final int IDX_PARTID = 1;
	private static final int IDX_QUANTITY = 2;
	private static final int IDX_COLOR = 3;
	private static final int IDX_PARTNAME = 6;
	private static final int IDX_IMAGE_URL = 7;

	public void addFolderToBase(PartBase base, File csvFolder) {

		// finding all CSV files in folder
		File[] csvFiles = findCsvFilesInFolder(csvFolder);

		// loading each of found csv file into product base
		for (File csvFile : csvFiles) {
			addFileToBase(base, csvFile);
		}
	}

	public void addFileToBase(PartBase base, File csvFile) {

		// reading data from csv file
		List<String[]> entries = readCsvDataFromFile(csvFile);
		if (entries == null || entries.size() == 0) {
			return;
		}

		// create product using file name information
		String fileName = csvFile.getName();
		String productId = fileName.substring(0, fileName.indexOf('(') - 1);
		String productName = fileName.substring(fileName.indexOf('(') + 1, fileName.indexOf(')'));
		Product product = new Product(productId, productName);

		// create new parts for each entries and add them to product
		for (String[] entry : entries) {
			if (entry.length < EXPECTED_LENGTH) {
				continue;
			}

			// extract part information from array
			String id = entry[IDX_PARTID];
			Part part = base.find(id);
			if (part == null) {
				part = new LegoPart(id, entry[IDX_PARTNAME], entry[IDX_COLOR], entry[IDX_IMAGE_URL]);
				base.add(part);
			}

			// extract quantity information
			int quantity = Integer.parseInt(entry[IDX_QUANTITY]);
			product.addRequirement(part, new PartQuantity(DEFAULT_UNIT_DESCRIPTOR, quantity));
		}
		base.add(product);
	}

}
