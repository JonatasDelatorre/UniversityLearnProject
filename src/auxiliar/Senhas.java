/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;
import java.io.Serializable;
import java.util.ArrayList;

public class Senhas implements Serializable{
    
    private static final long serialVersionUID = 108L;
    
    private ArrayList<String> listLogin;
    private ArrayList<String> listSenha;
    private ArrayList<Integer> listNivel;

    public Senhas(){
        listLogin = new ArrayList<>();
        listSenha = new ArrayList<>();
        listNivel = new ArrayList<>();
    }
    
    public String getSenha(String login){
        for(int i = 0; i < listLogin.size(); i++){
            if(listLogin.get(i).equals(login)){
                return listSenha.get(i);
            }
        }
        return "Não encontrado";
    }
    
    public void alteraSenha(String login, String senha){
        for(int i = 0; i < listLogin.size(); i++){
            if(listLogin.get(i).equals(login)){
                listSenha.set(i, senha);
            }
        }
    }
 
    public void setLogin(String login, String senha, int nivel){
        listLogin.add(login);
        listSenha.add(senha);
        listNivel.add(nivel);
    }
    
    public void removeLogin(String login){
        for(int i = 0; i < listLogin.size(); i++){
            if(listLogin.get(i).equals(login)){
                listLogin.remove(i);
                listSenha.remove(i);
                listNivel.remove(i);
            }
        }
    }
    
    public int verificaLogin(String login, String senha){  
        for(int i = 0; i < listLogin.size(); i++){
            if(listLogin.get(i).equals(login)){
                if(listSenha.get(i).equals(senha)){
                    return listNivel.get(i);
                }
            }
        }
        return 4;
    }  
}
