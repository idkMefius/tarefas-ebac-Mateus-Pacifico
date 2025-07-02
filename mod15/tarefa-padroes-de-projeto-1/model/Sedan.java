package model;

import interfaces.CarroDePasseioInterface;

public class Sedan implements CarroDePasseioInterface {
    @Override
    public void exibirInfoCarroDePasseio() {
        System.out.println("Carro de passeio Sedan - Elegante e Espaçoso.");
    }
}
