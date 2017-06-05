package home.study;

public abstract class Plane {
	public void startEngine(){
		int time = (int) (Math.random()*60);
		System.out.println("Engines are started! "+time+" minutes left to take off the plane.");
	}
	public void takeOffPlane(){
		int distance = (int) (Math.random()*1000);
		System.out.println("The plane will be able to fly "+distance+" km.");
	}
	public void landingPlane(){
		System.out.println("The plane is landing!");
	}
	
}
