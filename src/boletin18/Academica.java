/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;
import com.fred.Infromacion.Persoal;
/**
 *
 * @author fojomars
 */
public class Academica {
    private static int numReferencia = 2018;
    private String nome;
    private float nota;
    private Persoal alum;

    // CONSTRUCTOR POR DEFECTO
    public Academica(){
        numReferencia++;
    }
    
    
    // CONSTRUCTOR CON PARAMETROS
    public Academica(String nome, float nota, Persoal alum) {
        numReferencia++;
        this.nome = nome;
        this.nota = comprobarNota(nota);
        this.alum = alum;
    }

    
    // MÉTODOS DE ACCESO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = comprobarNota(nota);
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }
    
    // Método para comprobar que la nota esta entre 1 y 10
    private float comprobarNota(float nota){
        if(nota < 1 || nota > 10){
            System.out.println("La nota es incorrecta");
            return 0;
        }
        else{
            return nota;
        }
    }
    
    
    // MÉTODO TO STRING

    @Override
    public String toString() {
        return "nome = " + nome + ", nota = " + nota + ", alum = " + alum;
    }
    

    
    
}
