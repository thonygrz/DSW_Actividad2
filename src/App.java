import factories.CameraFactory;
import factories.CameraFactory.Producer;
import classes.Photographer;

public class App {
    public static void main(String[] args) throws Exception {

        CameraFactory cameraFactory = new CameraFactory();

        Photographer photographer = new Photographer(cameraFactory.getCamera());
        photographer.takePhoto();

        photographer.setCamera(cameraFactory.getCamera(Producer.SONY));
        photographer.takePhoto();

        photographer.setCamera(cameraFactory.getCamera(Producer.CANNON));
        photographer.takePhoto();

    }
}
