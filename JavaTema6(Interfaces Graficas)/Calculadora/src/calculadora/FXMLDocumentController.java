/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class FXMLDocumentController implements Initializable {

    Calcu calc;

    private Label label;
    @FXML
    private Button btn1;
    @FXML
    private Button btnmult;
    @FXML
    private Button btnresta;
    @FXML
    private Button btn4;
    @FXML
    private Button btn7;
    @FXML
    private Button btn5;
    @FXML
    private Button btn2;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn6;
    @FXML
    private Button btn3;
    @FXML
    private Button btnsuma;
    @FXML
    private Button btndiv;
    @FXML
    private Button btn0;
    @FXML
    private Button btnigual;
    @FXML
    private TextField txtfield;

    enum estado {
        LIMPIO,
        CARGARNUM1,
        CARGAROPERADOR,
        CARGARNUM2,
        RESULTADO

    }
    estado stats;
    String num1;
    String num2;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calc = new Calcu();

    }

    @FXML
    private void getNumber(ActionEvent event) {
    
if(stats ==  estado.RESULTADO){
            txtfield.setText("");
            Button btnNumerico = (Button) event.getSource();
            num2 = btnNumerico.getText();
            int numero = Integer.parseInt(btnNumerico.getText());
            stats = estado.CARGARNUM2;
            calc.cargarNumero(numero);
            txtfield.setText(txtfield.getText() + numero);
            
}else{

        if (stats != estado.CARGAROPERADOR) {

            Button btnNumerico2 = (Button) event.getSource();
            num1 = btnNumerico2.getText();
            int numero1 = Integer.parseInt(num1);
            stats = estado.CARGARNUM1;
            txtfield.setText(txtfield.getText() + numero1);
            
             

        } else {

                txtfield.setText("");
            Button btnNumerico = (Button) event.getSource();
            num2 = btnNumerico.getText();
            int numero = Integer.parseInt(btnNumerico.getText());
            stats = estado.CARGARNUM2;
            calc.cargarNumero(numero);
            txtfield.setText(txtfield.getText() + numero);
            
           

    }
}
    

    }

    @FXML
    private void operador(ActionEvent event) {
        
       switch (stats) {
           case CARGARNUM1:
                String op = ((Button) event.getSource()).getText();
                calc.cargarNumero(Integer.parseInt(txtfield.getText()));
                calc.operador(op);
                System.out.println(op);
                stats = estado.CARGAROPERADOR;
               break;
            case CARGARNUM2:
                String op1 = ((Button) event.getSource()).getText();
                calc.cargarNumero(Integer.parseInt(txtfield.getText()));
                calc.operador(op1);
                System.out.println(op1);
               calc.resultado();
                 stats = estado.CARGAROPERADOR;
              
                break;
            default:
                
                break;
        }

    }

    @FXML
    private void igual(ActionEvent event) {
        if(stats== estado.CARGARNUM2){
            txtfield.setText(calc.resultado());
            stats = estado.RESULTADO;
            
        }
            
       

    }

    @FXML
    private void limpiar(ActionEvent event) {
       
        txtfield.setText( calc.limpiar());

    }

}
