public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Брюс", "Эккель");
        Author author2 = new Author("Кети", "Сьерра");

        Book book1 = new Book("Философия Java", author1, 2020);
        Book book2 = new Book("Изучаем Java", author2, 2021);

        System.out.println(book1);
        System.out.println("\n" + book2);
        book1.setPublicationYear(2015);
        System.out.println("\n" + book1);
    }
}