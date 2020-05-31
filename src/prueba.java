import interfaces.IPrueba;

public class prueba implements IPrueba {

    private final String model;

    public prueba(final String model) {
        this.model = model;
    }

    public void mensaje() {
        System.out.println("prueba!");
        System.out.println(model);
    }

    public void mensajito(String msg) {
        System.out.println(msg);
    }

}