package controller;
import chessGame.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import chessGame.ChessBoard;
import model.Interface;


 
public class InterfaceControls implements ActionListener{
		// TODO Auto-generated constructor stub
	   @Override
	    public void actionPerformed(ActionEvent e) {

	    	if(e.getSource()==(Interface.startButton)) {
	    		Interface.turn = 1;
	    		Interface.refreshBoard();

	    	}
	    	else if(e.getActionCommand()=="restart") {
	    		if(Interface.turn==1) {
	    			Interface.restart1=true;
	    			
	    		}
	    		else if(Interface.turn ==0) {
	    			Interface.restart0=true;
	    		}
	    		
	    		boolean restartTrue = Interface.checkRestart();
	    		if(restartTrue) {
	    			JOptionPane.showMessageDialog(new JFrame(), "Both player have chosen to restart, the game is now reset");
	    			Interface.wScore++;
	    			Interface.bScore++;
	    			Interface.restart0=false;
	    			Interface.restart1=false;
	    			Interface.startNewGame();
	    		}
	    		else {
	    			Interface.switchTurn();
	    		}

	    		Interface.refreshBoard();

	    	}
	    	else if(e.getActionCommand()=="forfeit") {
	    		JOptionPane.showMessageDialog(new JFrame(), "You have forfeited the game");
	    		if(Interface.turn==1) {
	    			Interface.wScore++;
	    		}
	    		else if(Interface.turn==0) {
	    			Interface.bScore++;
	    		}
	    		Interface.startNewGame();
	    	}
	    	else if(e.getActionCommand()=="score") {
	    		JOptionPane.showMessageDialog(new JFrame(), "White Player: " + Interface.wScore + " Black Player: " + Interface.bScore);
	    		
	    	}
	    	else if(e.getActionCommand()=="weird") {
	    		Interface.test = new ChessBoard();
	    		Interface.test.initWeirdGame();
	    		Interface.turn=1;
	    		Interface.refreshBoard();
	    		
	    	}
	    	else if(e.getActionCommand()=="undo") {
	    		if(ChessBoard.gameStates.empty()) {
	    			JOptionPane.showMessageDialog(new JFrame(), "No moves available", "Error",
					        JOptionPane.ERROR_MESSAGE);
	    		}
	    		else {
	    			ChessBoard newTest = ChessBoard.gameStates.pop();
	    			Interface.test = newTest;
	    			Interface.switchTurn();
	    			Interface.refreshBoard();
	    		}
	    		
	    	}
	    	else {
	    		if(Interface.counter==0) {
	    			Interface.x1 = Integer.parseInt(e.getActionCommand().substring(0, 1));
	    			Interface.y1 = Integer.parseInt(e.getActionCommand().substring(1, 2));
	    		}
	    		else if(Interface.counter==1) {
	    			Interface.x2 = Integer.parseInt(e.getActionCommand().substring(0, 1));
	    			Interface.y2 = Integer.parseInt(e.getActionCommand().substring(1, 2));
	    		}
	    		Interface.counter++;
	    		if(Interface.counter==2)
	    		{
	    			Interface.moveBoard();
	    		}

	    	}


	    }

}
