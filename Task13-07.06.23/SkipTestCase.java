package testNG;

import org.testng.annotations.Test;

public class SkipTestCase {
	
		
		@Test(priority=0)
		public void startCar(){
			System.out.println("Start the car");
		}
		@Test(priority=4,enabled=false)
		public void playMusic(){
			System.out.println("Play Music");
		}
		@Test(priority=1)
		public void FirtGear(){
			System.out.println("First Gear");
		}
		@Test(priority=2)
		public void SecondGear(){
			System.out.println("Second Gear");
		}
		@Test(priority=3)
		public void ThirdGear(){
			System.out.println("Third Gear");
		

	}
}
