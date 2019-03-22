/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnolambda;

/**
 *
 * @author carlos
 */
public class Profesor  extends Persona{
    double salario;
    String departamento;
    
   

    public Profesor(String nombre, String ape1, int edad, int altura, double peso) {
        this(nombre, ape1, edad, altura, peso,null,0);
    }
    
    public Profesor(String nombre, String ape1, int edad, int altura, double peso, String departamento, double salario) {
        super(nombre, ape1, edad, altura, peso);
        this.salario = salario;
        this.departamento = departamento;
    }
        
        
    public String toString(){
        return super.toString() + " departamento: " + departamento + " salario: " + salario;
    }    

    @Override
    double calcularPesoIdeal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
