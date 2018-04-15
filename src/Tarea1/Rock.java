package Tarea1;
/*
@author Rodrigo Fuentes
@description: Rock is one of the entities that is attackable but not attacker. Because of this, it
implements the attackedBy____(attacker) methods, but not attack(attackable). It can report it's, but
it's not really interesting.
 */

public class Rock implements Attackable {

    public void status() {
        System.out.println("Class: Rock");
        System.out.println("Just a rock. \n");
    }

    public void attackedByKnight(Knight attacker) {
        attacker.hitPoints -= attacker.attackPoints;
    }

    public void attackedByFireMage(FireMage attacker) {
        attacker.hitPoints -= attacker.attackPoints;
    }

    public void attackedByPriest(Priest attacker) {
        attacker.hitPoints -= attacker.attackPoints;
    }

    public void attackedByGoblin(Goblin attacker) {
        System.out.println("Nothing happens");
    }

    public void attackedByUndead(Undead attacker) {
        System.out.println("Nothing happens");
    }

    public void attackedByIceGolem(IceGolem attacker) {
        System.out.println("Nothing happens");
    }

}