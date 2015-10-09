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
public class Fox implements Serializable{
    
    public String name; 
    public Boolean aloneWithChicken;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAloneWithChicken() {
        return aloneWithChicken;
    }

    public void setAloneWithChicken(Boolean aloneWithChicken) {
        this.aloneWithChicken = aloneWithChicken;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.aloneWithChicken);
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
        final Fox other = (Fox) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.aloneWithChicken, other.aloneWithChicken)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fox{" + "name=" + name + ", aloneWithChicken=" + aloneWithChicken + '}';
    }
    
    
}
