package model;

import interfaces.SUVInterface;

public class SUVCompacto implements SUVInterface {
    @Override
    public void exibirInfoSUV() {
        System.out.println("SUV Compacto - Ideal para cidade e aventuras leves.");
    }
}
