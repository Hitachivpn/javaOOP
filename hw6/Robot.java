package ru.gb.lesson5.game;

public interface Robot {
    public void changeDirection(Direction direction);
    public void move();
    public long getId();
    public Point getPoint();
    
}
