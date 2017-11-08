package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {



    public RadioButton rb1;
    public RadioButton rb2;
    public RadioButton rb3;
    public Label label;
    public ToggleGroup Skrzydła;

    public void handleClick(ActionEvent actionEvent) {

        if (rb3.isSelected()) {
            label.setText(rb3.getText());
        }
        if (rb2.isSelected()) {
            label.setText(rb2.getText());
        }
        if (rb1.isSelected()) {
            label.setText(rb1.getText());
        }


    }

}

