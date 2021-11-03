import java.util.ArrayList;

public class Section extends Element {
    String title;
    ArrayList<Element> content = new ArrayList<>();

    public Section(String title)
    {
        this.title=title;
    }


    public @Override
    Element get(int index) {
        // TODO Auto-generated method stub
        return content.get(index);
    };
    public @Override void add(Element e)
    {
        this.content.add(e);

    }
    public @Override void remove(Element e)
    {
        this.content.remove(e);
    }
    public @Override void print()
    {
        System.out.println(" Section: "+this.title);
        for(Element e : this.content)
        {
            e.print();
        }
    }
    
}
