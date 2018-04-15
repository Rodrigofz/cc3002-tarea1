package Tarea1;
/*
@author: Rodrigo Fuentes
@description: IceGolem is one of the attackers that isn't human. It has the method attack(Attackable) and
the methods attackedBy____(attacker) for all the attackers. It also can report it´s status and return it's
instance variables.
 */

public class IceGolem implements Attacker {
    protected double hitPoints;
    protected double maxHitPoints;
    protected double attackPoints;

    protected Boolean alive = true;

    public IceGolem() {
        this.hitPoints = 90;
        this.maxHitPoints = this.hitPoints;
        this.attackPoints = 2;
    }

    public void attack(Attackable attackable) {
        if (this.alive) attackable.attackedByIceGolem(this);
    }

    public void status() {
        System.out.println("Class: IceGolem");
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
        this.hitPoints -= 0.5 * attacker.attackPoints;
    }

    public void attackedByFireMage(FireMage attacker) {
        this.hitPoints -= 5 * attacker.attackPoints;
    }

    public void attackedByPriest(Priest attacker) {
        System.out.println("IceGolem doesn't receive damage");
    }

    public void attackedByGoblin(Goblin attacker) {
        System.out.println("IceGolem doesn't receive damage");
    }

    public void attackedByUndead(Undead attacker) {
        System.out.println("IceGolem doesn't receive damage");
    }

    public void attackedByIceGolem(IceGolem attacker) {
        this.hitPoints -= 1 * attacker.attackPoints;
    }

}


