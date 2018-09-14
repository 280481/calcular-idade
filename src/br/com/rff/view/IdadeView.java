/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rff.view;

import br.com.rff.model.IdadeModel;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author refra
 */
public class IdadeView extends JFrame implements ActionListener {

    private IdadeModel calcula;
    
    private JTextField txtNascimento, txtAtual, txtIdade;
    private JButton btnCalcular;
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public IdadeView() throws HeadlessException {
        
        setLayout(new GridLayout(0,2));
        
        txtNascimento = new JTextField();
        txtAtual = new JTextField();
        txtIdade = new JTextField();
        txtIdade.setEditable(false); //para nao conseguir editar o conteudo 
        
        btnCalcular = new JButton("Calcular");
        
        this.add(new JLabel("Ano Nascimento"));
        this.add(txtNascimento);
        
        this.add(new JLabel("Ano Atual"));
        this.add(txtAtual);
        
        this.add(new JLabel("Idade"));
        this.add(txtIdade);
        
        this.add(btnCalcular);
        btnCalcular.addActionListener(this); 
        
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public IdadeModel getCalcula() {
        calcula.setAnoNascimento(Double.parseDouble(txtNascimento.getText()));
        calcula.setAnoAtual(Double.parseDouble(txtAtual.getText()));
        return calcula;
    }

    public void setCalcula(IdadeModel calcula) {
        if (calcula.getAnoNascimento()>0){
            txtIdade.setText(Double.toString( calcula.getIdadeModel())); 
        }
        this.calcula = calcula;
    }
    
    public void addControllerActionListener(ActionListener al){
        btnCalcular.addActionListener(al);
    }
    
    
}
    
    

