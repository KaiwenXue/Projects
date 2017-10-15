package chessGame;

public class Queen extends ChessPiece{
	
	public Queen(int x, int y,int pNum) {
		// TODO Auto-generated constructor stub
		super(x,y,2, pNum);
	}
	@Override
	public boolean move(ChessPiece[][] game, int currX, int currY, int tarX, int tarY) {
		// TODO Auto-generated method stub
		
		boolean moveSuccess = true;
		//invalid moves determined by rook and bishop pathing
		if(!(ChessBoard.onBoard(tarX,tarY)) || ((currX==tarX||currY==tarY)&&Rook.inPath(game,currX,currY,tarX,tarY) || (Bishop.inPath(game,currX,currY,tarX,tarY)))) {
			System.out.println("Invalid move");
			moveSuccess = false;
		}
		else if(game[tarX][tarY]!=null) {
			moveSuccess = checkOccupiedSpot(game, currX, currY, tarX, tarY, moveSuccess);

		}
		else
		{
			System.out.println("Moving a " + intToType(game[currX][currY].pieceType) + " to " + tarX + "," + tarY +"\n");	
			addPiece(game, tarX,tarY,2,game[currX][currY].getPlayerNumber());
			game[currX][currY]=null;
		}
		return moveSuccess;
	}

}
