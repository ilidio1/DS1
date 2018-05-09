/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

/**
 *
 * @author Rig
 */
public class ContaBanco {
  private int numConta;
  private String tipo;
  private String dono;
  private float saldo;
  private boolean status;

 public void estadoAtual(){
  System.out.println("Conta "+this.getNumConta());
  System.out.println("Dono"+this.getDono());  
  System.out.println("Tipo"+this.getTipo());  
  System.out.println("Saldo"+this.getSaldo());
  System.out.println("Status"+this.getStatus());  
 }

public void abrirConta(String tipo){
   this.setTipo(tipo);
   this.setStatus(true);
    if (tipo == "CC") {
        this.setSaldo(50);
    } else if (tipo =="CP") {
        this.setSaldo(150);
    }
     }
public void fecharConta(){
    if(this.getSaldo()>0){
        System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
    }else if (this.getSaldo()<0){
        System.out.println("Contão não pode ser fechado porque ainda possui debitos");
}   else{
        this.setStatus(false);
        System.out.println("Conta fechada com sucesso");
    }  
}public void depositar(float v ){
    if (this.getStatus()){
      this.setSaldo(this.getSaldo() + v) ; 
      System.out.println(("Deposito realizado  na conta de " + this.getDono()));
    }else{System.out.println("Impossivel depositar numa conta fechada");}

}
public void sacar(float v){
    if(this.getStatus()){
        if (this.getSaldo()>= v ){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado na conta de : " + this.getDono());
        }else{System.out.println("Você não possui saldo ");}
    }else{System.out.println("Impossivel sacar de uma conta fechada!");}
}
public void pagarMensal(){
    int v = 0 ;
    if (this.getTipo()=="CC") {
        v = 12;
        
    } else if (this.getTipo()=="CP"){
        v = 20;
    }
    if(this.getStatus()){
        this.setSaldo(this.getSaldo() - v );
        System.out.println("Mensalidade paga com sucesso por " + this.getDono());
    }else{System.out.println("Impossivel pagar uma conta fechada");}
}
//metodo construtor 
    public ContaBanco() {
        this.saldo = 0;
        this.setStatus(false);       
    }
    /**
     * @return the numConta
     */
    public int getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the dono
     */
    public String getDono() {
        return dono;
    }

    /**
     * @param dono the dono to set
     */
    public void setDono(String dono) {
        this.dono = dono;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the status
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

}