/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_moklet;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {

    

    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    @FXML
    private Label label;
    @FXML
    private PasswordField Hasil;
       @FXML
    private JFXButton No4;

    @FXML
    private JFXButton No1;

    @FXML
    private JFXButton No2;

    @FXML
    private JFXButton No3;

    @FXML
    private JFXButton No5;

    @FXML
    private JFXButton No6;

    @FXML
    private JFXButton No7;

    @FXML
    private JFXButton No8;

    @FXML
    private JFXButton No9;

    @FXML
    private JFXButton Ce;

    @FXML
    private JFXButton No0;

    @FXML
    private JFXButton Ok;

    @FXML
    private PasswordField Password;

    @FXML
    void Btn0(ActionEvent event) {
       pin += "0";
       Password.setText(pin);
    }

    @FXML
    void Btn1(ActionEvent event) {
        pin += "1";
       Password.setText(pin);

    }

    @FXML
    void Btn2(ActionEvent event) {
        pin += "2";
       Password.setText(pin);

    }

    @FXML
    void Btn3(ActionEvent event) {
        pin += "3";
       Password.setText(pin);

    }

    @FXML
    void Btn4(ActionEvent event) {
        pin += "4";
       Password.setText(pin);
    }

    @FXML
    void Btn5(ActionEvent event) {
        pin += "5";
       Password.setText(pin);

    }

    @FXML
    void Btn6(ActionEvent event) {
        pin += "6";
       Password.setText(pin);

    }

    @FXML
    void Btn7(ActionEvent event) {
        pin += "7";
       Password.setText(pin);

    }

    @FXML
    void Btn8(ActionEvent event) {
        pin += "8";
       Password.setText(pin);

    }

    @FXML
    void Btn9(ActionEvent event) {
        pin += "9";
       Password.setText(pin);

    }

    @FXML
    void BtnC(ActionEvent event) {
        pin +="";
        Password.setText(pin);

    }

    @FXML
    void BtnOk(ActionEvent event) {
        if(pin.equals(PIN)){
            try{
                ((Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
                Scene scene = new Scene(fxmlLoader.load(),830,450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            }
            catch(IOException e){
                System.out.println("Failed to create new window"+e);
            }
        }
        else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null,"PIN Salah \nTersisa"+kesempatan+"kesempatan lagi !");
            Password.setText("");
            pin = "";
            if(kesempatan == 0){
                System.exit(0);
            }
        }

    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
}
