/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author mannj14
 */
public class Chicken implements Serializable{
    
    private String name;
    private boolean aloneWithCorn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAloneWithCorn() {
        return aloneWithCorn;
    }

    public void setAloneWithCorn(boolean aloneWithCorn) {
        this.aloneWithCorn = aloneWithCorn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + (this.aloneWithCorn ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chicken other = (Chicken) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.aloneWithCorn != other.aloneWithCorn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Chicken{" + "name=" + name + ", aloneWithCorn=" + aloneWithCorn + '}';
    }

  
    
            
    
}
