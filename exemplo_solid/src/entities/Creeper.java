package entities;

import interfaces.Dano;

public class Creeper implements Dano {

    @Override
    public void atacar() {
        System.out.println("Creeper explodiu!");
    }
}