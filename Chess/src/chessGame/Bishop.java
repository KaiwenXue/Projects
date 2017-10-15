package chessGame;

public class Bishop extends ChessPiece{
	
	public Bishop(int x, int y,int pNum) {
		// inherited from super class Chesspiece
		super(x,y,4, pNum);
	}
	@Override
	public boolean move(ChessPiece[][] game, int currX, int currY, int tarX, int tarY) {
		// eliminate invalid moves first
		boolean moveSuccess = true;
		if(!(ChessBoard.onBoard(tarX,tarY)) || ((currX==tarX)||(currY==tarY)) || inPath(game,currX,currY,tarX,tarY)) {
			System.out.println("Invalid move");
			moveSuccess = false;
		}
		else if(game[tarX][tarY]!=null) { //check if that space is occupied
			moveSuccess = checkOccupiedSpot(game, currX, currY, tarX, tarY, moveSuccess);
		}
		else//moving to an unoccupied space
		{
			System.out.println("Moving a " + intToType(game[currX][currY].pieceType) + " to " + tarX + "," + tarY +"\n");	
			addPiece(game, tarX,tarY,4,game[currX][currY].getPlayerNumber());
			game[currX][currY]=null;
		}
		return moveSuccess;
	}
	//helper function to determine if piece is blocking path
	public static boolean inPath(ChessPiece[][] game, int currX, int currY, int tarX, int tarY) {
		//check if moving down/up is blocked
		boolean blocked = false;
		if(((currX<tarX)&&(currY<tarY))|| ((tarX<currX)&&(tarY<currY))) {
			for(int i = (Math.min(currX, tarX))+1; i< Math.max(currX, tarX); i++) {
				if(game[i][i]!=null)
				{
					blocked = true;
					break;
				}
			}
		}
		else {
			int startY = Math.max(currY, tarY);
			for(int i = (Math.min(currX, tarX))+1; i< Math.max(currX, tarX); i++) {
				if(game[i][startY-i]!=null)
				{
					blocked = true;
					break;
				}
			}
		}
		return blocked;

	}

}
