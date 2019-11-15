package de.ima.ase.erp;

import java.io.File;

/**
 * @author: Alan
 * @create: 2019-11-15 14:29
 * @function:
 * @version:
 * @important value:
 */
public class WarehouseCsvReader extends AbstractLegoCsvReader {
    public void addFileToWarehouse(Warehouse warehouse, File csvFile, PartBase partBase){
        //Read data from csv
        // 查询文件是否存在？
        // StockIn part
        // 告诉Warehouse，把part 和 id 建立起联系，方便后面查找？？？

    }

    public void addFolderToWarehouse(Warehouse warehouse, File csvFile, PartBase partBase) {
        // Read data from a folder which has csvFiles
    }
}
