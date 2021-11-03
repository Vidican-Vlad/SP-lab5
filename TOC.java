public class TOC extends Element {
    String toc;
    public TOC(String toc)
    {
        this.toc=toc;
    }
    public @Override void print()
    {
        System.out.println("  table of conents:"+this.toc);
    }
}
