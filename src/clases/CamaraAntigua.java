package clases;

import interfaces.ICamara;

public class CamaraAntigua implements ICamara {
    public void capturarImagen() {
        System.out.println("***************************");
        System.out.println("** Se capturó una imagen **");
        System.out.println("***************************\n\n");
    }
}