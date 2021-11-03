

public class Table extends Element {
    String title;

    public Table(String title)
    {
        this.title = title;
    }
    public @Override void print()
    {
        System.out.println("    table: "+this.title);
    }
}
