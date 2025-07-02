package model;

import interfaces.SUVInterface;

public class SUVGrande implements SUVInterface {
    @Override
    public void exibirInfoSUV() {
        System.out.println("SUV Grande - Potente e confortável para toda a família.");
    }
}
