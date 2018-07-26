/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;
import auxiliar.Data;
import java.io.Serializable;
import java.util.ArrayList;

public class Curso implements Serializable{
    
    private static final long serialVersionUID = 103L;
    
    private String nome;
    private String codCurso;
    private int periodo;
    private int cargaHoraria;
    private Data dataInicio;
    private String nivel;
    private String departamento;
    private ArrayList<Materia> matList;
    private ArrayList<Aluno> alunoList;
    
    public Curso(String nomeC, String codCursoC, int periodoC, int cargaHorariaC, int dia, int mes, int ano, String nivelC, String dep){
        setNome(nomeC);
        setCodCurso(codCursoC);
        setPeriodo(periodoC);
        setCargaHoraria(cargaHorariaC);
        dataInicio = new Data(dia, mes, ano);
        setDepartamento(dep);
        setNivel(nivelC);
        alunoList = new ArrayList<>();
        matList = new ArrayList<>();
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public void setNovaMateria(Materia novaMateria){
        matList.add(novaMateria);
    }
    
   
    public void removeMateria(String codMateria){
        for(int i = 0; i < matList.size(); i++){
            if(matList.get(i).getCodMateria().equals(codMateria)){
                matList.remove(i);
            }
        }
    }
    
    public Materia getMateria(String codMateria){
        for(int i = 0; i < matList.size(); i++){
            if(matList.get(i).getCodMateria().equals(codMateria)){
                return matList.get(i);
            }
        }
        return null;
    }
    
    public void limpaMaterias(){
        matList.clear();
    }
    
    public ArrayList<Materia> getMatList(){
        return matList;
    }
    
    public ArrayList<Aluno> getAlunoList(){
        return alunoList;
    }
    
    public void setAluno(Aluno novoAluno){
        alunoList.add(novoAluno);
    }
    
    public void removeAluno(String matricula){
        for(int i = 0; i < alunoList.size(); i++){
            if(alunoList.get(i).getMatricula().equals(matricula)){
                alunoList.remove(i);
            }
        }
    }
 
    public void limpaAlunosCursando(){
        alunoList.clear();
    }
    
    public Aluno matriculaAluno(String matricula, String codMateria){
        for(int i = 0; i < alunoList.size(); i++){
            if(alunoList.get(i).getMatricula().equals(matricula)){
                for(int j = 0; j < matList.size(); j++){
                    if(matList.get(j).getCodMateria().equals(codMateria)){
                        matList.get(j).setAluno(alunoList.get(i));
                    }
                }
            }
        }
        return null;
    }
    
    public void setNome(String nomeS){
        nome = nomeS;
    }
    
    public void setCodCurso(String codCursoS){
        codCurso = codCursoS;
    }
    
    public void setPeriodo(int periodoS){
        periodo = periodoS;
    }
    
    public void setCargaHoraria(int cargaHorariaS){
        cargaHoraria = cargaHorariaS;
    }
    
    public void setNivel(String nivelS){
        nivel = nivelS;
    }

    public String getNome(){
        return nome;
    }
    
    public String getCodCurso(){
        return codCurso;
    }
    
    public int getPeriodo(){
        return periodo;
    }
    
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    
    public Data getDataInicio(){
        return dataInicio;
    }
    
    public String getNivel(){
        return nivel;
    }    
    
    public String getDepartamento(){
        return departamento;
    }
    
    @Override
    public String toString(){
        return String.format("Departamento: %s\nNome: %s\nCodigo: %s\nPeriodo: %d\nCarga Horaria: %d\n%s\nNivel: %s\n", getDepartamento(), getNome(), getCodCurso(), getPeriodo(), getCargaHoraria(), dataInicio.toString(), getNivel());
    }
    
}
