package task_1;

public class Main {
	public static void main(String[] args) {
		
		Robot robot = new Robot();
		CoffeRobot coffeRobot = new CoffeRobot();
		RobotDancer robotDancer = new RobotDancer();
		RobotCoocker robotCoocker = new RobotCoocker();
		
		robot.work();
		coffeRobot.work();
		robotDancer.work();
		robotCoocker.work();
		
		Robot[] robotsArray = {robot, coffeRobot, robotDancer, robotCoocker};
		
		for(int i = 0; i < robotsArray.length; i++) {
			robotsArray[i].work();
		}
	}

}
