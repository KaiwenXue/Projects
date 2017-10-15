package chessGame;

public class Rook extends ChessPiece{
	
	public Rook(int x, int y,int pNum) {
		// TODO Auto-generated constructor stub
		super(x,y,3, pNum);
	}
	@Override
	public boolean move(ChessPiece[][] game, int currX, int currY, int tarX, int tarY) {
		// TODO Auto-generated method stub
		boolean moveSuccess = true;
		if(!(ChessBoard.onBoard(tarX,tarY)) || ((currX!=tarX)&&(currY!=tarY)) || inPath(game,currX,currY,tarX,tarY)) {
			System.out.println("Invalid move");
			moveSuccess = false;
		}
		else if(game[tarX][tarY]!=null) {
			moveSuccess = checkOccupiedSpot(game, currX, currY, tarX, tarY, moveSuccess);
		}
		else
		{
			System.out.println("Moving a " + intToType(game[currX][currY].pieceType) + " to " + tarX + "," + tarY +"\n");	
			addPiece(game, tarX,tarY,3,game[currX][currY].getPlayerNumber());
			game[currX][currY]=null;
		}
		return moveSuccess;
	}
	//helper function to determine if piece is blocking path
	public static boolean inPath(ChessPiece[][] game, int currX, int currY, int tarX, int tarY) {
		//moving down/up
		boolean blocked = false;
		if(currX!= tarX) 
			for(int i = (Math.min(currX, tarX))+1; i< Math.max(currX, tarX); i++) {
				if(game[i][currY]!=null)
				{
					blocked = true;
					break;
				}
		}
		else {//move left/right
			for(int i = (Math.min(currY, tarY))+1; i< Math.max(currY, tarY); i++) {
				if(game[currX][i]!=null)
				{
					blocked = true;
					break;
				}
			}
		}		
		return blocked;
	}

}
