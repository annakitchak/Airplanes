package home.study;

public class PlaneControlPanel {
	private int lengthOfPlane;
	private int widthOfPlane;
	private int weightOfPlane;
	
	public PlaneControlPanel(int lengthOfPlane, int widthOfPlane, int weightOfPlane) {
		super();
		this.lengthOfPlane = lengthOfPlane;
		this.widthOfPlane = widthOfPlane;
		this.weightOfPlane = weightOfPlane;
	}
	
	public int getLengthOfPlane() {
		return lengthOfPlane;
	}

	public void setLengthOfPlane(int lengthOfPlane) {
		this.lengthOfPlane = lengthOfPlane;
	}

	public int getWidthOfPlane() {
		return widthOfPlane;
	}

	public void setWidthOfPlane(int widthOfPlane) {
		this.widthOfPlane = widthOfPlane;
	}

	public int getWeightOfPlane() {
		return weightOfPlane;
	}

	public void setWeightOfPlane(int weightOfPlane) {
		this.weightOfPlane = weightOfPlane;
	}

	public void moveUp(){
		int distance = (int) (Math.random()*1000);
		System.out.println("The plane climbed "+distance+" meters up.");
	}
	public void moveDown(){
		int distance = (int) (Math.random()*500);
		System.out.println("The plane climbed "+distance+" meters down.");
	}
	public void moveRight(){
		int distance = (int) (Math.random()*1000);
		System.out.println("The plane moves "+distance+" meters to the right.");
	}
	public void moveLeft(){
		int distance = (int) (Math.random()*1000);
		System.out.println("The plane moves "+distance+" meters to the left.");
	}
}
