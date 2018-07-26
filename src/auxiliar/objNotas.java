/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.io.Serializable;
import trabalho2.Materia;

public class objNotas implements Serializable{
    
    private static final long serialVersionUID = 105L;
    
    private Materia materia;
    private double nota1;
    private double nota2;
    private double notaFinal;
    
    
    public objNotas(double nota1C, double nota2C, double notaFinalC, Materia materiaC){
        setNota1(nota1C);
        setNota2(nota2C);
        setNotaFinal(notaFinalC);
        setMateria(materiaC);
    }
    
    public void setMateria(Materia materiaS){
        materia = materiaS;
    }
    
    public Materia getMateria(){
        return materia;
    }
    
    public double media(){
        double media = (nota1+nota2)/2;
        return media;
    }
    
    public double mediaFinal(){
        double mediaF = (media()+notaFinal/2);
        return mediaF;
    }
    
    
    public void setNota1(double nota1S){
        nota1 = nota1S;
    }

    public void setNota2(double nota2S){
        nota1 = nota2S;
    }

    public void setNotaFinal(double notaFinalS){
        nota1 = notaFinalS;
    }
  
    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }    
    
    public double getNotaFinal(){
        return notaFinal;
    }
    
    @Override
    public String toString(){
        return String.format("Nota1: %s   Nota2: %s\nNota Final: %s\nMedia: %s\nMedia Final: %s", getNota1(), getNota2(), getNotaFinal(), media(), mediaFinal());
    }
   
}
