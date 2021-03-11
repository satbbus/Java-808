public interface Readable {
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable{
    public void readBook(){}
    //public void setBookMark(){}
}

abstract class EBook extends Book{
    public void readBook(){}
    //public void setBookMark(){}
}

abstract class BookNow{
    public abstract void print();
}