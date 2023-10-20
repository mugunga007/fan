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
        fan.showCurrentFanSetting();

        // speed rotator cord pulled x2
		fan.pullIncrease();
        fan.showCurrentFanSetting();

        // reverse cord pulled
		fan.pullReverse();
        fan.showCurrentFanSetting();

        // speed rotator cord pulled x3
		fan.pullIncrease();
        fan.showCurrentFanSetting();

        // speed rotator cord pulled x4
		fan.pullIncrease();
        fan.showCurrentFanSetting();

        // speed rotator cord pulled x5
		fan.pullIncrease();
        fan.showCurrentFanSetting();
       
    }
}
