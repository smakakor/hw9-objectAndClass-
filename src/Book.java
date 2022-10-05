import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear){
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }


     public String getName(){
         return this.name;
     }

    public Author getAuthor(){
        return this.author;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Книга: " + this.name + " Автор: " + this.author + " Год: " + this.publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }
}
