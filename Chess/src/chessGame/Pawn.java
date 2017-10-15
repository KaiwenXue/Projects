package chessGame;

public class Pawn extends ChessPiece{

	boolean first = true;
	
	public Pawn(int x, int y,int pNum) {
		// TODO Auto-generated constructor stub
		super(x,y,6, pNum);
	}
	/*
	 * 0 = blank piece
	 * 1 = King
	 * 2 = Queen
	 * 3 = Rook
	 * 4 = Bishop
	 * 5 = Knight
	 * 6 = Pawn
	 */
	@Override
	public boolean move(ChessPiece[][] game, int currX, int currY, int tarX, int tarY) {
		// TODO Auto-generated method stub
		boolean moveSuccess = true;
		//eliminate invalid moves and false starts
		if(!(ChessBoard.onBoard(tarX,tarY)) || (first && (Math.abs(tarX-currX)>2 ))|| (!first && (Math.abs(tarX-currX)>1 ))|| Math.abs(tarY-currY)>1 || Math.abs(tarX-currX)<1
				|| (game[currX][currY].getPlayerNumber()==1 && tarX>currX) || (game[currX][currY].getPlayerNumber()==0 && tarX<currX)) {
			System.out.println("Invalid move");
			moveSuccess = false;
		}
		else if(game[tarX][tarY]!=null) { //moving to friendly target
			if(game[tarX][tarY].getPlayerNumber() == (game[currX][currY].getPlayerNumber()))
			{
				System.out.println("You have a piece there!");
				moveSuccess = false;
			}
			else 
			{
				
				if(Math.abs(tarY-currY)==1) { //capture enemies in diagonal fashion only
					System.out.println("capturing an enemy " + intToType(game[tarX][tarY].pieceType));
					checkCaptured(game,tarX,tarY);
					addPiece(game, tarX,tarY,6,game[currX][currY].getPlayerNumber());
					game[currX][currY]=null;
					first = false;
				}
				else
				{
					System.out.println("Can't capture enemies in front!");
					moveSuccess = false;
				}

			}
		}
		else {
			if((Math.abs(tarY-currY)==0)) { //do not move to empty space diagonally
				System.out.println("Moving a " + intToType(game[currX][currY].pieceType) + " to " + tarX + "," + tarY +"\n");	
				addPiece(game, tarX,tarY,6,game[currX][currY].getPlayerNumber());
				game[currX][currY]=null;
				first = false;
			}
			else {
				System.out.println("Can't move diagonally into empty spaces!");
				moveSuccess = false;
			}

		}
		return moveSuccess;

	}
}
