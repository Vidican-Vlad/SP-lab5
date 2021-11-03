import java.io.File;
import java.awt.image.*;
import javax.imageio.*;
public interface Picture {
    public String url();
    public int dim();
    public BufferedImage content();
}
