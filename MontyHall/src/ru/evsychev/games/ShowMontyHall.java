/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.evsychev.games;

import ru.evsychev.door.Door;
import ru.evsychev.players.Player;
import ru.evsychev.monty.Monty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author sychev
 */
public class ShowMontyHall implements Games {
    
    private ArrayList<Door> d = new ArrayList();
    
    private int Result = 0;
    
    private final Player p1 = new Player();
    private final Monty r1 = new Monty();
    
    public ShowMontyHall(){
        for (int i=0; i < Games.DOORS_COUNT_DEFAULT; i++)
            d.add(i, new Door());
    }
    
    public ShowMontyHall(int l) {
        for (int i=0; i<l; i++)
            d.add(i, new Door());
    }
    
    public int getResult() {
        return Result;
    }
    
    public boolean isAllOpen() {
        int a = 0;
        Iterator<Door> doorIterator = d.iterator();
        while (doorIterator.hasNext()) {
            if (doorIterator.next().isOpen())
                a++;
        }
        return (a>=d.size()-1) ? true : false;
    }
    
    @Override
    public void Start() {
        
        Random rnd = new Random();
        
        d.get(rnd.nextInt(d.size())).setBingo(true);
        //p1.doChoice(d);
        while (true) {
            
            // Player opens a door where he think has a car
            p1.doChoice(d);
            
            // When all doors are opened, we show, player won or not?!
            if (isAllOpen()){
                if (d.get(p1.getLastChoice()).isBingo()){
                    Result++;
                }
                else {
                    Result--;
                }
                break;
            }
            
            // Monty opens a door where no car
            r1.openNullDoor(d);
        
        }
    
    }

}