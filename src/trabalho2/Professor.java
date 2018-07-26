/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;
import java.util.ArrayList;

public class Professor extends Membros {
    private String registro;
    private String departamento;
    private ArrayList<Materia> listMateriasLeciona;
    
    public Professor(String registroC, String nomeC, String cpfC, String nacionalidadeC, String emailC, String sexoC, String numeroContatoC, String ruaC, String cidadeC, String estadoC, String bairroC, String numeroC, int nivel, Universidade registraMembro){
        super(nomeC, cpfC, nacionalidadeC, emailC, sexoC, numeroContatoC, ruaC, cidadeC, estadoC, bairroC, numeroC, nivel, registraMembro);
        setRegistro(registroC);
        listMateriasLeciona = new ArrayList<>();
        super.setProfessor(this);
    }
    
    public ArrayList<Materia> getMatList(){
        return listMateriasLeciona;
    }
    
    public void novaMateriaLeciona(Materia novaMateria){
        listMateriasLeciona.add(novaMateria);
    }
    
    public void removeMateria(String codMateriaR){

        for(int i = 0; i < listMateriasLeciona.size(); i++){
            if(listMateriasLeciona.get(i).equals(codMateriaR)){
                listMateriasLeciona.remove(i);
            }
        }
    }
    
    public boolean verificaMateria(String codV){
        for(int i = 0; i < listMateriasLeciona.size(); i++){
            if(listMateriasLeciona.get(i).getCodMateria().equals(codV)){
                return true;
            }
        }
        return false;
    }
    
    public void limpaMaterias(){
        listMateriasLeciona.clear();
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getProfDepartamento(){
        return departamento;
    } 
    
    public void setRegistro(String registroS){
        registro = registroS;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public String getRegistro(){
        return registro;
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format("\nRegistro: %s\n", getRegistro());
    }
}


