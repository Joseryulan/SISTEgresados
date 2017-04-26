/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author sena
 */
public class Persona_1 {
    private String ropa;
    public void setRopa(String ropaparametro)
    {
    this.ropa=ropaparametro;
    }
    public String getRopa()
    {
    return this.ropa;
    }
    public void desgaste()
    {
    System.out.print(ropa+"desgaste");
    }
}
