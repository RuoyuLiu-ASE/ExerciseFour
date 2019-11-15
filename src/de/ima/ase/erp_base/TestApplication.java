package de.ima.ase.erp_base;

public class TestApplication {

	public static void main(String[] args) {
		
		System.out.println(new PartQuantity("g", 100));
				
		// adding a first product (our apple pie) and parts
		Product applePie = new Product("P1", "apple pie");
		Part egg = new Part("1", "egg");
		Part sugar = new Part("2", "sugar");
		Part butter = new Part("3", "butter");
		Part milk = new Part("4", "milk");
		Part flour = new Part("5", "flour");
		Part bakingPowder = new Part("6", "baking pouder");
		Part apple = new Part("7", "apple");
		
		// defining the requirements of the apple pie
		applePie.addRequirement(egg, new PartQuantity(null, 4));
		applePie.addRequirement(sugar, new PartQuantity("g", 250));
		applePie.addRequirement(butter, new PartQuantity("g", 125));
		applePie.addRequirement(milk, new PartQuantity("ml", 100));
		applePie.addRequirement(flour, new PartQuantity("g", 300));
		applePie.addRequirement(bakingPowder, new PartQuantity("tsp.", 3));
		applePie.addRequirement(apple, new PartQuantity("m-size", 5));
		
		// defining the stock of our warehouse
		Warehouse warehouse = new Warehouse();
		warehouse.stockIn(egg, new PartQuantity(null, 10));
		warehouse.stockIn(sugar, new PartQuantity("g", 750));
		warehouse.stockIn(butter, new PartQuantity("g", 1125));
		warehouse.stockIn(milk, new PartQuantity("ml", 400));
		warehouse.stockIn(flour, new PartQuantity("g", 2100));
		warehouse.stockIn(bakingPowder, new PartQuantity("tsp.", 400));
		warehouse.stockIn(apple, new PartQuantity("m-size", 14));
		
		// let us print out the defined product and its requirement list
		System.out.print(applePie.getRequirements());
		System.out.print(warehouse);
		
		// let us produce some apple pies
		while (warehouse.isAvailable(applePie.getRequirements().get())) {
			System.out.println("Stocking out an applie pie");
			warehouse.stockOut(applePie.getRequirements().get());
		}
		System.out.print(warehouse);
	}
	
}
