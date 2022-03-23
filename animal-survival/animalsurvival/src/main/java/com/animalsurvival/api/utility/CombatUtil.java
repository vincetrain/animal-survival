package com.animalsurvival.api.utility;

import com.animalsurvival.api.animals.*;
import com.animalsurvival.api.monsters.*;

import java.util.Random;

public class CombatUtil {

    private static Random rand = new Random();

    final static String[] monster_types = {
        "Lizard",
        "Scorpion",
        "Hyena"
    };

    /**
     * Generates a random Monster and returns it
     * 
     * @param days day count
     * @return new monster object
     */
    public static Monster generateMonster(int days) {
        Monster newMonster = null;
        int rng = rand.nextInt(monster_types.length);

        // We use switch here because monster count will get bigger overtime (via updates), so this is just for sustainability of code optimization.
        switch (monster_types[rng]) {
            case "Lizard":
                newMonster = new Lizard(days);
                break;
            case "Scorpion":
                newMonster = new Scorpion(days);
                break;
            case "Hyena":
                newMonster = new Hyena(days);
                break;
            default:
                System.out.println("Error: Monster type could not be initialized");
        }

        return newMonster;
    }

    /**
     * Returns base damage of a randomly selected attack from monster.
     * 
     * @param monster Monster object
     * @return integer containing damage
     */
    public static int randomAttack(Monster monster) {
        Random rand = new Random();

        int damage = 0;
        int attack = rand.nextInt(4);

        switch (attack) {
            case 0:
                damage = monster.attack1();
                break;
            case 1:
                damage = monster.attack2();
                break;
            case 2:
                damage = monster.attack3();
                break;
            case 3:
                damage = monster.attack4();
                break;
        }

        return damage;
    }
}
