package application;

import entities.Creeper;
import entities.Player;
import entities.Skeleton;
import interfaces.Dano;

public class Minecraft {

    public static void main(String[] args) {

    	// criando novo Player chamado Steve 
        Player steve = new Player("Steve");

        // atribuindo apenas a interface Dano para creeper e skeleton
        Dano creeper = new Creeper();
        Dano skeleton = new Skeleton();

        // player Steve invocando métodos de atacar e curar
        steve.atacar();
        steve.curar();

        // creeper e skeleton invocando apenas o método atacar
        creeper.atacar();
        skeleton.atacar();
    }
}