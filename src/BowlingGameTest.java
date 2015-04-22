import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	private Game game;

	@Test
	public void itCompiles() {
		assertThat(true, equalTo(true));
		
	}
	@Before
	public void setUp() throws Exception {
		game = new Game();
	}

	@Test
	public void testGutterGame() {

		rollMany(20, 0);
		assertEquals(0, game.score());
	}

	@Test
	public void testAllOne() {

		rollMany(20, 1);
		assertEquals(20, game.score());
	}
	
	@Test
	public void testOneSpare(){
		rollSpare();
		game.roll(3);
		rollMany(17, 0);
		assertEquals(16, game.score());
	}
	private void rollSpare() {
		game.roll(5);
		game.roll(5);
	}

	private void rollMany(int n, int pins) {
		for (int i = 0; i < n; i++) {
			game.roll(pins);
		}
	}


}
