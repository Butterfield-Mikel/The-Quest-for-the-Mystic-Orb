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
 * @author Rich
 */
public class Map implements Serializable{
    
    public Map (){
    }
    
    private double rowCount;
    private double columnCount;
    
    public double getName() {
        return rowCount;
    }

    public void setName(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getName2() {
        return columnCount;
    }

    public void setName2(double columnCount) {
        this.columnCount = columnCount;
    }
}
