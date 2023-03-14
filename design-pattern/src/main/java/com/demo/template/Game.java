package com.demo.template;

public abstract class Game {

	public abstract void init();

	public abstract void start();

	public abstract void end();

	public void play() {
		init();
		start();
		end();
	}

}

class Mario extends Game
{

	@Override
	public void init() {
		System.out.println("Mario is initiated");
		
	}

	@Override
	public void start() {
		System.out.println("Mario is started");
		
	}

	@Override
	public void end() {
		System.out.println("Mario is ended");
		
	}
	
	
}

class Pubg extends Game
{

	@Override
	public void init() {
		System.out.println("Pubg is initiated");		
	}

	@Override
	public void start() {
		System.out.println("Pubg is started");
		
	}

	@Override
	public void end() {
		System.out.println("Pubg is endeds");
		
	}
	
	
}


