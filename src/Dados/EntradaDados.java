/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import trabalho2.Universidade;

/**
 *
 * @author delatorre
 */
public class EntradaDados {
    
    private static Universidade uniPrincipal;
    private static ObjectInputStream input;
    private static ObjectOutputStream output;
    
    public static Universidade leDados() throws IOException, ClassNotFoundException, FileNotFoundException{
       
       input = new ObjectInputStream(new FileInputStream("universidade.txt"));

        uniPrincipal = (Universidade) input.readObject();
      
        
        return uniPrincipal;
    }
    
    public static void escreveDados(Universidade universidade){
        
        uniPrincipal = universidade;
        
        try{
            output = new ObjectOutputStream(new FileOutputStream("universidade.txt"));
        }
        catch(IOException ioExeption){
            JOptionPane.showMessageDialog(null, "Erro ao abrir o Arquivo", "ERRO", ERROR_MESSAGE);
        }
        try{
            output.writeObject(uniPrincipal);
        }
        catch(IOException ioExeption){
            JOptionPane.showMessageDialog(null, "Erro ao ler o Arquivo", "ERRO", ERROR_MESSAGE);
        }
        
    }
    
    public static void closeInputFile(){
        try {
            if(input != null)
                input.close();
        }
        catch(IOException ioExeption){
            JOptionPane.showMessageDialog(null, "Erro ao fechar o Arquivo", "ERRO", ERROR_MESSAGE);
        }
    }
    
    public static void closeOutputFile(){
        try {
            if(output != null)
                output.close();
        }
        catch(IOException ioExeption){
            JOptionPane.showMessageDialog(null, "Erro ao fechar o Arquivo", "ERRO", ERROR_MESSAGE);
        }
    }
    
}
