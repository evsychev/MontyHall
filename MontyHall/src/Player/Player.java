/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import Door.Door;
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
        
        int vPplNew = -1;
        
        Random randNumber = new Random();
        while (true) {
            vPplNew = randNumber.nextInt(d.size());
            if (vPplNew!=lastChoice && !d.get(vPplNew).isOpen()) {
                if (lastChoice>-1)
                    d.get(lastChoice).setOpen(false);
                d.get(vPplNew).setOpen(true);
                lastChoice = vPplNew;
                break;
            }
        }
        
    }
    
    public int getLastChoice() {
        return lastChoice;
    }
    
}
