import java.io.File;
import java.awt.image.*;
import javax.imageio.*;

public class JPGImageLoader implements ImageLoader {

    @Override
    public BufferedImage load(String url) {
        // TODO Auto-generated method stub
        try {
            BufferedImage pic = ImageIO.read(new File(url));
            return pic;
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
            return null;
        }
    }
    
}
