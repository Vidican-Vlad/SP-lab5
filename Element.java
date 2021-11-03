public abstract class Element {
    public void print(){
        
    };
   public void add(Element e)
    {
        throw new UnsupportedOperationException("leaf classes can't  add elements");
    }
    public void remove(Element e)
    {
        throw new UnsupportedOperationException("leaf classes can't remove elements");
    }
    public Element get(int index)
    {
        throw new UnsupportedOperationException("leaf classes can't get elements");
    }
    
}
