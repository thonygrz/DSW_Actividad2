package decorators;

import interfaces.ICamera;

public class SonyDecorator extends CameraDecorator {

    public SonyDecorator(ICamera decoratedCamera) {
        super(decoratedCamera);
    }

    public void captureImage() {
        adjust();
        decoratedCamera.captureImage();
    }

    public void adjust() {
        System.out.println("***SONY CAMERA SETTINGS***");
        System.out.println("Adjusting saturation");
        System.out.println("Adjusting contrast");
        System.out.println("Adjusting brightness");
    }

}