package Tarea1;
/*
@author Rodrigo Fuentes
@description: Rock is one of the entities that is attackable but not attacker. Because of this, it
implements the attackedBy____(attacker) methods, but not attack(attackable). It can report it's, but
it's not really interesting.
 */

public class Rock implements Attackable {

    public void status() {
        /*
        @description: Prints to the console the status of the object
         */
        System.out.println("Class: Rock");
        System.out.println("Just a rock. \n");
    }

    public void attackedByKnight(Knight attacker) {
        /*
        @description: Called when the class is attacked by a knight. In this case, the knight
        losses life.
        @param Knight
         */
        attacker.hitPoints -= attacker.attackPoints;
    }

    public void attackedByFireMage(FireMage attacker) {
        /*
        @description: Called when the class is attacked by a fireMage. In this case, the fireMage
        losses life.
        @param FireMage
         */
        attacker.hitPoints -= attacker.attackPoints;
    }

    public void attackedByPriest(Priest attacker) {
        /*
        @description: Called when the class is attacked by a priest. In this case, the priest
        losses life.
        @param Priest
         */
        attacker.hitPoints -= attacker.attackPoints;
    }

    public void attackedByGoblin(Goblin attacker) {
        /*
        @description: Called when the class is attacked by a goblin. In this case, nothing happens.
        @param Goblin
         */
        System.out.println("Nothing happens");
    }

    public void attackedByUndead(Undead attacker) {
        /*
        @description: Called when the class is attacked by an undead. In this case, nothing happens.
        @param Undead
         */
        System.out.println("Nothing happens");
    }

    public void attackedByIceGolem(IceGolem attacker) {
        /*
        @description: Called when the class is attacked by an iceGolem. In this case, nothing happens.
        @param IceGolem
         */
        System.out.println("Nothing happens");
    }

}