package com.ceiling;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fan fan = new Fan();
		fan.setSpeedRotations(3);
		fan.setCurrentRotation(0);
		fan.pullIncrease();
		fan.pullIncrease();
		fan.pullReverse();
		fan.pullIncrease();
		fan.pullIncrease();
		fan.pullIncrease();
		fan.showCurrentFanSetting();
    }
}
