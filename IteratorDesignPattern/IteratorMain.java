import java.util.*;

class IteratorMain {

  public void main() {
    Book b1 = new Book(1, "Minute practises");
    Book b2 = new Book(2, "Rich dad poor dad");
    List<Book> li = new ArrayList<>();
    li.add(b1);
    li.add(b2);
    Library lib = new Library(li);
    Iterator it = lib.createIterator();
    while (it.hasNext()) {
      Book b = (Book) it.next();
      System.out.println(b.name);
    }
  }
}