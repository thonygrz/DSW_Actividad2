package classes;

import interfaces.ICamera;

public class Photographer {

    private ICamera camera;

    public Photographer(ICamera cam) {
        this.camera = cam;
    };

    public void takePhoto() {
        this.camera.captureImage();
    }
}