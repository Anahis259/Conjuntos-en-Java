/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paisesguia7;


import paisesServicio.servPaises;
import paisesguia7.entidades.paises;


/**
 *
 * @author anahi
 */
public class PaisesGuia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servPaises obj = new servPaises(); 
        paises carpetaObj = new paises(); 
        obj.crearPaises(carpetaObj);
        obj.mostrarPaises(carpetaObj);
        //obj.ordenarConjunto(carpetaObj);
        //obj.mostrarPaises(carpetaObj);
        obj.buscarPaises(carpetaObj);
        
        
    }
    
}
