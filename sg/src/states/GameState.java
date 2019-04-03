package states;

import java.awt.Graphics;

import command.Command;
import main.Window;
import sokoban.Level;

public class GameState extends State{
	
	private Level level;
	
	public GameState(Window window) {
		super(window);
	}
	
	@Override
	public void update(Command c) {
		level.update(c, Window.l[Window.pos]);
	}

	@Override
	public void render(Graphics g) {
		level.render(g);
	}
	
	public void setLevel(Level level){
		this.level = level;
	}
	
}
