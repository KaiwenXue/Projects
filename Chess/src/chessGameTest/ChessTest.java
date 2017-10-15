package chessGameTest;
import chessGame.*;
import static org.junit.Assert.*;
import static org.junit.Before.*;
import static org.junit.Test.*;
import org.junit.*;

import junit.framework.TestCase;
public class ChessTest extends TestCase{
	public void testSetup() {
		ChessBoard test = new ChessBoard();
		test.initGame();
		assertFalse(ChessPiece.addPiece(test.game,0,0,9,1));
	}
	public void testTypes() {
		assertEquals("Invalid Piece", ChessPiece.intToType(9));
	}

}
