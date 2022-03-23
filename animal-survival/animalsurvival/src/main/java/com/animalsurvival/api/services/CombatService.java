package com.animalsurvival.api.services;

import com.animalsurvival.api.animals.*;
import com.animalsurvival.api.monsters.*;
import com.animalsurvival.api.utility.*;


import java.util.Random;

public class CombatService {

    private static Random rand = new Random();

    // TODO: IMPLEMENT DEX AND AGL STATS HERE
    
    /**
     * Attacks a given Animal object with given damage
     * 
     * @param animal Animal object to attack
     * @param damage Damage to inflict
     */
    public static void attack(Animal animal, int damage) {
        int hit_chance = rand.nextInt(101);
        int crit = rand.nextInt(101);
        
        if (hit_chance > 40) {
            if (crit > 95) {
                damage*=2;
                System.out.println("Critical strike!");
            }
            animal.changeHealth(damage*-1);
            System.out.println("The attack connects! " + damage + " damage was taken.");
        }
        else {
            System.out.println("The attack missed! 0 damage was taken.");
        }
    }

    /**
     * Attacks a given Monster object with given damage
     * 
     * @param monster Monster object to attack
     * @param damage Damage to inflict
     */
    public static void attack(Monster monster, int damage) {
        int hit_chance = rand.nextInt(101);
        int crit = rand.nextInt(101);

        if (hit_chance > 10) {
            if (crit > 95) {
                damage*=2;
                System.out.println("Critical strike!");
            }
            monster.changeHealth(damage*-1);
            System.out.println("The attack connects! " + damage + " damage was given.");
        }
        else {
            System.out.println("The attack missed! 0 damage was given.");
        }
    }
}
