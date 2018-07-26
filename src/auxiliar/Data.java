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

public class Data implements Serializable{
    
    private static final long serialVersionUID = 106L;
    private int dia;
    private int mes;
    private int ano;
	
    public Data(int dia, int mes, int ano){
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
    }

    @Override
    public String toString(){
	return String.format("Data: %d/%d/%d", this.dia, this.mes, this.ano);
    }
}