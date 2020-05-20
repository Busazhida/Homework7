package com.company;

public class Main {

    public static void main(String[] args) {
        HavingSuperAbility[] allHeroes = {new Magician(), new Medic(), new Warrior()};
        for (int i = 0; i <allHeroes.length ; i++) {
          allHeroes[i].ApplySuperAbility();
        }

    }
}
