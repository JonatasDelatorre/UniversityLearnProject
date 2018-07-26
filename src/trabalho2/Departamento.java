/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import java.io.Serializable;
import java.util.ArrayList;

public class Departamento implements Serializable {
    
    private static final long serialVersionUID = 102L;
    
    private String nome;
    private String codDep;
    private ArrayList<Curso> cursoList;
    private ArrayList<Professor> professorList;
    
    public Departamento(String nomeC, String codDepC, Universidade uniPrincipal){
        setNome(nomeC);
        setCodDep(codDepC);
        uniPrincipal.setDepartamento(this);
        cursoList = new ArrayList<>();
        professorList = new ArrayList<>();
    }
    
    public void setCurso(Curso novoCurso){     
        cursoList.add(novoCurso);
    }
    
    public Curso getCurso(String codCursoG){
        for(int i = 0; i < cursoList.size(); i++){
            if(cursoList.get(i).getCodCurso().equals(codCursoG)){
                return cursoList.get(i);
            }
        }
        return null;
    }
    
    public String getMatCurso(String codMateriaG){
        for(int i = 0; i< cursoList.size(); i++){
            if(cursoList.get(i).getMateria(codMateriaG).getCodMateria().equals(codMateriaG)){
                cursoList.get(i).getMateria(codMateriaG).toString();
            }
        }
        return "Não encontrado";
    }
    
    public Materia getMat(String codMateriaG){
        for(int i = 0; i< cursoList.size(); i++){
            if(cursoList.get(i).getMateria(codMateriaG).getCodMateria().equals(codMateriaG)){
                cursoList.get(i).getMateria(codMateriaG);
            }
        }
        return null;
    }
    
    public void removeCurso(String codCursoR){
        for(int i = 0; i < cursoList.size(); i++){
            if(cursoList.get(i).getCodCurso().equals(codCursoR)){
                cursoList.remove(i);
            }
        }
    }
    
    public void limpaCurso(){
        cursoList.clear();
    }
    
    public ArrayList<Curso> getCursoList(){
        return cursoList;
    }
    
    public ArrayList<Professor> getProfList(){
        return professorList;
    }
    
    public void setProfessor(Professor depProfessor){
        professorList.add(depProfessor);
    }
    
    public Professor getProfessor(String registroG){
        for(int i = 0; i < professorList.size(); i++){
            if(professorList.get(i).getRegistro().equals(registroG)){
                return professorList.get(i);
            }
        }
        return null;
    }   
 
    public void removeProfessor(String registroR){
        for(int i = 0; i < professorList.size(); i++){
            if(professorList.get(i).getRegistro().equals(registroR)){
                professorList.remove(i);
            }
        }
    }
    
    public void limpaProfessor(){
        professorList.clear();
    }
    
    public void setNome(String nomeS){
        nome = nomeS;
    }
    
    public void setCodDep(String codDepS){
        codDep = codDepS;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCodDep(){
        return codDep;
    }
    
    @Override
    public String toString(){
        return String.format("\nNome: %s\nCodigo: %s\n", getNome(), getCodDep());
    }
}
