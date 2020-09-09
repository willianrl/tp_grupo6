package com.batcheador;
import javax.swing.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        //JCOMBOBOX
        String opciones[] = new String[] {"opcion1", "opcion2", "opcion3"};

        JComboBox comboBox = new JComboBox<String>(opciones);
        comboBox.setBounds(200, 50 ,90,20);

        //TEXTFIELD
        JTextField textField = new JTextField("Ingresar algo");
        textField.setBounds(200, 200 , 150, 20);

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if(e.getKeyCode() == KeyEvent.VK_ENTER){

                    String texto = textField.getText();
                    System.out.println(texto);
                    textField.setText(null);
                }
            }

        });

        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.setText(null);
            }
        });

        //JBUTTOM
        JButton buttom = new JButton("boton 1");
        buttom.setBounds(200,350,90, 20);

        buttom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showOpenDialog(null);
            }
        });

        frame.add(comboBox);
        frame.add(textField);
        frame.add(buttom);

        frame.setSize(600, 700);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}

