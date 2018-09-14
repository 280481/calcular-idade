package br.com.rff.ControlerIdade;

import br.com.rff.model.IdadeModel;
import br.com.rff.view.IdadeView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author refra
 */
public class ControlerIdade implements ActionListener{

    private IdadeView minhaView;

    public ControlerIdade() {
        minhaView = new IdadeView();
        IdadeModel model = new IdadeModel();
        minhaView.setCalcula(model); 
        this.minhaView.addControllerActionListener(this);
        this.minhaView.setVisible(true);
    }
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (minhaView!=null){
            this.calculaIdade();
        }
    }
    
    private void calculaIdade() {
       IdadeModel idadeCalc = minhaView.getCalcula();
       idadeCalc.getIdadeModel();
       minhaView.setCalcula(idadeCalc);
       
    }
    
}