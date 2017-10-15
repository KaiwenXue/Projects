package chessGame;
import java.util.Stack;

public class ChessBoard {
	
	public ChessPiece[][] game;
	public static boolean endGame = false;
	public static Stack<ChessBoard> gameStates = new Stack<ChessBoard>();
	public ChessBoard() {
		game = new ChessPiece[8][8];
	}
	public static void flushStack() {
		gameStates = new Stack<ChessBoard>();
	}
	/*
	 * 0 = blank piece for testing
	 * 1 = King
	 * 2 = Queen
	 * 3 = Rook
	 * 4 = Bishop
	 * 5 = Knight
	 * 6 = Pawn
	 * 7 = Dancer
	 * 8 = Pikeman
	 */
	public static ChessBoard copyGame(ChessPiece[][] copy) {
		ChessBoard returnBoard = new ChessBoard();
		for(int i = 0; i<8;i++) {
			for(int j=0;j<8;j++) {
				if(copy[i][j]==null)
				{
					continue;
				}
				else if(copy[i][j].getType()==1) {
					returnBoard.game[i][j] = new King(i,j,copy[i][j].playerNumber);
				}
				else if(copy[i][j].getType()==2) {
					returnBoard.game[i][j] = new Queen(i,j,copy[i][j].playerNumber);
				}
				else if(copy[i][j].getType()==3) {
					returnBoard.game[i][j] = new Rook(i,j,copy[i][j].playerNumber);
				}
				else if(copy[i][j].getType()==4) {
					returnBoard.game[i][j] = new Bishop(i,j,copy[i][j].playerNumber);
				}
				else if(copy[i][j].getType()==5) {
					returnBoard.game[i][j] = new Knight(i,j,copy[i][j].playerNumber);
				}
				else if(copy[i][j].getType()==6) {
					returnBoard.game[i][j] = new Pawn(i,j,copy[i][j].playerNumber);
				}
				else if(copy[i][j].getType()==7) {
					returnBoard.game[i][j] = new Dancer(i,j,copy[i][j].playerNumber);
				}
				else if(copy[i][j].getType()==8) {
					returnBoard.game[i][j] = new Pikeman(i,j,copy[i][j].playerNumber);
					
				}
				
			}
		}
		return returnBoard;
	}
	
	public void initGame() {
		//initialize game with all 16 pieces in correct position
		this.game[0][0] = new Rook(0,0,0);
		this.game[0][1] = new Knight(0,1,0);
		this.game[0][2] = new Bishop(0,2,0);
		this.game[0][3] = new King(0,3,0);
		this.game[0][4] = new Queen(0,4,0);
		this.game[0][5] = new Bishop(0,5,0);
		this.game[0][6] = new Knight(0,6,0);
		this.game[0][7] = new Rook(0,7,0);
		for(int i=0;i<8;i++) {
			this.game[1][i]=new Pawn(1,i,0);
		}
		this.game[7][0] = new Rook(7,0,1);
		this.game[7][1] = new Knight(7,1,1);
		this.game[7][2] = new Bishop(7,2,1);
		this.game[7][3] = new King(7,3,1);
		this.game[7][4] = new Queen(7,4,1);
		this.game[7][5] = new Bishop(7,5,1);
		this.game[7][6] = new Knight(7,6,1);
		this.game[7][7] = new Rook(7,7,1);
		for(int i=0;i<8;i++) {
			this.game[6][i]=new Pawn(6,i,1);
		}
	}
	public void initWeirdGame() {
		this.game[0][0] = new Queen(0,0,0);
		this.game[0][1] = new Queen(0,1,0);
		this.game[0][2] = new Pikeman(0,2,0);
		this.game[0][3] = new King(0,3,0);
		this.game[0][4] = new King(0,4,0);
		this.game[0][5] = new Pikeman(0,5,0);
		this.game[0][6] = new Queen(0,6,0);
		this.game[0][7] = new Queen(0,7,0);
		for(int i=0;i<8;i++) {
			this.game[1][i]=new Dancer(1,i,0);
			this.game[2][i]=new Pawn(2,i,0);
		}
		this.game[7][0] = new Queen(7,0,1);
		this.game[7][1] = new Queen(7,1,1);
		this.game[7][2] = new Pikeman(7,2,1);
		this.game[7][3] = new King(7,3,1);
		this.game[7][4] = new King(7,4,1);
		this.game[7][5] = new Pikeman(7,5,1);
		this.game[7][6] = new Queen(7,6,1);
		this.game[7][7] = new Queen(7,7,1);
		for(int i=0;i<8;i++) {
			this.game[6][i]=new Dancer(6,i,1);
			this.game[5][i]=new Pawn(5,i,1);
		}
	}
	public static boolean onBoard(int x, int y) {
		//out of bounds range for 8x8 board
		return (x>=0) && (x<=7) &&  (y>=0) &&(y<=7);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demonstrate dancers
		/*
		ChessBoard test = new ChessBoard();
		printMatrix(test.game);

		test.game[0][0] = new Dancer(0,0,0);
		test.game[1][0] = new Pawn(1,0,1);
		test.game[2][0] = new Pawn(2,0,1);
		printMatrix(test.game);
		test.game[0][0].move(test.game,0,0,2,0);
		printMatrix(test.game);
		test.game[0][0] = new King(0,0,1);
		printMatrix(test.game);
		test.game[2][0].move(test.game,2,0,0,0);
		printMatrix(test.game);
		test.game[2][0].move(test.game,2,0,1,0);
		printMatrix(test.game);
		
		//demonstrate pikemen
		test.game[0][5] = new Pikeman(0,5,0);
		test.game[1][5] = new Pawn(1,5,1);
		printMatrix(test.game);
		test.game[0][5].move(test.game,0,5,1,5);
		printMatrix(test.game);
		/*
		//demonstrate standard pieces
		test.initGame();	
		printMatrix(test.game);
		test.game[1][0].move(test.game,1,0,2,0);
		printMatrix(test.game);
		test.game[0][0].move(test.game,0,0,2,0);
		printMatrix(test.game);
		test.game[2][0]=null;
		printMatrix(test.game);
		test.game[0][0].move(test.game,0,0,2,0);	
		printMatrix(test.game);
		test.game[2][0].move(test.game,2,0,6,0);
		printMatrix(test.game);
		test.game[6][0].move(test.game,6,0,6,1);
		printMatrix(test.game);
		test.game[0][4].move(test.game,0,4,5,4);
		printMatrix(test.game);
		test.game[1][3].move(test.game,1,3,2,3);
		printMatrix(test.game);		
		test.game[0][4].move(test.game,0,4,2,2);
		printMatrix(test.game);
		test.game[0][6].move(test.game,0,6,2,7);
		printMatrix(test.game);

	}
/*

	public static void printMatrix(ChessPiece[][] curr) {
	    for(int a=0; a<8; a++) {
	       for(int b=0; b<8; b++)
	    	   if(curr[a][b]==null)
	    	   {
	    		   System.out.print('*' +"  ");
	    	   }
	    	   else
	    	   {
		           System.out.print(curr[a][b].pieceType + "  ");
	    	   }
	       System.out.println();
	    }
	    System.out.println();
  
	}	*/	
	
}
}