package chessGame;

public class Knight extends ChessPiece{
	
	public Knight(int x, int y,int pNum) {
		// TODO Auto-generated constructor stub
		super(x,y,5, pNum);
	}
	@Override 
	public boolean move(ChessPiece[][] game, int currX, int currY, int tarX, int tarY) {
		// TODO Auto-generated method stub
		//eliminate invalid moves first
		boolean moveSuccess = true;
		if(!(ChessBoard.onBoard(tarX,tarY)) || ((Math.abs(currX-tarX)+Math.abs(currY-tarY))!=3)) {
			System.out.println("Invalid move");
			moveSuccess = false;
		}//check if space is occupied
		else if(game[tarX][tarY]!=null) {
			moveSuccess = checkOccupiedSpot(game, currX, currY, tarX, tarY, moveSuccess);

		}//move to unoccupied space
		else
		{
			System.out.println("Moving a " + intToType(game[currX][currY].pieceType) + " to " + tarX + "," + tarY +"\n");	
			addPiece(game, tarX,tarY,5,game[currX][currY].getPlayerNumber());
			game[currX][currY]=null;
		}
		return moveSuccess;
	}

}
