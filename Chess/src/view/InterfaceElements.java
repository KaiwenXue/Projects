package view;
import chessGame.*;
import model.*;
import controller.*;

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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class InterfaceElements{

	InterfaceControls listener = new InterfaceControls();
	
	public InterfaceElements(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
            //silently ignore
        }
    	Interface.test.initGame();
        Interface.chessButtons = new JButton[8][8];
        JFrame window = new JFrame("Chess Game by Kaiwen Xue");
        window.setSize(600, 600);
        window.setMinimumSize(new Dimension(400, 400));
        JPanel myPanel = initializePanel();

        setUpMenu(window);
        setupChessBoard(myPanel,Interface.chessButtons);
        window.setContentPane(myPanel);
        initializeButton(myPanel);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setupChessBoard(JPanel myPanel, JButton[][] buttons) {
        JPanel chessPanel = new JPanel();
        chessPanel.setLayout(new GridLayout(8,8));
        myPanel.add(chessPanel, BorderLayout.CENTER);
        int counter = 0;
    	
		for(int i =0; i<8; i++) {
			if(counter == 1) {
				counter = 0;
			}
			else if(counter ==0)
			{
				counter = 1;
			}
			for(int j =0; j<8; j++) {
				buttons[i][j] = new JButton();
	    	    buttons[i][j].setPreferredSize(new Dimension(50,50));
	    	    buttons[i][j].addActionListener(listener);
	    	    buttons[i][j].setActionCommand(String.valueOf(i)+String.valueOf(j));
	    	    if(counter ==0) {
	    	    	buttons[i][j].setBackground(Color.WHITE);
	    	    	buttons[i][j].setContentAreaFilled(false);
	    	    	buttons[i][j].setOpaque(true);
	    	    	counter = 1;
	    	    }
	    	    else if(counter ==1) {
	    	    	buttons[i][j].setBackground(Color.LIGHT_GRAY);
	    	    	buttons[i][j].setContentAreaFilled(false);
	    	    	buttons[i][j].setOpaque(true);
	    	    	counter = 0;
	    	    }
	    	    chessPanel.add(buttons[i][j]);
			}
			
		}
    }
 
		// TODO Auto-generated constructor stub
	    public void initializeButton(JPanel myPanel) {
	        
	    	Interface.startButton.addActionListener(listener);
	    	Interface.startButton.setFont(new Font("Arial", Font.PLAIN, 20));
	    	Interface.startButton.addActionListener(listener);
	        myPanel.add(Interface.startButton, BorderLayout.SOUTH);
	    }
	 
	    public JPanel initializePanel() {
	        JPanel myPanel = new JPanel();
	        myPanel.setPreferredSize(new Dimension(500,500));
	        myPanel.setLayout(new BorderLayout());
	        return myPanel;
	    }
	 
	    private void setUpMenu(JFrame window) {
	        JMenuBar menubar = new JMenuBar();
	        JMenu file = new JMenu("Options");
	        JMenuItem restart = new JMenuItem("Restart the Game");
	        JMenuItem forfeit = new JMenuItem("Forfeit the Game");
	        JMenuItem checkScore = new JMenuItem("Check the score");
	        JMenuItem weird = new JMenuItem("Start a weird game");
	        JMenuItem undo = new JMenuItem("Undo the last move");
	        file.add(restart);
	        file.add(forfeit);
	        file.add(checkScore);
	        file.add(weird);
	        file.add(undo);
	        undo.addActionListener(listener);
	        weird.addActionListener(listener);
	        restart.addActionListener(listener);
	        forfeit.addActionListener(listener);
	        checkScore.addActionListener(listener);
	        undo.setActionCommand("undo");
	        restart.setActionCommand("restart");
	        forfeit.setActionCommand("forfeit");
	        checkScore.setActionCommand("score");
	        weird.setActionCommand("weird");
	        menubar.add(file);
	        window.setJMenuBar(menubar);
	    }

	    public static void main(String[] args) {
	    	
	        new InterfaceElements();
	    }
	    
}


