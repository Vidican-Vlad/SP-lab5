import java.util.ArrayList;

public class Book{
    ArrayList<Author> authors = new ArrayList<Author>();
    String title;
    ArrayList<Section> content = new ArrayList<Section>();

    public  Book(String title)
    {
        this.title=title;
    }
    public void addAuthor(Author author)
    {
        this.authors.add(author);
    }
    public ArrayList<Author> getAuthors()
    {
        return this.authors;
    }
    public void addContent(Section section)
    {
        this.content.add(section);
    }
    public void print()
    {
      System.out.println(this.title);
      System.out.print("written by:");
      for(Author a : authors)
      {
        a.print();
      }
      System.out.println();
      for(Element e : content)
      {
          e.print();
      }
    }
}