package decoradores;

import interfaces.ICamara;

public class CannonDecorador extends CamaraDecorador {

    public CannonDecorador(ICamara camaraDecorada) {
        super(camaraDecorada);
    }

    public void capturarImagen() {
        ajustar();
        camaraDecorada.capturarImagen();
    }

    public void ajustar() {
        System.out.println("***AJUSTES CAMARA CANNON***");
        System.out.println("Ajustando saturación");
        System.out.println("Ajustando contraste");
        System.out.println("Ajustando brillo");
    }

}