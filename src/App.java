import factories.CameraFactory;
import factories.CameraFactory.Producer;
import classes.Photographer;

public class App {
    public static void main(String[] args) throws Exception {

        CameraFactory cameraFactory = new CameraFactory();

        Photographer photographer = new Photographer(cameraFactory.getCamera());
        photographer.takePhoto();

        Photographer photographerSony = new Photographer(cameraFactory.getCamera(Producer.SONY));
        photographerSony.takePhoto();

        Photographer photographerCannon = new Photographer(cameraFactory.getCamera(Producer.CANNON));
        photographerCannon.takePhoto();

    }
}
