import interfaces.ICamara;
import fabricas.CamaraFabrica;
import clases.Fotografo;

public class App {
    public static void main(String[] args) throws Exception {

        CamaraFabrica fab = new CamaraFabrica();
        ICamara camara = fab.getCamara();
        Fotografo fotografo = new Fotografo(camara);
        fotografo.tomarFoto();

    }
}
