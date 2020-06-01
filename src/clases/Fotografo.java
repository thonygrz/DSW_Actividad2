package clases;

import interfaces.ICamara;

public class Fotografo {

    private ICamara camara;

    public Fotografo(ICamara cam) {
        this.camara = cam;
    };

    public void tomarFoto() {
        this.camara.capturarImagen();
    }
}