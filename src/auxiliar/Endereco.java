/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.io.Serializable;

/**
 *
 * @author delatorre
 */
public class Endereco implements Serializable{
    
    private static final long serialVersionUID = 107L;
    
    private String rua;
    private String cidade;
    private String estado;
    private String bairro;
    private String numero;
    
    public Endereco(String ruaC, String cidadeC, String estadoC, String bairroC, String numeroC){
        setRua(ruaC);
        setCidade(cidadeC);
        setEstado(estadoC);
        setBairro(bairroC);
        setNumero(numeroC);
    }
    
    public void setRua(String ruaG){
        rua = ruaG;
    }
    
    public void setCidade(String cidadeG){
        cidade = cidadeG;
    }
    
    public void setEstado(String estadoG){
        estado = estadoG;
    }
   
    public void setBairro(String bairroG){
        bairro = bairroG;
    }
    
    public void setNumero(String numeroG){
        numero = numeroG;
    }
    
    public String getRua(){
        return rua;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public String getBairro(){
        return bairro;
    }

    public String getNumero(){
        return numero;
    }
    
    @Override
    public String toString(){
        return String.format("Rua: %s\nCidade: %s\nEstado: %s\nBairro: "
                + "%s\nNumero: %s", getRua(), getCidade(), getEstado(), getBairro(), getNumero());
    }
    
}
