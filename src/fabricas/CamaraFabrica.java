package fabricas;

import interfaces.ICamara;
import clases.CamaraAntigua;
import decoradores.SonyDecorador;
import decoradores.CannonDecorador;

public class CamaraFabrica {

    public enum Fabricante {
        SONY,
        CANNON
    }
    
    public ICamara getCamara(){
        ICamara camara = new CamaraAntigua();
        return camara;
    }

    public ICamara getCamara(Fabricante tip){
        ICamara camara = new CamaraAntigua();
        if (tip == Fabricante.SONY)
            camara = new SonyDecorador(camara);
        else if (tip == Fabricante.CANNON)
            camara = new CannonDecorador(camara);
        return camara;
    }

}