package decorators;

import interfaces.ICamera;

public abstract class CameraDecorator implements ICamera {

    protected ICamera decoratedCamera;

    public CameraDecorator(ICamera decoratedCamera) {
        this.decoratedCamera = decoratedCamera;
    }

    public void captureImage() {
        this.decoratedCamera.captureImage();
    }

}