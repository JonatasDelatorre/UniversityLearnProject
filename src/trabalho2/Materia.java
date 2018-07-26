/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;
import java.io.Serializable;
import java.util.ArrayList;

public class Materia implements Serializable{
    
    private static final long serialVersionUID = 104L;
    
    private String nome;
    private String codMateria;
    private int minPresenca;
    private int maxAlunos;
    private Professor profTitular; 
    private String observacoes;
    private Curso curso;
    private ArrayList<Aluno> alunosMatriculados;
    
    public Materia(String nomeC, String codMateriaC, int minPresencaC, int maxAlunosC, String observacoesC, Curso curso){
       setNome(nomeC);
       setCodMateria(codMateriaC);
       setMinPresenca(minPresencaC);
       setMaxAlunos(maxAlunosC);
       setObservacoes(observacoesC);
       this.curso = curso;
       curso.setNovaMateria(this);
       alunosMatriculados = new ArrayList<>();
    }
    
    public void setAluno(Aluno novoAlunoS){
        alunosMatriculados.add(novoAlunoS);
    }
    
    public ArrayList<Aluno> getAlunoList(){
        return alunosMatriculados;
    }
    
    public Aluno getAluno(String matricula){
        for(int i = 0; i < alunosMatriculados.size(); i++){
            if(alunosMatriculados.get(i).getMatricula().equals(matricula)){
                return alunosMatriculados.get(i);
            }
        }
        return null;
    }
    
    
    public void setNome(String nomeS){
        nome = nomeS;
    }
    
    public void setCodMateria(String codMateriaS){
        codMateria = codMateriaS;
    }
    
    public void setMinPresenca(int minPresencaS){
        minPresenca = minPresencaS;
    }
    
    public void setMaxAlunos(int maxAlunosS){
        maxAlunos = maxAlunosS;
    }
    
    public void setProfTitular(Professor profTitularS){
        profTitular = profTitularS;
    }
    
    public void setObservacoes(String observacoesS){
        observacoes = observacoesS;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCodMateria(){
        return codMateria;
    }
    
    public int getMinPresenca(){
        return minPresenca;
    }
    
    public int getMaxAlunos(){
        return maxAlunos;
    }
    
    public Professor getProfessor(){
        return profTitular;
    }
    
    public String getObservacoes(){
        return observacoes;
    }
    
    @Override
    public String toString(){
        return String.format("Nome: %s\nCodigo: %s\nPresença Minima: %s\nMaximo de Alunos: %s\nObservações %s\n", getNome(), getCodMateria(), getMinPresenca(), getMaxAlunos(), getObservacoes());
    }
}
