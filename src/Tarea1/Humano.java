package Tarea1;
/*
@author: Rodrigo Fuentes
@description: Humano is an abstract class that implements attacker and attackable. Unlike the rest of
the attackers, Humans have names.
 */

public abstract class Humano implements Attacker {
    protected double hitPoints;
    protected double attackPoints;
    protected double maxHitPoints;

    protected String name;
    protected Boolean alive = true;

    public Humano(double hp, double ap, String name) {
        this.hitPoints = hp;
        this.maxHitPoints = this.hitPoints;
        this.attackPoints = ap;
        this.name = name;
    }

    public double getHP(){
        return this.hitPoints;
    }

    public double getAP(){
        return this.attackPoints;
    }

    public String getName(){
        return this.name;
    }

    public double getMaxHP(){
        return this.maxHitPoints;
    }

    public Boolean isAlive(){
        return this.alive;
    }

    public void status() {
        System.out.println("Name: " + this.name);
        System.out.println("Class: Human");
        System.out.println("HP: " + this.hitPoints);
        System.out.println("AP: " + this.attackPoints + "\n");
    }

}