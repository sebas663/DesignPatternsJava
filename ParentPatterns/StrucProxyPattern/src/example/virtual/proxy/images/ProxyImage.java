package example.virtual.proxy.images;

/**
 * Created by luisburgos on 21/09/15.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String imageFileName;

    public ProxyImage(String fileName){
        this.imageFileName = fileName;
    }

    @Override
 // create the Image Object only when the image is required to be shown and is null.
    public void display() {
        if(realImage == null){
            realImage = new RealImage(imageFileName);
        }
        realImage.display();
    }

}
