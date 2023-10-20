package com.ceiling;

public class Fan {
	
	private int speedRotations;
	private int currentRotation;
	private boolean reversed;
	public int getSpeedRotations() {
		return speedRotations;
	}
	public void setSpeedRotations(int speedRotations) {
		this.speedRotations = speedRotations;
	}
	public int getCurrentRotation() {
		return currentRotation;
	}
	public void setCurrentRotation(int currentRotation) {
		this.currentRotation = currentRotation;
	}
	public boolean isReversed() {
		return reversed;
	}
	public void setReversed(boolean reversed) {
		this.reversed = reversed;
	}
	public Fan(int speedRotations, int currentRotation, boolean reversed) {
		super();
		this.speedRotations = speedRotations;
		this.currentRotation = currentRotation;
		this.reversed = reversed;
	}
	public Fan() {
		
	}
	
	public void pullIncrease() {
		if(this.currentRotation<this.speedRotations)
			this.currentRotation = this.currentRotation+1;
		else{
			this.currentRotation = 0;
      this.reversed = false;
    }
	}
	
	public void pullReverse() {
	
      this.reversed=!this.reversed;
     
	}
	
	public void showCurrentFanSetting() {
		System.out.println("Fan is at Speed "+this.currentRotation+", reversed is: "+this.reversed);
	}
}