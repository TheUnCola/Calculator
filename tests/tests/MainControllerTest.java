package tests;
import static org.junit.Assert.*;
import java.awt.Robot;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Main;
import view.MainController;

public class MainControllerTest {
	
	static MainController mc;
	static Robot r;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String[] args = null;
		r = new Robot();
		Main.main(args);
		//FXMLLoader loader = new FXMLLoader();
		//mc = new MainController();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		mc = null;
		r = null;
	}
	
	@Test
	public void handleAddTest() {
		
		assertFalse("test",1==12);
		Bounds bounds = mc.getAdd().localToScene(mc.getAdd().getBoundsInLocal());
		r.mouseMove((int)bounds.getMinX()+1, (int)bounds.getMinY()+1);
		r.mousePress(1024);
		r.mouseRelease(1024);
		assertFalse("test",1==12);
	}

}
