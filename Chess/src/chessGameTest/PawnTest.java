package chessGameTest;
import chessGame.*;
import static org.junit.Assert.*;
import static org.junit.Before.*;
import static org.junit.Test.*;
import org.junit.*;

import chessGame.ChessBoard;
import junit.framework.TestCase;

public class PawnTest extends TestCase {
	ChessBoard test = new ChessBoard();
	
	public void testConstructor() {
		ChessBoard test = new ChessBoard();
		test.game[0][0] = new Pawn(0,0,0);
		assertEquals(test.game[0][0].getPlayerNumber(),0);
		assertEquals(test.game[0][0].getType(),6);
	}
	public void testMovementOutofBounds() {
		test.game[0][0] = new Pawn(0,0,0);
		assertFalse(test.game[0][0].move(test.game,0,0,0,-1));
	}
	public void testFirstAndInvalidMove() {
		test.game[0][0] = new Pawn(0,0,0);
		assertFalse(test.game[0][0].move(test.game,0,0,3,0));
		assertTrue(test.game[0][0].move(test.game,0,0,2,0));
		assertTrue(test.game[2][0].move(test.game,2,0,3,0));
	}
	public void testFriendlyPiece() {
		test.game[0][0] = new Pawn(0,0,0);
		test.game[1][0] = new Pawn(1,0,0);
		assertFalse(test.game[0][0].move(test.game,0,0,1,0));
	}
	public void testCaptureEnemyInFront() {
		test.game[0][0] = new Pawn(0,0,0);
		test.game[1][0] = new Pawn(1,0,1);
		assertFalse(test.game[0][0].move(test.game,0,0,1,0));
	}
	public void testCaptureEnemy() {
		test.game[0][0] = new Pawn(0,0,0);
		test.game[1][1] = new Pawn(1,1,1);
		assertTrue(test.game[0][0].move(test.game,0,0,1,1));
	}
	public void testMoveToEmptySpace() {
		test.game[0][0] = new Pawn(0,0,0);
		assertTrue(test.game[0][0].move(test.game,0,0,1,0));
	}
	public void testMoveDiagonally() {
		test.game[0][0] = new Pawn(0,0,0);
		assertFalse(test.game[0][0].move(test.game,0,0,1,1));
	}

}
