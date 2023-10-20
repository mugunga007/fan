package com.ceiling;

public class Fan {
	// Configurable number of speed rotations
	private int speedRotations;

  // Current speed rotation
	private int currentRotation;

  // Value for reverse function
	private boolean reversed;

 // Setter for speed rotations
	public void setSpeedRotations(int speedRotations) {
		this.speedRotations = speedRotations;
	}

  // Setter for current speed rotation
	public void setCurrentRotation(int currentRotation) {
		this.currentRotation = currentRotation;
	}

  // setter for reverse function
	public void setReversed(boolean reversed) {
		this.reversed = reversed;
	}
	
  // Empty constructor for instatiation
	public Fan() {
		
	}
	
  // pull cord to rotate speed
	public void pullIncrease() {
		if(this.currentRotation<this.speedRotations)
			this.currentRotation = this.currentRotation+1;
		else{
			this.currentRotation = 0;
      this.reversed = false;
    }
	}
	
  // pull cord to reverse fan
	public void pullReverse() {
	
      this.reversed=!this.reversed;
     
	}
	
  // Display current fan settings
	public void showCurrentFanSetting() {
		System.out.println("Fan is at Speed "+this.currentRotation+", reversed is: "+this.reversed);
	}
}