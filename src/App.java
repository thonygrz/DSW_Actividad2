import clases.CamaraAntigua;
import decoradores.SonyDecorador;
import interfaces.ICamara;

public class App {
    public static void main(String[] args) throws Exception {

        ICamara camara = new CamaraAntigua();
        ICamara camaraSony = new SonyDecorador(camara);

        // captura con cámara antigua
        camara.capturarImagen();
        // captura con cámara Sony
        camaraSony.capturarImagen();

    }
}
