package Tarea1;
/*
@author Rodrigo Fuentes
@description The interface Attackable encapsulates all the classes (entities) that can receive an attack.
It's important to know that not because an entity is attackable, it receives damage.
 */
public interface Attackable {


    void attackedByKnight(Knight attacker);

    void attackedByFireMage(FireMage attacker);

    void attackedByPriest(Priest attacker);

    void attackedByGoblin(Goblin attacker);

    void attackedByUndead(Undead attacker);

    void attackedByIceGolem(IceGolem attacker);

    void status();
}