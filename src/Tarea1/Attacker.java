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
    double getHP();
    double getAP();
    Boolean isAlive();
    double getMaxHP();
}