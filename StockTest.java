import static org.junit.Assert.assertEquals;
import org.junit.*;

public class StockTest {

	Stock tea;
	Stock pop;
	Stock ale;
	Stock gin;
	Stock joe;

	@Before
	public void before(){
		tea = new Stock("TEA", "Common", 0, 0, 100, 15240.0, false, 1);
		pop = new Stock("POP", "Common", 8, 0, 100, 4205.0, false, 1);
		ale = new Stock("ALE", "Common", 23, 0, 60, 16065.0, false, 1);
		gin = new Stock("GIN", "Preferred", 8, 2, 100, 217650.0, true, 0.5);
		joe = new Stock("JOE", "Common", 13, 0, 250, 7385.0, false, 1);
	}

	@Test
	public void hasTicker(){
		assertEquals("TEA", tea.getTicker());
	}
}