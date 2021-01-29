package enums;

public enum Color {
	Red(255, 0, 0), Blue(0, 0, 255), Green(0, 255, 0), Yellow(255, 255, 0);
	
	private int[] colorValues = new int[3];
	
	Color(int red, int green, int blue) {
		colorValues[0] = red;
		colorValues[1] = green;
		colorValues[2] = blue;
	}

	boolean isBright() {
		return this == Yellow;
	}
	
	public int[] getColorValues(){
		return this.colorValues;
	}
	
}
