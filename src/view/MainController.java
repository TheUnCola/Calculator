package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.Main;

public class MainController {

    @FXML
    private Label display;
    @FXML
    private Button clear;
    @FXML
    private Button posNeg;
    @FXML
    private Button percent;
    @FXML
    private Button div;
    @FXML
    private Button mult;
    @FXML
    private Button sub;
    @FXML
    private Button add;
    @FXML
    private Button equal;

    // Reference to the main application.
    private Main main;
    private double lastNum = 0;
    private String curr = "0";
    private String lastFunct = "";
    private String buffer = "";
    private boolean isPercent = false;

    public MainController() {
    	
    }

    @FXML
    private void initialize() {
    	display.setText("0");
    }

    public void setMainApp(Main main) {
        this.main = main;
    }

    @FXML
    private void handleAdd() {
    	double tempNum = Double.parseDouble(curr) + Double.parseDouble(buffer);
        String text = Double.toString(tempNum);
    	display.setText(text);
    	curr = text;
        lastNum = tempNum;
        buffer = "0";
    }
    
    @FXML
    private void handleSub() {
    	double tempNum = Double.parseDouble(curr) - Double.parseDouble(buffer);
        String text = Double.toString(tempNum);
    	display.setText(text);
    	curr = text;
        lastNum = tempNum;
        buffer = "0";
    }
    
    @FXML
    private void handleMult() {
    	double tempNum = Double.parseDouble(curr)*Double.parseDouble(buffer);
        String text = Double.toString(tempNum);
    	display.setText(text);
    	curr = text;
        lastNum = tempNum;
        buffer = "0";
    }
    
    @FXML
    private void handleDiv() {
    	double tempNum = Double.parseDouble(curr)/Double.parseDouble(buffer);
        String text = Double.toString(tempNum);
    	display.setText(text);
    	curr = text;
        lastNum = tempNum;
        buffer = "0";
    }
    
    @FXML
    private void handlePercent() {
    	if(!isPercent) {
    		double tempNum = Double.parseDouble(curr)/100;
    		String text = Double.toString(tempNum)+"%";
    		display.setText(text);
    	} else {
    		display.setText(curr);
    	}
    }
    
    @FXML
    private void handlePosNeg() {
		double tempNum = -Double.parseDouble(curr);
		String text = Double.toString(tempNum);
		display.setText(text);
		curr = text;
        lastNum = tempNum;
        buffer = "0";
    }
    
    @FXML
    private void handleClear() {
    	display.setText("0");
    	curr = "0";
        lastNum = 0;
        buffer = "0";
    }
    
    @FXML
    private void handleEqual() {
    	System.out.println("I don't work yet.");
    }
    
    @FXML
    private void buttonBuffer(ActionEvent evt) {
    	Button button = (Button)evt.getSource();
    	buffer += button.getText();
    	double temp = Double.parseDouble(buffer);
    	display.setText(Double.toString(temp));
    }

	public Label getDisplay() {
		return display;
	}

	public Button getClear() {
		return clear;
	}

	public Button getPosNeg() {
		return posNeg;
	}

	public Button getPercent() {
		return percent;
	}

	public Button getDiv() {
		return div;
	}

	public Button getMult() {
		return mult;
	}

	public Button getSub() {
		return sub;
	}

	public Button getAdd() {
		return add;
	}

	public Button getEqual() {
		return equal;
	}

	public Main getMain() {
		return main;
	}

	public double getLastNum() {
		return lastNum;
	}

	public String getCurr() {
		return curr;
	}

	public String getLastFunct() {
		return lastFunct;
	}

	public String getBuffer() {
		return buffer;
	}

	public boolean isPercent() {
		return isPercent;
	}
}
