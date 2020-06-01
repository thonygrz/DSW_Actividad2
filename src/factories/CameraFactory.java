package factories;

import interfaces.ICamera;
import classes.OldCamera;
import decorators.SonyDecorator;
import decorators.CannonDecorator;

public class CameraFactory {

    public enum Producer {
        SONY,
        CANNON
    }
    
    public ICamera getCamera(){
        ICamera camera = new OldCamera();
        return camera;
    }

    public ICamera getCamera(Producer tip){
        ICamera camera = new OldCamera();
        switch (tip) {
            case SONY:
                camera = new SonyDecorator(camera);
                break;
            case CANNON:
                camera = new CannonDecorator(camera);
        }
        return camera;
    }

}