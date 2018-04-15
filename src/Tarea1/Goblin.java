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
        this.hitPoints = 40;
        this.attackPoints = 4;
        this.maxHitPoints = this.hitPoints;
    }

    public void status(){
        System.out.println("Class: Goblin");
        System.out.println("HP: " + this.hitPoints);
        System.out.println("AP: " + this.attackPoints + "\n");
    }

    public double getHP(){
        return this.hitPoints;
    }

    public double getAP(){
        return this.attackPoints;
    }

    public double getMaxHP(){
        return this.maxHitPoints;
    }

    public Boolean isAlive(){
        return this.alive;
    }

    public void attack(Attackable attackable) {
        if (this.alive) attackable.attackedByGoblin(this);
    }

    public void attackedByKnight(Knight attacker) {
        this.hitPoints -= 1.25*attacker.attackPoints;
    }

    public void attackedByFireMage(FireMage attacker) {
        this.hitPoints -= 2 * attacker.attackPoints;
    }

    public void attackedByPriest(Priest attacker) {
        System.out.println("Goblin doesn't receive damage");
    }

    public void attackedByGoblin(Goblin attacker) {
        System.out.println("Goblins don't attack each other");
    }

    public void attackedByUndead(Undead attacker) {
        this.hitPoints -= attacker.attackPoints;
    }

    public void attackedByIceGolem(IceGolem attacker) {
        this.hitPoints -= 2 * attacker.attackPoints;
    }
}
