/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import view.ViewInterface;

/**
 *
 * @author Mikel
 */
public class Location implements Serializable {

    private int row;
    private int column;
    private Item item;
    private String name;
    private ViewInterface locationView;

    public Location(int r, int c, String name, ViewInterface vi) {
        this.row = r;
        this.column = c;
        this.name = name;
        this.locationView = vi;
    }
    
    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", item=" + item + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.row);
        hash = 37 * hash + Objects.hashCode(this.column);
        hash = 37 * hash + Objects.hashCode(this.item);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        return true;
    }

    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ViewInterface getLocationView() {
        return locationView;
    }

    public void setLocationView(ViewInterface locationView) {
        this.locationView = locationView;
    }

    
}
