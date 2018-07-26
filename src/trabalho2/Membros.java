/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;
import auxiliar.Endereco;
import auxiliar.Senhas;
import java.io.Serializable;


public class Membros implements Serializable {
    
    private static final long serialVersionUID = 101L;
    
    private String nome;
    private String cpf;
    private String nacionalidade;
    private String email;
    private String sexo;
    private String numeroContato;
    private Endereco endereco;
    private int nivel;
    private Secretario secretario;
    private Professor professor;
    private Aluno aluno;
    

    
    public Membros(String nomeC, String cpfC, String nacionalidadeC, String emailC, String sexoC, String numeroContatoC, String ruaC, String cidadeC, String estadoC, String bairroC, String numeroC, int nivelC, Universidade registraMembro){
        setNome(nomeC);
        setCpf(cpfC);
        setNacionalidade(nacionalidadeC);
        setEmail(emailC);
        setSexo(sexoC);
        setNumeroContato(numeroContatoC);
        setNivel(nivelC);
        setEndereco( ruaC, cidadeC, estadoC, bairroC, numeroC);
        registraMembro.setMembros(this);
    }
    
// Bloco de metodos SET
        public void setNome(String nomeS){
            nome = nomeS;
        }

        public void setCpf(String cpfS){
            cpf = cpfS;
        }
        
        public void setNacionalidade(String nacionalidadeS){
            nacionalidade = nacionalidadeS;
        }
        
        public void setEmail(String emailS){
            email = emailS;
        }
        
        public void setSexo(String sexoS){
            sexo = sexoS;
        }
        
        public void setNumeroContato(String numeroContatoS){
            numeroContato = numeroContatoS;
        }
        
        public void setEndereco(String ruaS, String cidadeS, String estadoS, String bairroS, String numeroS){
           endereco = new Endereco(ruaS, cidadeS, estadoS, bairroS, numeroS);
        }
        
        public void setNivel(int nivelS){
            nivel = nivelS;
        }
        
        public void setSecretario(Secretario secretarioS){
            secretario = secretarioS;
        }
        
        public void setProfessor(Professor professorS){
            professor = professorS;
        }
        
        public void setAluno(Aluno alunoS){
            aluno = alunoS;
        }

// Bloco de metodos GET     
        public String getNome(){
            return nome;
        }

        public String getCpf(){
            return cpf;
        }
        
        public String getNacionalidade(){
            return nacionalidade;
        }
        
        public String getEmail(){
            return email;
        }
        
        public String getSexo(){
            return sexo;
        }
        
        public String getNumeroContato(){
            return numeroContato;
        }
        
        public Endereco getEndereco(){
            return endereco;
        }
        
        public int getNivel(){
            return nivel;
        }
        
        public Secretario getSecretario(String registroG){
            return secretario;
        }
       
        public Professor getProfessor(String registroG){
            return professor;
        }
        
        public Aluno getAluno(String registroG){
            return aluno;
        }
        
        @Override
        public String toString(){
            return String.format("Nome: %s \nCPF: %s \nNacionalidade: %s\nEmail: %s\nSexo: %s"
                    + "\nNumero de Contato: %s\n"
                    + "%s\n", getNome(), getCpf(), getNacionalidade(), getEmail(), getSexo(), getNumeroContato(), endereco.toString());
        }
}
