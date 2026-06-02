package entities;

import interfaces.Cura;
import interfaces.Dano;

public class Player implements Dano, Cura {

    private String nome;

    public Player(String nome) {
        this.nome = nome;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " atacou com espada!");
    }

    @Override
    public void curar() {
        System.out.println(nome + " comeu maçã dourada!");
    }
}