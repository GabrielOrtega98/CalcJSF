/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.usj.ads.lp2.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Gabriel Ortega
 */
@ManagedBean
@RequestScoped
public class BeanCalculadora {
    
    private int a;
    private int b;
    private String op;
    private int resultado;
    
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    
    public void setResultado(double resultado) {
        this.resultado = (int) resultado;
    }
     public String somar() {
         resultado = a+b;
         return "resultado";
    }
    
      public String menos() {
         resultado = a-b;
         return "resultado";
    }
       public String mult() {
         resultado = a*b;
         return "resultado";
    }
        public String dividir() {
         resultado = a/b;
         return "resultado";
    }
    
    /**
     * @return the op
     */
    public String getOp() {
        return op;
    }

    /**
     * @param op the op to set
     */
    public void setOp(String op) {
        this.op = op;
    }
    

    
    public String efetuarOp(){
        switch(op){
            case "+":
            resultado=a+b;
            break;
            case "-":
            resultado=a-b;
            break;
            case "*":
            resultado=a*b;
            break;
            case "/":
            resultado=a/b;
            break;
            default:
        }
        return "resultado";
    }


}