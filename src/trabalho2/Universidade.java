/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import auxiliar.Endereco;
import auxiliar.Matricula;
import auxiliar.Senhas;
import java.io.Serializable;
import java.util.ArrayList;
import trabalho2.Professor;

public class Universidade implements Serializable{
    
    private static final long serialVersionUID = 100L;
    
    private String nome;
    private String endereco;
    private String nomeUnidade;
    private String registro;
    private String numeroContato;
    private Endereco enderecoPrincipal;
    private ArrayList<Departamento> depList;
    private ArrayList<Membros> membList;
    private ArrayList<Matricula> solicitacoes;
    private Senhas infoLogin;
    
    
// Construtor Unico de Universidade por ser a Classe principal todos os argumentos obrigatorios    
    public Universidade(String nomeC, String nomeUnidadeC, String registroC, String numeroContatoC, String ruaC, String cidadeC, String estadoC, String bairroC, String numeroC){
        setNome(nomeC);
        setNomeUnidade(nomeUnidadeC);
        setRegistro(registroC);
        setNumContato(numeroContatoC);
        enderecoPrincipal = new Endereco(ruaC, cidadeC, estadoC, bairroC, numeroC);
        depList = new ArrayList<>();
        membList = new ArrayList<>();
        infoLogin = new Senhas();
        solicitacoes = new ArrayList<>();
    }

// Bloco de metodos SET
    public void setNome(String nomeS){
        nome = nomeS;
    }
    
    public void setNomeUnidade(String nomeUnidadeS){
        nomeUnidade = nomeUnidadeS;
    }
    
    public void setRegistro(String registroS){
        registro = registroS;
    }

    public void setNumContato(String numeroContatoS){
        numeroContato = numeroContatoS;
    }
    
// Bloco de metodos GET
    public Universidade getUniversidade(){
        return this;
    }
    
    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }
    
    public String getNomeUnidade(){
        return nomeUnidade;
    }
    
    public String getRegistro(){
        return registro;
    }

    public String getNumContato(){
        return numeroContato;
    }
    
    public Senhas getSenhas(){
        return infoLogin;
    }
    
    
// Inicialização de um objeto Departamento com argumentos que é adicionado a lista de departamentos  
    public void setDepartamento(Departamento novoDepartamento){
        depList.add(novoDepartamento);
    }

/* Departamento é removido a partir da identificação de um objeto na lista com codigo correspondente uma 
 vez que o codigo é de identificação unico */
    public void removeDepartamento(String codDepR){

        for(int i = 0; i < depList.size(); i++){
            if(depList.get(i).getCodDep().equals(codDepR)){
                depList.remove(i);
            }
        }
    }
    
    public Departamento getDepartamento(String codDepG){
        for(int i = 0; i < depList.size(); i++){
            if(depList.get(i).getCodDep().equals(codDepG)){
                return depList.get(i);
            }
        }
        return null;
    }
    
    public void limpaDepartamento(){
        depList.clear();
    }
 
    public ArrayList<Departamento> getDepList(){
        return depList;
    }
    
