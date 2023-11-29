package br.com.imobiliaria.controller;

import br.com.imobiliaria.model.Calculos;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

public class JFXImobiliaria {


    public Button bQuadrado;
    public Button bRetangulo;
    public Button bTriangulo;
    public Button bCirculo;
    public Button bLosangulo;
    public Button bSalvar;
    public Button bFechar;
    public TextField txfArea;

Calculos calculos = new Calculos();
    public void calcularAreaQuadrado (ActionEvent actionEvent){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado do quadrado: "));

        txfArea.setText(String.valueOf(calculos.calcularAreaQuadrado(n1) ) );

    }
    public void calcularAreaRetangulo(ActionEvent actionEvent){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado do Retangulo: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o ladob do Retangulo: "));
        txfArea.setText(String.valueOf(calculos.calcularAreaRetangulo(n1,n2) ) );

    }
}
