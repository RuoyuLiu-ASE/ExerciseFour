package de.ima.ase.erp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public abstract class AbstractLegoCsvReader {
	
	public static final String DEFAULT_UNIT_DESCRIPTOR = "pct";

	public File[] findCsvFilesInFolder(File folder) {

		// finding all CSV files in folder
		return folder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".csv");
			}
		});
	}

	public List<String[]> readCsvDataFromFile(File file) {
		try {
			CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
			CSVReader reader = new CSVReaderBuilder(
					new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)).withCSVParser(parser)
							.withSkipLines(1).build();
			return reader.readAll();
		} catch (IOException e) {
			System.err.println("File: " + file + " not found or not accessible [" + e.getMessage() + "]");
			return null;
		}
	}

}
