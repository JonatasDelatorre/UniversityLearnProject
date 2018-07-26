/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import auxiliar.Matricula;
import auxiliar.objNotas;
import java.util.ArrayList;

public class Aluno extends Membros{
    private String matricula;
    private String cursoMatriculado;
    private ArrayList<String> matList;
    private ArrayList<objNotas> historico;
    private ArrayList<Matricula> matriculaList;

    public Aluno(String nomeC, String cpfC, String nacionalidadeC, String emailC, String sexoC, String numeroContatoC, String ruaC, String cidadeC, String estadoC, String bairroC, String numeroC, String matriculaC, int nivel, String cursoC, Universidade registraMembro){
        super(nomeC, cpfC, nacionalidadeC, emailC, sexoC, numeroContatoC, ruaC, cidadeC, estadoC, bairroC, numeroC, nivel, registraMembro);
        setMatricula(matriculaC);
        super.setAluno(this);
        setCursoMatriculado(cursoC);
        historico = new ArrayList<>();
        matList = new ArrayList<>();
        matriculaList = new ArrayList<>();
    }
    
    public ArrayList<objNotas> getHistorico(){
        return historico;
    }
    
    public String getNotaMat(String cod){
        for(int i = 0; i < historico.size(); i++){
            if(historico.get(i).getMateria().getCodMateria().equals(cod)){
                return historico.get(i).toString();
            }
        }
        return "não encontrado";
    }
    
    public void setMatriculaList(Matricula solicitacao){
        matriculaList.add(solicitacao);
    }
    
    public ArrayList<String> getMaterias(){
        return matList;
    }
    
    public ArrayList<Matricula> getMatriculas(){
        return matriculaList;
    }
    
    public void atualizaHistorico(objNotas novasNotas){
        historico.add(novasNotas);
    }
    
    public void atualizaMaterias(String novaMateria){
        matList.add(novaMateria);
    }
 
    public String getMateria(String codMateria){  
        for(int i = 0; i < matList.size(); i++){
            if(matList.get(i).equals(codMateria)){
                return matList.get(i);
            }
        } 
        return null;
    }
    
    public void removeMateria(String codMateria){  
        for(int i = 0; i < matList.size(); i++){
            if(matList.get(i).equals(codMateria)){
                matList.remove(i);
            }
        } 
    }
  
    public void limpaMaterias(){
        matList.clear();
    }
    
    public void setCursoMatriculado(String novoCursoS){
        cursoMatriculado = novoCursoS;
    }
    
    public void setMatricula(String matriculaS){
        matricula = matriculaS;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public String getCurso(){
        return cursoMatriculado;
    }
    
    public String toString(){
        return super.toString() + String.format("\nMatricula: %s\nCurso: %s\n", getMatricula(), getCurso());
    }
}


