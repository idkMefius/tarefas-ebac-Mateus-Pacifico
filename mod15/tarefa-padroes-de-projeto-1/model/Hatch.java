package model;

import interfaces.CarroDePasseioInterface;

public class Hatch implements CarroDePasseioInterface {
    @Override
    public void exibirInfoCarroDePasseio() {
        System.out.println("Carro de Passeio Hatch - Compacto e Versátil.");
    }
}
