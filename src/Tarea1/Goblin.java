package Tarea1;
/*
@author: Rodrigo Fuentes
@description: Goblin is one of the attackers that isn't human. It has the method attack(Attackable) and
the methods attackedBy____(attacker) for all the attackers. It also can report it´s status and return it's
instance variables.
 */

public class Goblin implements Attacker{
    protected double hitPoints;
    protected double attackPoints;
    protected double maxHitPoints;

    protected Boolean alive = true;

    public Goblin(){
        /*
        @description Constructor of the class.
         */
        this.hitPoints = 40;
        this.attackPoints = 4;
        this.maxHitPoints = this.hitPoints;
    }

    public void status(){
        /*
        @description: Prints to the console the status of the object. It includes the class,
        HP and AP
         */
        System.out.println("Class: Goblin");
        System.out.println("HP: " + this.hitPoints);
        System.out.println("AP: " + this.attackPoints + "\n");
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

    public void attack(Attackable attackable) {
        /*
        @description Method used to attack other Attackable
        @param Attackable attackable
         */
        if (this.alive) attackable.attackedByGoblin(this);
    }

    public void attackedByKnight(Knight attacker) {
        /*
        @description Method used when attacked by a knight
        @param Knight attacker
         */
        this.hitPoints -= 1.25*attacker.attackPoints;
    }

    public void attackedByFireMage(FireMage attacker) {
        /*
        @description Method used when attacked by a fireMage
        @param FireMage attacker
         */
        this.hitPoints -= 2 * attacker.attackPoints;
    }

    public void attackedByPriest(Priest attacker) {
        /*
        @description Method used when attacked by a priest
        @param Priest attacker
         */
        System.out.println("Goblin doesn't receive damage");
    }

    public void attackedByGoblin(Goblin attacker) {
        /*
        @description Method used when attacked by a goblin
        @param Goblin attacker
         */
        System.out.println("Goblins don't attack each other");
    }

    public void attackedByUndead(Undead attacker) {
        /*
        @description Method used when attacked by an undead
        @param Undead attacker
         */
        this.hitPoints -= attacker.attackPoints;
    }

    public void attackedByIceGolem(IceGolem attacker) {
        /*
        @description Method used when attacked by an ice Golem
        @param IceGolem attacker
         */
        this.hitPoints -= 2 * attacker.attackPoints;
    }
}
