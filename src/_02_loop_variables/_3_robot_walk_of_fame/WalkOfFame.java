
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();

		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setSpeed(100);
		rob.setX(0);
		// 2. Make the robot draw a star shape. Hint: angle=144.
		rob.penDown();
		int xcounter = 0;
		int count2 = 0;

		while (count2 < 5) {
			int count = 0;
			rob.setX(count2*50);
			while (count < 5) {
				rob.move(30);
				rob.turn(144);
				count += 1;
				
			}
			count2++;
		}
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
