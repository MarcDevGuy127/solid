package application;

import entities.Creeper;
import entities.Player;
import entities.Skeleton;
import interfaces.Dano;

public class Minecraft {

    public static void main(String[] args) {

        Player steve = new Player("Steve");

        Dano creeper = new Creeper();
        Dano skeleton = new Skeleton();

        steve.atacar();
        steve.curar();

        creeper.atacar();
        skeleton.atacar();
    }
}