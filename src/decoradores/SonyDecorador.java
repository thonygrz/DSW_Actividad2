package decoradores;

import interfaces.ICamara;

public class SonyDecorador extends CamaraDecorador {

    public SonyDecorador(ICamara camaraDecorada) {
        super(camaraDecorada);
    }

    public void capturarImagen() {
        ajustar();
        camaraDecorada.capturarImagen();
    }

    public void ajustar() {
        System.out.println("***AJUSTES CAMARA SONY***");
        System.out.println("Ajustando saturación");
        System.out.println("Ajustando contraste");
        System.out.println("Ajustando brillo");
    }

}