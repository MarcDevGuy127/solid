package entities;

import interfaces.Cura;
import interfaces.Dano;

// Implementando interfaces de Dano e Cura, também seria possível implementar: Poção, Dash, etc.
public class Player implements Dano, Cura {

    private String nome;

    // Atribuindo nome para o objeto Player
    public Player(String nome) {
        this.nome = nome;
    }

    
	// Sobrescrevendo método atacar da interface Dano
    @Override
    public void atacar() {
        System.out.println(nome + " atacou com espada!");
    }

	// Sobrescrevendo método curar da interface Cura
    @Override
    public void curar() {
        System.out.println(nome + " comeu maçã dourada!");
    }
}