package chessGame;

public class King extends ChessPiece{

	public King(int x, int y,int pNum) {
		// TODO Auto-generated constructor stub
		super(x,y,1, pNum);
	}
	@Override
	public boolean move(ChessPiece[][] game, int currX, int currY, int tarX, int tarY) {
		// king can move one square in any direction
		//eliminate invalid moves first
		boolean moveSuccess = true;
		if(!(ChessBoard.onBoard(tarX,tarY)) || Math.abs(tarX-currX)>1 || Math.abs(tarY-currY)>1) {
			System.out.println("Invalid move");
			moveSuccess = false;
		}
		else if(game[tarX][tarY]!=null) { //check if spot is occupied
			moveSuccess = checkOccupiedSpot(game, currX, currY, tarX, tarY, moveSuccess);
		}
		else	//moving to unoccupied space
		{
			System.out.println("Moving a " + intToType(game[currX][currY].pieceType) + " to " + tarX + "," + tarY +"\n");	
			addPiece(game, tarX,tarY,1,game[currX][currY].getPlayerNumber());
			game[currX][currY]=null;
		}
		return moveSuccess;
	}


}
