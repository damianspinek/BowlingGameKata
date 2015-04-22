import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;


public class BowlingGameTest {

	@Test
	public void itCompiles() {
		assertThat(true, equalTo(true));;
	}
	
	@Test
	public void testGutterGame(){
		Game game = new Game();
		for(int i=0;i<20;i++){
			game.roll(0	);
		}
		assertEquals(0, game.score());
	}
	
	@Test
	public void testAllOne(){
		Game game = new Game();
		for(int i=0;i<20;i++){
			game.roll(1	);
		}
		assertEquals(20, game.score());
	}

}
