package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import static java.awt.BorderLayout.CENTER;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public TextArea textArea;

   // @FXML
   // public void sendHello() {
   //     System.out.println("hello");
   // }

    @FXML
    public void sendMsg(ActionEvent actionEvent) {
       textArea.appendText(textField.getText()+"\n");
        textArea.setWrapText(true); //перенос в ячейке
        textArea.setFont(Font.font("Times New Roman", 22));
        //textArea.setFont(Font.font("Times New Roman", FontWeight.BOLD,
                //FontPosture.ITALIC, 36));
       // textArea.setStyle("-fx-text-alignment: center");
        textField.clear();
        textField.requestFocus();
    }
}
