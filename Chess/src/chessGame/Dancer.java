package chessGame;

public class Dancer extends ChessPiece{
	
	public Dancer(int x, int y,int pNum) {
		// TODO Auto-generated constructor stub
		super(x,y,7, pNum);
	}
	/*the dancer can leap over an enemy or friendly piece, to move or capture an enemy
	 * example; imagine a straight line Reaper-- Pawn -- Bishop, it can jump to the bishop, capturing it
	 * however it cannot capture a king
	 * can only move vertically or horizontally
	 */
	@Override 
	public boolean move(ChessPiece[][] game, int currX, int currY, int tarX, int tarY) {
		// TODO Auto-generated method stub
		//eliminate invalid moves first
		boolean moveSuccess = true;
		if(!(ChessBoard.onBoard(tarX,tarY)) || ((currX!=tarX)&&(currY!=tarY)) ||((Math.abs(currX-tarX)+Math.abs(currY-tarY))!=2)) {
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
				if(game[tarX][tarY].getType()==1) {
					System.out.println("Cannot capture King");
					moveSuccess = false;
				}
				else {
					System.out.println("capturing an enemy " + intToType(game[tarX][tarY].pieceType));
					checkCaptured(game,tarX,tarY);
					addPiece(game, tarX,tarY,game[currX][currY].getType(),game[currX][currY].getPlayerNumber());
					game[currX][currY]=null;
				}
			}
			
		}//move to unoccupied space
		else
		{
			System.out.println("Moving a " + intToType(game[currX][currY].pieceType) + " to " + tarX + "," + tarY +"\n");	
			addPiece(game, tarX,tarY,7,game[currX][currY].getPlayerNumber());
			game[currX][currY]=null;
		}
		return moveSuccess;
	}

}
