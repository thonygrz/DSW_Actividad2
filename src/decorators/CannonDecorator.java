package decorators;

import interfaces.ICamera;

public class CannonDecorator extends CameraDecorator {

    public CannonDecorator(ICamera decoratedCamera) {
        super(decoratedCamera);
    }

    public void captureImage() {
        adjust();
        decoratedCamera.captureImage();
    }

    public void adjust() {
        System.out.println("***CANON CAMERA SETTINGS***");
        System.out.println("Adjusting saturation");
        System.out.println("Adjusting contrast");
        System.out.println("Adjusting brightness");
    }

}