package entities;

import interfaces.Dano;

// implementando interface Dano
public class Creeper implements Dano {

	// Sobrescrevendo método atacar da interface Dano
    @Override
    public void atacar() {
        System.out.println("Creeper explodiu!");
    }
}