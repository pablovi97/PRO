/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponderaciones;

import java.net.URL;
import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

/**
 *
 * @author pablo
 */
class conjunto {
    
    Button btn;
    TextField textfield;
    Label label;
    
    public conjunto() {
        btn = new Button();
        textfield = new TextField();
        label = new Label();
    }
}

public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button btnAgregar;
    @FXML
    private TextField textResult;
    @FXML
    private TextField textAgregarponde;
    @FXML
    private GridPane contenedor;
    Map<String, conjunto> map = new HashMap<>();
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    int i = 0;
    String notas = "";
    // String notasEnseñar = "";
    // String notasEnseñar1 = "";
    String notasTextA = "";


    /*
    PARA USAR EL ENTER
    btn.setinAction...
    textfield.setinAction
    en un mismo metodo
     */
    String lbltemp ;
    @FXML
    private void ejecutar(MouseEvent event) {
        
        conjunto conj = new conjunto();
        
        if (textAgregarponde.getText().matches("[0-9.]+[^,][0-9]|([1])?[0-9]")) {
            String ponde = textAgregarponde.getText();
            conj.btn.setText(Double.parseDouble(ponde) + "");
            if (map.get(conj.btn.getText()) == null) {
                
                contenedor.addRow(i, conj.label, conj.textfield, conj.btn);
                conj.btn.addEventHandler(MouseEvent.MOUSE_CLICKED, evt -> miMetodo(evt));
                conj.label.addEventHandler(MouseEvent.MOUSE_CLICKED, evt -> miventana(evt));
                conj.label.setMinWidth(10);
                map.put(conj.btn.getText(), conj);
                notas = "";
                //notasEnseñar = "";
                // notasEnseñar1 = "";
                i++;
            } else {
                textAgregarponde.setText("ya se ha creado esta ponderacion!");
            }
        } else {
            textAgregarponde.setText("introduce una ponderacion correcta!");
        }
        
    }
    
    private void miventana(Event evt) {

        // for (conjunto conj : map.values()) {
        //if (conj.btn.getText().equals(textAgregarponde.getText())) {
        Label lbl = (Label) evt.getSource();
        System.out.println("primer label:"+lbl.getText());
        lbltemp = lbl.getText();
        conjunto conj = Arrays.stream(map.values().toArray())
                .map(p -> (conjunto) p)
                .filter(p -> p.label.equals(lbl))
                .findFirst()
                .get();
        Dialog dialog = crearDialog(Double.parseDouble(conj.btn.getText()));
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            notas = "";
            
            p.agregarNota(Double.parseDouble(conj.btn.getText()), dialog.getResult().toString());
            System.out.println("dialog :" + dialog.getResult().toString());
            
            conjunto t = map.get(conj.btn.getText());

            //System.out.println("t:" + conj.btn.getText());
           // for (Nota nota : p.notas) {
                //if (nota.ponde == Double.parseDouble(conj.btn.getText())) {
              //  if (conj.label == lbl) {
                //    System.out.println("lbl:"+conj.label.getText());
                 //   notas += nota.nota + " ";
                   // System.out.println("en el for :" + notas);                    
                    
              //  }
                // }

          //  }
            conj.label.setText(p.listarNota());
           // conj.textfield.setText("");
            // notas = "";

            // }
            // }
        }
        res = p.Calcularmedia();
        textResult.setText(res + " ");
        
    }
    
    double res;
    Ponderacion p = new Ponderacion();
    
    private void miMetodo(Event evt) {
        Button g = (Button) evt.getSource();
        p.clear();
        for (conjunto conj : map.values()) {
            
            if (conj.btn.getText().equals(g.getText())) {
                conjunto t = map.get(conj.btn.getText());
                if (t.textfield.getText().matches("[0-9.]+[^,][0-9]|([1])?[0-9]")) {
                    notas = Double.parseDouble(conj.textfield.getText()) + " " + t.label.getText();
                    
                    System.out.println(conj.btn.getText());
                    
                    p.agregarNota(Double.parseDouble(conj.btn.getText()), notas);
                    t.label.setText(notas);
                    
                } else {
                    t.textfield.setText("has introducido mal la nota");
                    
                }
            }
        }
        
        res = p.Calcularmedia();
        System.out.println(res);
        textResult.setText(res + " ");
        p.clear();
    }
    
    Dialog crearDialog(double ponde) {
        
        System.out.println("esta aqui");
        //p.clear();
        Dialog dialog = new Dialog<>();
        dialog.setTitle("input notas ponderadas");
        dialog.setHeaderText("ver/editar notas de la ponderación elegida");
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
        TextArea txaNotas = new TextArea();
        txaNotas.setText(lbltemp);
        dialog.getDialogPane().setContent(txaNotas);
        dialog.setResultConverter(button -> {
            if (button == ButtonType.OK) {
                System.out.println(txaNotas.getText());
                p.clear();
                return txaNotas.getText();
                
            } else {
                return null;
            }
        });
        return dialog;
    }
    
}
