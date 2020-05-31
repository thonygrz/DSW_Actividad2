package decoradores;

import interfaces.ICamara;

public abstract class CamaraDecorador implements ICamara {

    protected ICamara camaraDecorada;

    public CamaraDecorador(ICamara camaraDecorada) {
        this.camaraDecorada = camaraDecorada;
    }

    public void capturarImagen() {
        this.camaraDecorada.capturarImagen();
    }

}