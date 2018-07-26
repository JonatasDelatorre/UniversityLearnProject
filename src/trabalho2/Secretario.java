/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import auxiliar.Matricula;
import java.util.ArrayList;


public class Secretario extends Membros{
    private String registro;
    private ArrayList<Matricula> solicitacoes;

    
    public Secretario(String registroC, String nomeC, String cpfC, String nacionalidadeC, String emailC, String sexoC, String numeroContatoC, String ruaC, String cidadeC, String estadoC, String bairroC, String numeroC, int nivel, Universidade registraMembro){
        super(nomeC, cpfC, nacionalidadeC, emailC, sexoC, numeroContatoC, ruaC, cidadeC, estadoC, bairroC, numeroC, nivel, registraMembro);
        setRegistro(registroC);
        super.setSecretario(this);
        solicitacoes = registraMembro.getSolicitacaoList();
    }
    
    public ArrayList<Matricula> getSolicitacaoList(){
        return solicitacoes;
    }

    public void setRegistro(String registroS){
        registro = registroS;
    }
    
    public String getNome(){
        return super.getNome();
    }
    
    public String getRegistro(){
        return registro;
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format("\nRegistro: %s\n", getRegistro());
    }
    
}
