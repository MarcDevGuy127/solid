package entities;

import interfaces.Dano;

public class Skeleton implements Dano {

    @Override
    public void atacar() {
        System.out.println("Skeleton atirou flecha!");
    }
}