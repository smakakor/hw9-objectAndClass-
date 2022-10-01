public class Author {
    private final String firstNameAuthor;
    private final String lastNameAuthor;
    public Author(String firstNameAuthor, String lastNameAuthor){
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor(){
        return this.firstNameAuthor;
    }

    public String getLastNameAuthor(){
        return this.lastNameAuthor;
    }


    public String getFullName() {
        return this.firstNameAuthor + " " + this.lastNameAuthor;
    }
}