// Inicialização de um objetoMembros com argumentos, que é adicionado a lista de membros
    public void setMembros(Membros novoMembro){
        membList.add(novoMembro);
    }

    
    public String getMembros(String cpfG){
        for(int i = 0; i < membList.size(); i++){
            if(membList.get(i).getCpf().equals(cpfG)){
                return membList.get(i).toString();
            }
        }
        return "Não encontrado\n";
    }
    
    public void limpaMembros(){
        membList.clear();
    }
    
    public String getSecretarioUniversidade(String registroG){
        for(int i = 0; i < membList.size(); i++){
            if(membList.get(i).getNivel() == 1){
                if(membList.get(i).getSecretario(registroG).getRegistro().equals(registroG)){
                    return membList.get(i).getSecretario(registroG).toString();
                }
            }
        }
        return "Não encontrado";
    }
    
    public Secretario getSecretario(String registroG){
        for(int i = 0; i < membList.size(); i++){
            if(membList.get(i).getNivel() == 1){
                if(membList.get(i).getSecretario(registroG).getRegistro().equals(registroG)){
                    return membList.get(i).getSecretario(registroG);
                }
            }
        }
        return null;
    }
    
    public void removeSecretarioUniversidade(String registroG){
        for(int i = 0; i < membList.size(); i++){
            if(membList.get(i).getNivel() == 1){
                if(membList.get(i).getSecretario(registroG).getRegistro().equals(registroG)){
                    membList.remove(i);
                }
            }
        }
    }
    
  
    public String getProfessorUniversidade(String registroG){
        for(int i = 0; i < membList.size(); i++){
            if(membList.get(i).getNivel() == 2){
                if(membList.get(i).getProfessor(registroG).getRegistro().equals(registroG)){
                    return membList.get(i).getProfessor(registroG).toString();
                }
            }
        }
        return "Não encontrado";
    }
    
    public Professor getProfessor(String registroG){
        for(int i = 0; i < membList.size(); i++){
            if(membList.get(i).getNivel() == 2){
                if(membList.get(i).getProfessor(registroG).getRegistro().equals(registroG)){
                    return membList.get(i).getProfessor(registroG);
                }
            }
        }
        return null;
    }
    
    public void removeProfessorUniversidade(String registroG){
        for(int i = 0; i < membList.size(); i++){
            if(membList.get(i).getNivel() == 2){
                if(membList.get(i).getProfessor(registroG).getRegistro().equals(registroG)){
                    membList.remove(i);
                }
            }
        }
    }
    
    public String getAlunoUniversidade(String matriculaG){
        for(int i = 0; i < membList.size(); i++){
            if(membList.get(i).getNivel() == 3){
                if(membList.get(i).getAluno(matriculaG).getMatricula().equals(matriculaG)){
                    return membList.get(i).getAluno(matriculaG).toString();
                }                
            }
        }
        return "Não encontrado\n";
    }
    
    public Aluno getAluno(String matriculaG){
        for(int i = 0; i < membList.size(); i++){
            if(membList.get(i).getNivel() == 3){
                if(membList.get(i).getAluno(matriculaG).getMatricula().equals(matriculaG)){
                    return membList.get(i).getAluno(matriculaG);
                }                
            }
        }
        return null;
    }
    
    public void removeAlunoUniversidade(String matriculaG){
        for(int i = 0; i < membList.size(); i++){
            if(membList.get(i).getNivel() == 3){
                if(membList.get(i).getAluno(matriculaG).getMatricula().equals(matriculaG)){
                    membList.remove(i);
                }                
            }
        }
    }
    
    public String getCursoUniversidade(String codCursoG){
        for(int i = 0; i < depList.size(); i++){
            if(depList.get(i).getCurso(codCursoG).getCodCurso().equals(codCursoG)){
                return depList.get(i).getCurso(codCursoG).toString();
            }
        }
        return "Não encontrado\n";
    }
   
    public Curso getCurso(String codCursoG){
        for(int i = 0; i < depList.size(); i++){
            if(depList.get(i).getCurso(codCursoG).getCodCurso().equals(codCursoG)){
                return depList.get(i).getCurso(codCursoG);
            }
        }
        return null;
    }
    
    public String getMateriaUniversidade(String codMateriaG){
        for(int i = 0; i < depList.size(); i++){
            if(!(depList.get(i).getMatCurso(codMateriaG).equals("Não encontrado"))){
                return depList.get(i).getMatCurso(codMateriaG);
            }
        }
        return "Não encontrado\n";
    }
    
    public Materia getMateria(String codMateriaG){
        for(int i = 0; i < depList.size(); i++){
            if((depList.get(i).getMat(codMateriaG) != null)){
                return depList.get(i).getMat(codMateriaG);
            }
        }
        return null;
    }
    
    public void solicitacao(Matricula mat){
        solicitacoes.add(mat);
    }
    
    public ArrayList<Matricula> getSolicitacaoList(){
        return solicitacoes;
    }
   
    public void removeSolicitacao(String codMat, String matricula){
        for(int i = 0; i < solicitacoes.size(); i++){
            if(solicitacoes.get(i).getMateria().getCodMateria().equals(codMat) && solicitacoes.get(i).getAluno().getMatricula().equals(matricula)){
                solicitacoes.remove(i);
            }
        }
    }
    
    @Override
    public String toString(){
        return String.format("Nome: %s\nEndereco: %s\nNome da Unidade: %s\nRegistro: %s\nNumero de Contato: %s\n", getNome(), enderecoPrincipal.toString(), getNomeUnidade(), getRegistro(), getNumContato());
    }
        
    
}
