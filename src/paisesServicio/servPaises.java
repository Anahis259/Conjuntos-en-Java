/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paisesServicio;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import paisesguia7.entidades.paises;

/**
 *
 * @author anahi
 */
public class servPaises {

    private Scanner leer;
    TreeSet<paises> carpetaPaises = new TreeSet();

    public servPaises() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearPaises(paises obj) {
        
        String resp;
        do {
            System.out.println("Ingrese el nombre de un pais (!no puede haberlo ingresado antes¡)");
            obj.setPaises(leer.next());
            carpetaPaises.add(obj);
            obj = new paises();
            System.out.println("¿Desea ingresar otro pais a la carpeta?");
            resp = leer.next();
        } while ("si".equals(resp) || "SI".equals(resp));
    }

    public void mostrarPaises(paises obj) {
        for (paises carpetaPaise : carpetaPaises) {
            System.out.println("Lista: " + carpetaPaise.toString());
        }
    }

    public void buscarPaises(paises obj) {
        String buscarPais;
        System.out.println("Ingrese el pais que desea buscar en el conjunto: ");
        buscarPais = (leer.next());
        Iterator<paises> recorrer = carpetaPaises.iterator();
        boolean band = false;
        while (recorrer.hasNext()) {
            if (recorrer.next().getPaises().equals(buscarPais)) {
                recorrer.remove();
                band = true;

            }
        }

        if (!band) {

            System.out.println("El pais indicado no se encuentra disponible en el conjunto.");
        }
        for (paises carpetaPaise : carpetaPaises) {
            System.out.println("Nuevo conjunto: " + carpetaPaise.toString());
        }
    }

}
