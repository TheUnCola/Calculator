package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.Main;

public class MainController {

    @FXML
    private Label display;

    // Reference to the main application.
    private Main main;
    private int lastNum = 0;
    private String num = "";

    public MainController() {
    }

    @FXML
    private void initialize() {
    	display.setText("0");
    }

    public void setMainApp(Main main) {
        this.main = main;
    }

    private void handleAddition() {
    	int tempNum = lastNum + Integer.parseInt(num);
        String text = Integer.toString(tempNum);
    	display.setText(text);
        lastNum = tempNum;
    }
    
    private void handleSub() {
    	int tempNum = lastNum - Integer.parseInt(num);
        String text = Integer.toString(tempNum);
    	display.setText(text);
        lastNum = tempNum;
    }
    
    private void handleMult() {
    	int tempNum = lastNum*Integer.parseInt(num);
        String text = Integer.toString(tempNum);
    	display.setText(text);
        lastNum = tempNum;
    }
    
    private void handleDiv() {
    	int tempNum = lastNum/Integer.parseInt(num);
        String text = Integer.toString(tempNum);
    	display.setText(text);
        lastNum = tempNum;
    }
    
    @FXML
    private void handleButton(ActionEvent evt) {
    	Button button = (Button)evt.getSource();
    	if(button.getText().equals("+")) {
    		handleAddition();
    		num = "";
    	} else if(button.getText().equals("*")) {
    		handleMult();
    		num = "";
    	} else if(button.getText().equals("/")) {
    		handleDiv();
    		num = "";
    	} else if(button.getText().equals("AC")) {
    		lastNum = 0;
    		num = "";
    	} else if(button.getText().equals("=")) {
    		display.setText(num);
    	} else {
    		num += button.getText();
    	}
    }
}
