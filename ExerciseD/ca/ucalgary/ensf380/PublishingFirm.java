package ExerciseD.ca.ucalgary.ensf380;

public class PublishingFirm {

    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Cherles Dickens", "344 First Street ", 55);
        Author author2 = new Author("J.K. Rowling", "323 Second Street ", 43);
        Author author3 = new Author("Marie Lu", "213 Third Street", 19);

        // Create publishers
        Publisher publisher1 = new Publisher("PickWick Papers", "56 Fourth Street");
        Publisher publisher2 = new Publisher("Bloomsbury", "878 Fifth Street");
        Publisher publisher3 = new Publisher("Penguin Random House", "123 Sixth Street");

        // Create books
        Book book1 = new Classic("Great Expectations", author1, publisher1, new Hardcover());
        Book book2 = new Novel("Harry Potter and the Philosopher's Stone", author2, publisher2, new Paperback());
        Book book3 = new Fiction("The Legend", author3, publisher3, new Hardcover());
        Book book4 = new Nonfiction("Oliver Twist", author1, publisher3, new Paperback());

        // Create series
        Series harryPotterSeries = new Series("Harry Potter");
        harryPotterSeries.addBook(book2);

        // Create anthologies
        Anthology detectiveStories = new Anthology("Detective Stories");
        detectiveStories.addStory(new Story("The Adventure of the Speckled Band", author3));
        detectiveStories.addStory(new Story("The Murders in the Rue Morgue", new Author("Edgar Allan Poe")));

        // Create categories
        Category fictionCategory = new Category("Fiction");
        Category classicCategory = new Category("Classic");
        Category nonfictionCategory = new Category("Nonfiction");

        // Assign books to categories
        fictionCategory.addBook(book2);
        fictionCategory.addBook(book3);
        classicCategory.addBook(book1);
        nonfictionCategory.addBook(book4);

        // Print book details
        System.out.println("Book Details:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        // Print series details
        System.out.println("\nSeries Details:");
        System.out.println(harryPotterSeries);

        // Print anthology details
        System.out.println("\nAnthology Details:");
        System.out.println(detectiveStories);

        // Print category details
        System.out.println("\nCategory Details:");
        System.out.println(fictionCategory);
        System.out.println(classicCategory);
        System.out.println(nonfictionCategory);
    }
}

