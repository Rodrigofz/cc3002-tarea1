package Tarea1;
/*
@author Rodrigo Fuentes
@description The interface Attackable encapsulates all the classes (entities) that can receive an attack.
It's important to know that not because an entity is attackable, it receives damage.
 */
public interface Attackable {


    void attackedByKnight(Knight attacker);
    /*
    @description Method used when attacked by a knight
    @param Knight attacker
    */

    void attackedByFireMage(FireMage attacker);
    /*
    @description Method used when attacked by a fireMage
    @param FireMage attacker
    */

    void attackedByPriest(Priest attacker);
    /*
    @description Method used when attacked by a priest
    @param Priest attacker
    */

    void attackedByGoblin(Goblin attacker);
    /*
    @description Method used when attacked by a goblin
    @param Goblin attacker
    */

    void attackedByUndead(Undead attacker);
    /*
    @description Method used when attacked by an undead
    @param Undead attacker
    */

    void attackedByIceGolem(IceGolem attacker);
    /*
    @description Method used when attacked by an ice Golem
    @param IceGolem attacker
    */

    void status();
    /*
    @description: Prints to the console the status of the object. Depending on the type, ir can
    include HP, AP or name.
    */
}