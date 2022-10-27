package hu.petrik.embereklista;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class EmberekController {
    @FXML
    private ListView emberek;

    @FXML
    private void initialize(){
        Ember e1=new Ember("Lakatos Brendon",29);
        Ember e2=new Ember("Rugós Beke",45);
        Ember e3=new Ember("Kunu Mario",31);
        emberek.getItems().add(e1);
        emberek.getItems().add(e2);
        emberek.getItems().add(e3);
    }
}