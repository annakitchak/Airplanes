package home.study;

public class Cy27 extends Plane implements PossibilityOfPlane{
private PlaneControlPanel controlPanel;

public Cy27(PlaneControlPanel controlPanel) {
	super();
	this.controlPanel = controlPanel;
}

public PlaneControlPanel getControlPanel() {
	return controlPanel;
}

public void setControlPanel(PlaneControlPanel controlPanel) {
	this.controlPanel = controlPanel;
}

@Override
public void turbo() {
	int turbo =0;
	do{
	turbo = (int) (Math.random()*10000);}
	while(turbo <500||turbo>1500);
		System.out.println("Turbo mode is ON ! The plane is moving at a speed "+turbo+" km/hour.");
	
}

@Override
public void stealth() {
	int time = (int) (Math.random()*20);
	System.out.println("Stealth technology applied! The plane is invisible for "+time+" minutes.");
	
}

@Override
public void nuclearAttack() {
	int count = (int) (Math.random()*10);
	System.out.println(count+" nuclear warheads were dropped!");
}



}
