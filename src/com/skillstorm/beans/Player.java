package com.skillstorm.beans;

import java.util.Scanner;

public class Player {
	// I made Scanner static so I wouldn't have to use in.close();
	static Scanner in = new Scanner(System.in);

	private String name; // playerName
	private int str; // strength
	private int wis; // wisdom
	private int dex; // dexterity			

	///////////////////////Constructor//////////////////////////////////////
	// I created a default constructor just for practice
	public Player() {}

	// this will be the constructor I actually use
	public Player(String name, int str, int wis, int dex) {
		this.name = name;
		this.str = str;
		this.wis = wis;
		this.dex = dex;
	}
	///////////////////////////////////////////////////////////////////////	



	///////////////////////GETTERS & SETTERS////////////////////////////////
	// these methods get stuff and they set stuff

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getStr() {
		return this.str;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getWis() {
		return this.wis;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getDex() {
		return this.dex;
	}
	////////////////////////////////////////////////////////////////////////
}//class