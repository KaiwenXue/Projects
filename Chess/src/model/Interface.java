package model;
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


 
public class Interface{
	public static ChessBoard test = new ChessBoard();
	public static JButton startButton = new JButton("Start Game");
	public static JButton[][] chessButtons;

	public static int wScore = 0;
	public static int bScore = 0;
	public static int turn;
	public static boolean restart1=false;
	public static boolean restart0=false;
 
	/*
	 * 0 = blank piece for testing
	 * 1 = King
	 * 2 = Queen
	 * 3 = Rook
	 * 4 = Bishop
	 * 5 = Knight
	 * 6 = Pawn
	 */
    public static void refreshBoard() {
    	if(turn==1) {
			startButton.setText("White Player Turn");
		}
		else if(turn==0) {
			startButton.setText("Black Player Turn");
		}
    	
    	
    	for(int i =0; i<8; i++) {
			for(int j =0; j<8; j++) {
				if(test.game[i][j]==null) {
					chessButtons[i][j].setText(" ");
				}
				else if(test.game[i][j].getType()==1) {
					if(test.game[i][j].getPlayerNumber()==0)
					{
						chessButtons[i][j].setText("\u265A");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
					else if(test.game[i][j].getPlayerNumber()==1)
					{
						chessButtons[i][j].setText("\u2654");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
					
				}
				else if(test.game[i][j].getType()==2) {
					if(test.game[i][j].getPlayerNumber()==0)
					{
						chessButtons[i][j].setText("\u265B");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
					else if(test.game[i][j].getPlayerNumber()==1)
					{
						chessButtons[i][j].setText("\u2655");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
				}
				else if(test.game[i][j].getType()==3) {
					if(test.game[i][j].getPlayerNumber()==0)
					{
						chessButtons[i][j].setText("\u265C");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
					else if(test.game[i][j].getPlayerNumber()==1)
					{
						chessButtons[i][j].setText("\u2656");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
				}
				else if(test.game[i][j].getType()==4) {
					if(test.game[i][j].getPlayerNumber()==0)
					{
						chessButtons[i][j].setText("\u265D");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
					else if(test.game[i][j].getPlayerNumber()==1)
					{
						chessButtons[i][j].setText("\u2657");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
				}
				else if(test.game[i][j].getType()==5) {
					if(test.game[i][j].getPlayerNumber()==0)
					{
						chessButtons[i][j].setText("\u265E");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
					else if(test.game[i][j].getPlayerNumber()==1)
					{
						chessButtons[i][j].setText("\u2658");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
				}
				else if(test.game[i][j].getType()==6) {
					if(test.game[i][j].getPlayerNumber()==0)
					{
						chessButtons[i][j].setText("\u265F");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
					else if(test.game[i][j].getPlayerNumber()==1)
					{
						chessButtons[i][j].setText("\u2659");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
				}
				else if(test.game[i][j].getType()==7) {
					if(test.game[i][j].getPlayerNumber()==0)
					{
						chessButtons[i][j].setText("D");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
					else if(test.game[i][j].getPlayerNumber()==1)
					{
						chessButtons[i][j].setText("d");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
				}
				else if(test.game[i][j].getType()==8) {
					if(test.game[i][j].getPlayerNumber()==0)
					{
						chessButtons[i][j].setText("P");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
					else if(test.game[i][j].getPlayerNumber()==1)
					{
						chessButtons[i][j].setText("p");
						chessButtons[i][j].setFont(new Font("Serif", Font.PLAIN, 40));
					}
				}
			}
			
		}
    }
	public static int counter= 0;
	public static int x1 = -1;
	public static int y1 = -1;
	public static int x2 = -1;
	public static int y2 = -1;
	
    public static void moveBoard() {
    		
    		if(test.game[x1][y1].getPlayerNumber()==0 && turn ==1) {
    			JOptionPane.showMessageDialog(new JFrame(), "It is not your turn, it is White Player's turn", "Error",
				        JOptionPane.ERROR_MESSAGE);
    			counter=0;
    		}
    		else if((test.game[x1][y1].getPlayerNumber()==1 && turn ==0)) {
    			JOptionPane.showMessageDialog(new JFrame(), "It is not your turn, it is Black Player's turn", "Error",
				        JOptionPane.ERROR_MESSAGE);
    			counter=0;
    		}
    		else
    		{
    			ChessBoard temp = ChessBoard.copyGame(test.game);
    			ChessBoard.gameStates.push(temp);

    			boolean movedPiece = test.game[x1][y1].move(test.game,x1,y1,x2,y2);
    			if(!movedPiece) {
    				JOptionPane.showMessageDialog(new JFrame(), "Illegal move, please choose another move", "Error",
    				        JOptionPane.ERROR_MESSAGE);
    				ChessBoard.gameStates.pop();
    			}
    			counter=0;

    			if(movedPiece) {
    				if(ChessBoard.endGame==true) {
    					JOptionPane.showMessageDialog(new JFrame(), "Game is won, resetting board");
    					ChessBoard.endGame=false;
    		    		if(turn==1) {
    		    			wScore++;
    		    		}
    		    		else if(turn==0) {
    		    			bScore++;
    		    		}
    		    		startNewGame();
    				}
    				else {
        				switchTurn();
    				}

    			}
    			refreshBoard();
    		}
			
  
    }
    
    public static void switchTurn() {
    	if(turn==0) {
			turn=1;
		}
		else if(turn==1) {
			turn=0;
		}
    }
    
    public static  boolean checkRestart() {
    	return restart1&&restart0;
    }
    
 

	public static void startNewGame() {
		test = new ChessBoard();
		test.initGame();
		turn=1;
		ChessBoard.flushStack();
		refreshBoard();
	}
    

}