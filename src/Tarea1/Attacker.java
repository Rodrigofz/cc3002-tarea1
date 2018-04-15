package Tarea1;
/*
@author Rodrigo Fuentes
@description The interface attacker encapsulates all the classes (entities) that can perform an attack.
It extends attackable because all the attacker entities are attackable. The damage that will be dealt
depends on the interaction of both classes. It implements the methods getHP(), getAP(), isAlive() and
getMaxHP() that are used to know the values of different variables of the classes.
 */
public interface Attacker extends Attackable {
    void attack(Attackable attackable);
    /*
    @description Method used to attack other Attackable. Because we are using double dispatch, this method triggers
    the call of another method named attackedByXXXXX where XXXXX is the type of the attacker.

    -When one attacker attacks another, the damage dealt depends on the types of both participants of the fight.
    -When humans attack a rock, they lose some hit points.
    -When humans or goblins attack a fruit tree, they recover some hit points.

    @param Attackable attackable
    */

    double getHP();
    /*
    @description returns hitPoints
    @return double hitPoints
    */

    double getAP();
    /*
    @description returns attackPoints
    @return double attackPoints
    */

    Boolean isAlive();
    /*
    @description returns true if object is alive, false if it isn't
    @return Boolean alive
    */

    double getMaxHP();
    /*
    @description returns maxHitPoints
    @return double masHitPoints
    */
}