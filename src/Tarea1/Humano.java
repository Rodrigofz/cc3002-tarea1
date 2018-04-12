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
        /*
        @description Constructor of class
        @param double hp, double ap, String name
         */
        this.hitPoints = hp;
        this.maxHitPoints = this.hitPoints;
        this.attackPoints = ap;
        this.name = name;
    }

    public double getHP(){
        /*
        @description returns hitPoints
        @return double hitPoints
         */
        return this.hitPoints;
    }

    public double getAP(){
        /*
        @description returns attackPoints
        @return double attackPoints
         */
        return this.attackPoints;
    }

    public String getName(){
        /*
        @description returns name
        @return String name
         */
        return this.name;
    }

    public double getMaxHP(){
        /*
        @description returns maxHitPoints
        @return double masHitPoints
         */
        return this.maxHitPoints;
    }

    public Boolean isAlive(){
        /*
        @description returns true if object is alive, false if it isn't
        @return Boolean alive
         */
        return this.alive;
    }

    public void status() {
        /*
        @description: Prints to the console the status of the object. It includes the name, class,
        HP and AP
         */
        System.out.println("Name: " + this.name);
        System.out.println("Class: Human");
        System.out.println("HP: " + this.hitPoints);
        System.out.println("AP: " + this.attackPoints + "\n");
    }

}