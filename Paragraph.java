
public class Paragraph extends Element{
    String txt;
    AlignStrategy align;
    public Paragraph(String txt)
    {
        this.txt = txt;

    }
    public @Override void print()
    {
        if(this.align!=null)
            align.render(this);
        else
            System.out.println(this.txt);
    }
    public void setAlignStrategy(AlignStrategy align)
    {
        this.align=align;
    }
}