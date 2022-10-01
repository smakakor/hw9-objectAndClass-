public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Брюс", "Эккель");
        Author author2 = new Author("Кети", "Сьерра");

        Book book1 = new Book("Философия Java", author1, 2020);
        Book book2 = new Book("Изучаем Java", author2, 2021);

        System.out.println("Название книги: " + book1.getName() + "\nИмя и Фамилия автора: " +
                book1.getAuthor().getFullName() + "\nГод публикации: " + book1.getPublicationYear() + " год");
        System.out.println("\n" + book2.infoBook());
        book1.setPublicationYear(2015);
        System.out.println("\n" + book1.infoBook());
    }
}