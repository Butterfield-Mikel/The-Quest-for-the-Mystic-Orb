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
 * @author Mikel
 */
public class EnchantedApple implements Serializable{
    
    
    private String name;
    private String halfEaten;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.halfEaten);
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
        final EnchantedApple other = (EnchantedApple) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.halfEaten, other.halfEaten)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EnchantedApple{" + "name=" + name + ", halfEaten=" + halfEaten + '}';
    }
    
    

    public EnchantedApple() {
    }
      

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHalfEaten() {
        return halfEaten;
    }

    public void setHalfEaten(String halfEaten) {
        this.halfEaten = halfEaten;
    }
    
}
