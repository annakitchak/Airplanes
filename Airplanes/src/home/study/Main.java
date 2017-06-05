package home.study;

public class Main {

	public static void main(String[] args) {
		PlaneControlPanel controlPanel = new PlaneControlPanel(120, 40, 4000);
		Cy27 cy27 = new Cy27(controlPanel);
		cy27.startEngine();
		cy27.takeOffPlane();
		cy27.getControlPanel().moveUp();
		cy27.getControlPanel().moveDown();
		cy27.getControlPanel().moveRight();
		cy27.getControlPanel().moveLeft();
		cy27.stealth();
		cy27.nuclearAttack();
		cy27.turbo();
		cy27.landingPlane();
	}
}
