package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import command.Command;
import command.CommandList;
import sokoban.Level;

public class KeyBoard implements KeyListener{
	
	public static CommandList c;
	
	public static Command command;
	
	public static int com;
	
	public void update(){
		try {
			if (KeyBoard.c != null) {
				if (KeyBoard.c.getKey() != null) {
					command = KeyBoard.c.getKey();
				}
			}
		} catch(NullPointerException e) {
			System.out.println("Valor nulo acessado!");
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		KeyBoard.c = CommandList.values()[e.getKeyCode() % 37];
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		KeyBoard.c = CommandList.values()[CommandList.STOP.ordinal()];
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}

}
