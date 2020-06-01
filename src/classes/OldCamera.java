package classes;

import interfaces.ICamera;

public class OldCamera implements ICamera {
    public void captureImage() {
        System.out.println("***************************");
        System.out.println("** An image was captured **");
        System.out.println("***************************\n\n");
    }
}