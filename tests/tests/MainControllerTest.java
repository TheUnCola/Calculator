package tests;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import view.MainController;

public class MainControllerTest {

	MainController mc;
	
	@Before
	public void setUpBefore() throws Exception {
		mc = new MainController();
	}

	@After
	public void tearDownAfter() throws Exception {
		mc = null;
	}
	
	@Test
	public void handleAddTest() {
		
	}

}
