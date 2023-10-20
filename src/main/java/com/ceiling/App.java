package com.ceiling;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Creating instance of fan
        Fan fan = new Fan();

        // Setting speed rotations
		fan.setSpeedRotations(3);

        // Setting current rotation as there's no switch
		fan.setCurrentRotation(0);

        // speed rotator cord pulled
		fan.pullIncrease();

        // speed rotator cord pulled x2
		fan.pullIncrease();

        // reverse cord pulled
		fan.pullReverse();

        // speed rotator cord pulled x3
		fan.pullIncrease();

        // speed rotator cord pulled x4
		fan.pullIncrease();

        // speed rotator cord pulled x5
		fan.pullIncrease();

        // show current fan settings
		fan.showCurrentFanSetting();
    }
}
