/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.io.Serializable;
import trabalho2.Aluno;
import trabalho2.Materia;
import trabalho2.Secretario;
import trabalho2.Universidade;

/**
 *
 * @author delatorre
 */
public class Matricula implements Serializable{
    
    private static final long serialVersionUID = 110L;
    
    private Materia materia;
    private Aluno aluno;   
    private String resultado;
    
    public  Matricula(Materia materia, Aluno aluno, Universidade uniPrincipal){
        this.materia = materia;
        this.aluno = aluno;
        uniPrincipal.solicitacao(this);
    }
    
    public Materia getMateria(){
        return materia;
    }
    
    public Aluno getAluno(){
        return aluno;
    }
    
    public void aceitar(){
        aluno.atualizaMaterias(materia.getCodMateria());
        materia.setAluno(aluno);
        resultado = "ACEITO";
    }
    
    public void recusar(){
        resultado = "RECUSADO";
    }
    
    public String toString(){
        return String.format("Materia: %s / %s\nAluno: %s\nResultado: %s\n", materia.getNome(), materia.getCodMateria(), aluno.getNome(), resultado);
    }
}


