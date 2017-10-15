package chessGame;

public class Pikeman extends ChessPiece{
	
	public Pikeman(int x, int y,int pNum) {
		// TODO Auto-generated constructor stub
		super(x,y,8, pNum);
	}
	//if a Pikeman captures a piece, it remains in its original spot, otherwise it moves like a king
	@Override 
	public boolean move(ChessPiece[][] game, int currX, int currY, int tarX, int tarY) {
		// TODO Auto-generated method stub
		//eliminate invalid moves first
		boolean moveSuccess = true;
		if(!(ChessBoard.onBoard(tarX,tarY)) || Math.abs(tarX-currX)>1 || Math.abs(tarY-currY)>1) {
			System.out.println("Invalid move");
			moveSuccess = false;
		}//check if space is occupied
		else if(game[tarX][tarY]!=null) {
			if(game[tarX][tarY].getPlayerNumber() == (game[currX][currY].getPlayerNumber()))
			{
				System.out.println("You have a piece there!");
				moveSuccess = false;
			}
			else 	//if occupied by enemy, capture
			{
				System.out.println("capturing an enemy " + intToType(game[tarX][tarY].pieceType));
				checkCaptured(game,tarX,tarY);
				game[tarX][tarY]=null;

			}

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
