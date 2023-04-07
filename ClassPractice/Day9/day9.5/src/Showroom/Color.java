package Showroom;

public enum Color {
	WHITE(1000), BLACK(2000), SLIVER(3000), BLUE(4000), RED(8000);

	private int colorCost;
	Color(int colorCost)
	{
		this.colorCost =colorCost;
	}
	public int getColorCost() {
		return colorCost;
	}
	public void setColorCost(int colorCost) {
		this.colorCost = colorCost;
	}
	
	@Override
	public String toString() {
		return name().toLowerCase()+ " Price "+ colorCost;
	}
}
