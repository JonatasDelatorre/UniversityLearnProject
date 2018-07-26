/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suporte;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author delatorre
 */
public class Validacao {
    private static Pattern pattern;
    private static Matcher matcher;
    
    public static String validaAll(String nome, String cpf){
        int flag = 0;
        String referencia = "valido";
        
        flag = validaNome(nome);
        if(flag == 1){
            referencia = ("Nome invalido\n");
            flag = 0;
        }
        flag = validaCpf(cpf);
        if(flag == 1){
            if(referencia.equals("valido")){
                referencia = ("CPF invalido\n");
                flag = 0;
            }
            else{
                referencia = referencia + ("CPF invalido\n");
                flag = 0;
            }
        }
        
        return referencia;
    }
    
    public static int validaNome(String nome){
        pattern = Pattern.compile("([a-zA-Z]+\\s+[a-zA-Z]+)+");
        matcher = pattern.matcher(nome);
        
        if(matcher.matches() == true){
            return 0;
        }
        
        return 1;
    }
    
    public static int validaCpf(String cpf){
        pattern = Pattern.compile("[0-9]{11}");
        matcher = pattern.matcher(cpf);
        
        if(matcher.matches() == true){
            return 0;
        }
        return 1;
    }
}
