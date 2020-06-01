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
        if (tip == Producer.SONY)
            camera = new SonyDecorator(camera);
        else if (tip == Producer.CANNON)
            camera = new CannonDecorator(camera);
        return camera;
    }

}