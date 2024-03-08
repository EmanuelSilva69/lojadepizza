package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app {
    private JButton button_msg;
    private JPanel panelMain;
    private JTextField aplicativoDeCompraTextField;
    private JTextField quantidadeDePizzaTextField;
    private JTextField nomeDoPedinteTextField;
    private JTextField nºDaOrdemTextField;
    private JTextField preçoDaSobrepizzaTextField;
    private JTextField preçoTotalTextField;
    private JTextField qualidadeDaPizzaTextField;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JRadioButton pizzaGrandeRadioButton;
    private JRadioButton pizzaMédiaRadioButton;
    private JRadioButton pizzaPequenaRadioButton;
    private JPanel Tipo_pizza;
    private JPanel Acompanhamentos;
    private JCheckBox linguiçaCheckBox;
    private JCheckBox oreganoCheckBox;
    private JCheckBox temperoEspecialCheckBox;
    private JCheckBox tomateCheckBox;
    private JCheckBox cebolaCheckBox;
    private JCheckBox pimentãoCheckBox;
    private JTextField tiposDePizzaTextField;
    private JTextField acompanhamentosNaPizzaTextField;
    private JButton button_limpeza;
    private JTextArea textArea1;

    public app() {
        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pega o imput
                int ordernumero
                        = Integer.parseInt(
                        textField1.getText());
                String nomepedido
                        = textField2.getText();
                int quantidade
                        = Integer.parseInt(
                        textField3.getText());
                int rate = 0;
                // Tipo de pizza
                if (pizzaGrandeRadioButton.isSelected()) {
                    rate = 500;
                }
                else if (pizzaMédiaRadioButton.isSelected()) {
                    rate = 300;
                }
                else if (pizzaPequenaRadioButton.isSelected()) {
                    rate = 150;
                }
                // Bota o valor de Rate ( sei lá pra q serve)
                // escreve na caixa de texto 4
                int tamanhopizza=0;
                if(rate==500){
                    tamanhopizza =3;

                }
                else if(rate==300){
                    tamanhopizza =2;

                }
                else if(rate==150){
                    tamanhopizza =1;

                }
                switch(tamanhopizza){
                    case 3:
                        textField6.setText("O tamanho da pizza é Grande e seu preço é: " + rate);
                        break;
                    case 2:
                        textField6.setText("O tamanho da pizza é Média e seu preço é: " + rate);
                        break;
                    case 1:
                        textField6.setText("O tamanho da pizza é Pequena e seu preço é: " + rate);
                        break;

                }
                double topamt = 0;
                // Checa quais adicionais da pizza eles querem
                if (linguiçaCheckBox.isSelected()) {
                    topamt += 60;
                }
                if (oreganoCheckBox.isSelected()) {
                    topamt = topamt + 30;
                }
                if (temperoEspecialCheckBox.isSelected()) {
                    topamt = topamt +200;
                }
                if (tomateCheckBox.isSelected()) {
                    topamt = topamt + 50;
                }
                if (cebolaCheckBox.isSelected()) {
                    topamt = topamt + 40;
                }
                if (pimentãoCheckBox.isSelected()) {
                    topamt = topamt + 80;
                }
                //preço do acompapnhamento
                textField5.setText("O preço do acompanhamento é : " + topamt);
                //preço total
                double totalpreco = (quantidade*rate) + topamt;
                textField4.setText("O preço total é : " + totalpreco);
                    // Mostra os detalhes da ordem
                textArea1.setText(
                                "Bom dia, seu ID de identificação é:  " + ordernumero
                                        + "\nNome: " + nomepedido
                                        + "\nPreço: " + totalpreco);

            }

        });
        button_limpeza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                pizzaGrandeRadioButton.setSelected(false);
                pizzaMédiaRadioButton.setSelected(false);
                pizzaPequenaRadioButton.setSelected(false);
                linguiçaCheckBox.setSelected(false);
                tomateCheckBox.setSelected(false);
                cebolaCheckBox.setSelected(false);
                pimentãoCheckBox.setSelected(false);
                temperoEspecialCheckBox.setSelected(false);
                oreganoCheckBox.setSelected(false);
                textArea1.setText("");

            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("app");
        frame.setContentPane(new app().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
