package states;

import java.awt.Graphics;

import command.Command;
import main.Window;

public abstract class State {
	
	public static State currentState = null;
	
	protected Window window;
	
	public State(Window window){
		this.window = window;
	}
	
	public abstract void update(Command command);
	
	public abstract void render(Graphics g);
	
	
}
