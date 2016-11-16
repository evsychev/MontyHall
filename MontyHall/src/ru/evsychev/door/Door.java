/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.evsychev.door;

/**
 *
 * @author sychev
 */
public class Door {
    
    private boolean open;
    private boolean bingo;
    
    public Door() {
        open = false;
        bingo = false;
    }
    
    public boolean isBingo(){
        return bingo;
    }
    
    public void refresh() {
        open = false;
        bingo = false;
    }
    
    public void setBingo(boolean s) {
        bingo = s;
    }

    public boolean isOpen(){
        return open;
    }
    
    public void setOpen(boolean s) {
        open = s;
    }
    
}
