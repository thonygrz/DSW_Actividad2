import factories.CameraFactory;
import factories.CameraFactory.Producer;
import classes.Photographer;

public class App {
    public static void main(String[] args) throws Exception {

        CameraFactory fab = new CameraFactory();

        Photographer photographer = new Photographer(fab.getCamera());
        photographer.takePhoto();

        Photographer photographerSony = new Photographer(fab.getCamera(Producer.SONY));
        photographerSony.takePhoto();

        Photographer photographerCannon = new Photographer(fab.getCamera(Producer.CANNON));
        photographerCannon.takePhoto();

    }
}
