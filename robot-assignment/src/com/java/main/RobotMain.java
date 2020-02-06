package com.java.main;

import com.java.implementation.PrototypeRobot;
import com.java.interfaces.RobotService;

/*
 * @author: Randhir Kumar
 */
public class RobotMain {
	public static void main(String[] args){
		RobotService reboteService = new PrototypeRobot();
		reboteService.walk(3.5);
		reboteService.carry(5);
		reboteService.walkAndCarry(1,13);
		reboteService.setCharging(70);
		reboteService.walkAndCarry(2,3);
		reboteService.displayPrice(18);
	}
}
