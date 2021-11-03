import java.io.File;
import java.awt.image.*;
import javax.imageio.*;
public class ImageLoaderFactory
{  
    BufferedImage create(String url)
    {
        switch (getExtensionFromUrl(url)){
            case "jpg":
               return new JPGImageLoader().load(url);
            case "bmp":
                return new BMPImageLoader().load(url);
            default:
            return null;
        }
    }

    String getExtensionFromUrl(String url)
    {
        return url.substring(url.lastIndexOf('.'));
    }
}