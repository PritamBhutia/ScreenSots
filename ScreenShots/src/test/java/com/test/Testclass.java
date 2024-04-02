package com.test;



import com.base.Baseclass;

public class Testclass extends Baseclass{
	public static void main(String[] args) throws Exception{
		Testclass obj = new Testclass();
		obj.DriverSetting("https://chat.openai.com/c/2b840cbe-1ea2-4b99-a0a5-a14b1cf7ae8b");
		obj.takeScreenshots();
		
	}

}
