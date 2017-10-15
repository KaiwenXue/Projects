package chessGameTest;
import chessGame.*;
import static org.junit.Assert.*;
import static org.junit.Before.*;
import static org.junit.Test.*;
import org.junit.*;

import junit.framework.TestCase;
public class KnightTest extends TestCase{
	ChessBoard test = new ChessBoard();
	
	public void testConstructor() {
		ChessBoard test = new ChessBoard();
		test.game[0][0] = new Knight(0,0,0);
		assertEquals(test.game[0][0].getPlayerNumber(),0);
		assertEquals(test.game[0][0].getType(),5);
	}
	public void testMovementOutofBounds() {
		test.game[0][0] = new Knight(0,0,0);
		assertFalse(test.game[0][0].move(test.game,0,0,9,9));
	}
	public void testFriendlyPiece() {
		test.game[0][0] = new Knight(0,0,0);
		test.game[2][1] = new Pawn(2,1,0);
		assertFalse(test.game[0][0].move(test.game,0,0,1,0));
	}
	public void testSuccessfulMove() {
		test.game[0][0] = new Knight(0,0,0);
		assertTrue(test.game[0][0].move(test.game,0,0,2,1));

	}
	public void testFailOtherTypes() {
		test.game[0][0] = new Knight(0,0,0);
		assertFalse(test.game[0][0].move(test.game,0,0,1,1));

	}
	public void testInPathKnight() {
		test.game[0][0] = new Knight(0,0,0);
		test.game[1][0] = new Pawn(1,0,0);
		assertTrue(test.game[0][0].move(test.game,0,0,2,1));

	}

	public void testCaptureEnemy() {
		test.game[0][0] = new Knight(0,0,0);
		test.game[2][1] = new Pawn(2,1,1);
		assertTrue(test.game[0][0].move(test.game,0,0,2,1));
	}
	
}
