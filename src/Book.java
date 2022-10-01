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

    public String infoBook(){
        return "Название книги: " + this.name + "\nИмя и Фамилия автора: " + author.getFullName() + "\nГод публикации: " + this.publicationYear + " год";

    }

}
