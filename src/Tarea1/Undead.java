package Tarea1;
/*
@author: Rodrigo Fuentes
@description: Undead is one of the attackers that isn't human. It has the method attack(Attackable) and
the methods attackedBy____(attacker) for all the attackers. It also can report it´s status and return it's
instance variables.
 */
public class Undead implements Attacker {
    protected double hitPoints;
    protected double maxHitPoints;
    protected double attackPoints;

    protected Boolean alive = true;

    public Undead() {
        this.hitPoints = 30;
        this.maxHitPoints = this.hitPoints;
        this.attackPoints = 7;
    }

    public void attack(Attackable attackable) {
        if (this.alive) attackable.attackedByUndead(this);
    }

    public void status() {
        System.out.println("Class: Undead");
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

    public void attackedByKnight(Knight attacker) {
        this.hitPoints -= attacker.attackPoints;
    }

    public void attackedByFireMage(FireMage attacker) {
        this.hitPoints -= 0.5 * attacker.attackPoints;
    }

    public void attackedByPriest(Priest attacker) {
        this.hitPoints -= 5 * attacker.attackPoints;
    }

    public void attackedByGoblin(Goblin attacker) {
        System.out.println("Undead doesn't receive damage");
    }

    public void attackedByUndead(Undead attacker) {
        System.out.println("Undead doesn't receive damage");
    }

    public void attackedByIceGolem(IceGolem attacker) {
        this.hitPoints -= 2 * attacker.attackPoints;
    }
}