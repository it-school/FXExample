package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    Button btnMain;
    @FXML
    Label lblMain;
    @FXML
    TextField txtNumber1;
    @FXML
    TextField txtNumber2;


    public void MainButtonClick(ActionEvent actionEvent)
    {
        double number1 = 0;
        double number2 = 0;
        try
        {
            number1 = Double.parseDouble(txtNumber1.getText());
            number2 = Double.parseDouble(txtNumber2.getText());
            lblMain.setText((number1 + number2)+"");
        }
        catch (NumberFormatException exc)
        {
            lblMain.setText(exc.getMessage());
            System.out.println(exc.getMessage());
        }

    }
}
