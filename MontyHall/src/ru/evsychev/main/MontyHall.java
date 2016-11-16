/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.evsychev.main;

import ru.evsychev.games.Games;
import ru.evsychev.games.ShowMontyHall;

/**
 *
 * @author sychev
 */
public class MontyHall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        
        Games showMontyHall;
        
        // 1000 Games
        for (int i=0; i<1000; i++){
            
            showMontyHall = new ShowMontyHall(10);
            showMontyHall.Start();
            
            if (((ShowMontyHall)showMontyHall).getResult() == 1)
                x++;
            else
                y++;
         
        }
        
        System.out.print("Result Player = ");
        System.out.println(x);
        
        System.out.print("Result Monty = ");
        System.out.println(y);
        
    }
    
}
