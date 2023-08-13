package SnakeAndLadder.models;

import javax.swing.text.Position;

public abstract class Ladder implements Position {
    public Ladder(int start,int end) throws InterruptedException {
        wait(start,end);
    }

}
