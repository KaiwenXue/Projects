package chessGame;

abstract public class ChessPiece {

	int x;
	int y;
	int pieceType;
	int playerNumber;
	/*
	 * 0=black
	 * 1=white
	 */
	
	/*
	 * constructing a chess piece
	 */
	public ChessPiece(int setX, int setY, int setType, int pNum) {
		this.x = setX;
		this.y = setY;
		this.pieceType = setType;
		this.playerNumber = pNum;
	}
	public int getPlayerNumber() {
		return this.playerNumber;
	}
	public int getType() {
		return this.pieceType;
	}
	
	
	abstract public boolean move(ChessPiece[][] game,int currX, int currY, int tarX, int tarY); 
	/*
	 * use this method to change the piece at target depending on requested type, called by every move function
	 * returns true if move successful
	 * false otherwise
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
	public static boolean addPiece(ChessPiece[][] game,int x, int y, int type, int pNum) {
		boolean added = true;
		if(type == 1) {
			game[x][y] = new King(x,y,pNum);
		}
		else if(type == 2) {
			game[x][y] = new Queen(x,y,pNum);
		}
		else if(type == 3) {
			game[x][y] = new Rook(x,y,pNum);
		}
		else if(type == 4) {
			game[x][y] = new Bishop(x,y,pNum);
		}
		else if(type == 5) {
			game[x][y] = new Knight(x,y,pNum);
		}
		else if(type == 6) {
			game[x][y] = new Pawn(x,y,pNum);
		}
		else if(type == 7) {
			game[x][y] = new Dancer(x,y,pNum);
		}
		else if(type == 8) {
			game[x][y] = new Pikeman(x,y,pNum);
		}
		else {
			System.out.println("invalid new piece");
			added = false;
		}
		return added;
	}

	//convert a number to its corresponding chess piece type
	public static String intToType(int type) {
		
		String result;
		
		if(type == 1) {
			result = "King";
		}
		else if(type == 2) {
			result = "Queen";
		}
		else if(type == 3) {
			result = "Rook";
		}
		else if(type == 4) {
			result = "Bishop";
		}
		else if(type == 5) {
			result = "Knight";
		}
		else if(type == 6) {
			result = "Pawn";
		}
		else if(type == 7) {
			result = "Dancer";
		}
		else if(type == 8) {
			result = "Pikeman";
		}
		else {
			result = "Invalid Piece";
		}
		return result;
	}
	public static boolean checkOccupiedSpot(ChessPiece[][] game, int currX, int currY, int tarX, int tarY,
			boolean moveSuccess) {
		if(game[tarX][tarY].getPlayerNumber() == (game[currX][currY].getPlayerNumber()))
		{
			System.out.println("You have a piece there!");
			moveSuccess = false;
		}
		else 	//if occupied by enemy, capture
		{
			System.out.println("capturing an enemy " + intToType(game[tarX][tarY].pieceType));
			checkCaptured(game,tarX,tarY);
			addPiece(game, tarX,tarY,game[currX][currY].getType(),game[currX][currY].getPlayerNumber());
			game[currX][currY]=null;

		}
		return moveSuccess;
	}
	public static void checkCaptured(ChessPiece[][] game, int x, int y) {
		if(game[x][y].pieceType==1) {
			ChessBoard.endGame=true;
		}
	}
}
