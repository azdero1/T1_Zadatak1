package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label labela;

    public void promjenaTeksta(ActionEvent actionEvent) {

        labela.setText("Hello World!");

    }
}
