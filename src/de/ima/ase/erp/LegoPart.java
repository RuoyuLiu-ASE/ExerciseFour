package de.ima.ase.erp;

public class LegoPart extends Part {

	private String color;

	private String imageUrl;
	
	public LegoPart(String id, String name, String color, String imageUrl) {
		super(id, name);
		setColor(color);
		setImageUrl(imageUrl);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return super.toString() + ", Color: " + getColor();
	}
}
