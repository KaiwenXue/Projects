package chessGameTest;
import chessGame.*;
import controller.*;
import model.*;
import view.*;
import static org.junit.Assert.*;
import static org.junit.Before.*;
import static org.junit.Test.*;
import org.junit.*;

import junit.framework.TestCase;
public class InterfaceTest extends TestCase{

	public void testTypes() {
		
		Interface.turn=0;
		Interface.switchTurn();
		assertEquals(1, Interface.turn);
	}


}
