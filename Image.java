import java.util.concurrent.TimeUnit;
import java.awt.image.*;
public class Image extends Element implements Picture{
    String url;
    int dim;
    BufferedImage content;
	static ImageLoaderFactory factory= new ImageLoaderFactory();
	

    public Image(String imageName)
    {
    	this.url = imageName;
    	try {
    	TimeUnit.SECONDS.sleep(5);
    	} catch (InterruptedException e) {
    	e.printStackTrace();
    	}
    }
    public void print()
    {
        System.out.println("Image: "+url);
    }
	@Override
	public String url() {
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
		return Image.factory.create(this.url);
	}
}


