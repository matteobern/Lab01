package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.Parole2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private TextArea txtTime;
    
    Parole2 parole =new Parole2();
  //  Parole parole=new Parole();

    @FXML
    void doInsert(ActionEvent event) {
    	long start=System.nanoTime();
    	parole.addParola(txtParola.getText());
    	txtResult.setText(parole.stampaElenco());
    	txtParola.clear();
    	long finish=System.nanoTime();
    	txtTime.appendText((finish-start)+" aggiunta parola\n");
    }

    @FXML
    void doReset(ActionEvent event) {
    	long start=System.nanoTime();
    	txtResult.clear();
    	txtParola.clear();
    	parole.reset();
    	long finish=System.nanoTime();
    	txtTime.appendText((finish-start)+" tempo Reset\n");
    }

    @FXML
    void handleCancella(ActionEvent event) {
    long start=System.nanoTime();
     parole.cancella(txtResult.getSelectedText());
     txtResult.setText(parole.stampaElenco());
     long finish=System.nanoTime();
     txtTime.appendText((finish-start)+" tempo Cancella\n");
    }
    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
