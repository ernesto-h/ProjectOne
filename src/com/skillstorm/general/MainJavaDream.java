package com.skillstorm.general;

import com.skillstorm.beans.Scenes;

public class MainJavaDream {
	public static void main (String[] args) {

		// this is where my main method is.
		// this is where I will run my game from.

		// this just creates a new scene object for me to be able to call my game method.
		Scenes sc = new Scenes();

		// this is my game method wrapped up into one method.
		sc.runJavaDream();

	}

}
