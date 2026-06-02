package entities;

import interfaces.Dano;

//implementando interface Dano
public class Skeleton implements Dano {

	// Sobrescrevendo método atacar da interface Dano
    @Override
    public void atacar() {
        System.out.println("Skeleton atirou flecha!");
    }
}