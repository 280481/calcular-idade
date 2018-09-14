
package br.com.rff.model;

/**
 *
 * @author refra
 */
public class IdadeModel {
    
    private double AnoNascimento; 
    private double AnoAtual; 

    public double getAnoNascimento() {
        return AnoNascimento;
    }

    public void setAnoNascimento(double AnoNascimento) {
        this.AnoNascimento = AnoNascimento;
    }

    public double getAnoAtual() {
        return AnoAtual;
    }

    public void setAnoAtual(double AnoAtual) {
        this.AnoAtual = AnoAtual;
    }

   public double getIdadeModel(){
       return AnoAtual - AnoNascimento;
   }     
}

