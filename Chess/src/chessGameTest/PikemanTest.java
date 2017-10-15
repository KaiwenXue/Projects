package chessGameTest;
import chessGame.*;
import static org.junit.Assert.*;
import static org.junit.Before.*;
import static org.junit.Test.*;
import org.junit.*;

import junit.framework.TestCase;
public class PikemanTest extends TestCase{
	ChessBoard test = new ChessBoard();
	
	public void testConstructor() {
		ChessBoard test = new ChessBoard();
		test.game[0][0] = new Pikeman(0,0,0);
		assertEquals(test.game[0][0].getPlayerNumber(),0);
		assertEquals(test.game[0][0].getType(),8);
	}
	public void testMovementOutofBounds() {
		test.game[0][0] = new Pikeman(0,0,0);
		assertFalse(test.game[0][0].move(test.game,0,0,-2,1));
	}
	public void testFriendlyPiece() {
		test.game[0][0] = new Pikeman(0,0,0);
		test.game[1][0] = new Pawn(1,0,0);
		assertFalse(test.game[0][0].move(test.game,0,0,1,0));
	}
	public void testMovingMoreThanOne() {
		test.game[0][0] = new Pikeman(0,0,0);
		assertFalse(test.game[0][0].move(test.game,0,0,2,0));
		assertFalse(test.game[0][0].move(test.game,0,0,0,2));
	}
	public void testSuccessfulMove() {
		test.game[0][0] = new Pikeman(0,0,0);
		assertTrue(test.game[0][0].move(test.game,0,0,1,0));
	}
	public void testCaptureEnemy() {
		test.game[0][0] = new Pikeman(0,0,0);
		test.game[1][0] = new Pawn(1,0,1);
		assertTrue(test.game[0][0].move(test.game,0,0,1,0));
	}
	public void testRemainedInPlace() {
		test.game[0][0] = new Pikeman(0,0,0);
		test.game[1][0] = new Pawn(1,0,1);
		test.game[0][0].move(test.game,0,0,1,0);
		assertEquals(test.game[0][0].getType(),8);
	}


}
