/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paisesguia7.entidades;

import java.util.Objects;

/**
 *
 * @author anahi
 */
public class paises implements Comparable<paises>  {
    private String paises; 
    
    public paises(){
        
    }

    public paises(String paises) {
        this.paises = paises;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    @Override
    public int hashCode() /*valor numerico que se le asignan a los atributo para diferenciar su ubicacion*/{
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.paises);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final paises other = (paises) obj;
        if (!Objects.equals(this.paises, other.paises)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "paises{" + "paises=" + paises + '}';
    }

    @Override
    public int compareTo(paises t) /*este es el obj que llega de afuera que se quiere comparar contra mi*/{
       return this.paises.compareTo(t.getPaises());
    }
    
    
}
