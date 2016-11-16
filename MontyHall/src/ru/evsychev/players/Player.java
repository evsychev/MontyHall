/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.evsychev.players;

import ru.evsychev.door.Door;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sychev
 */
public class Player {
    
    int lastChoice;
    
    public Player() {
        lastChoice = -1;
    }
    
    public void doChoice(ArrayList<Door> d) {
        
        int openNewDoor;
        
        Random r = new Random();
        while (true) {
            openNewDoor = r.nextInt(d.size());
            if (openNewDoor!=lastChoice && !d.get(openNewDoor).isOpen()) {
                if (lastChoice>-1)
                    d.get(lastChoice).setOpen(false);
                d.get(openNewDoor).setOpen(true);
                lastChoice = openNewDoor;
                break;
            }
        }
        
    }
    
    public int getLastChoice() {
        return lastChoice;
    }
    
}
