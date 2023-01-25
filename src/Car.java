
public class Car {
	
//	----- name -------
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	
//	----- gasoline -------
	private int gasoline;
	public int getGasoline() {
		return gasoline;
	}
	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}
	
//	----- speed -------
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int newSpeed) {
		speed=newSpeed;
	}
	
//	----- engineState -------
	private boolean engineState;
	public boolean isEngineState() {
		return engineState;
	}
	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.setName("Ford");
		car1.setSpeed(180);
		car1.setGasoline(10);
		car1.setEngineState(true);
		
		System.out.printf("The car's name is %s, its speed is %d, its gasoline is set to %d and its engine state is %b",car1.getName(),car1.getSpeed(),car1.getGasoline(),car1.isEngineState());
	}

}
