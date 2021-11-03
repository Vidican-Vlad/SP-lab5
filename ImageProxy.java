import java.io.File;
import java.awt.image.*;
import javax.imageio.*;
public class ImageProxy extends Element implements Picture {
    String url;
    int dim;
    Image realImg;

    public ImageProxy(String url)
    {
        this.url = url;
    }
    
    public Image  loadImage(){
        if(realImg == null){
            realImg = new Image(url);
        }
        return realImg;
    }
    @Override
    public  String url(){
        // TODO Auto-generated method stub
        return this.url;
    }
    @Override
    public int dim() {
        // TODO Auto-generated method stub
        return this.dim;
    }
    @Override
    public BufferedImage content() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void print()
    {
        System.out.println("url: "+this.url);
    }

}
