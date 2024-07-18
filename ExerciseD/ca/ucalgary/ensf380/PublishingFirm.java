package ExerciseD.ca.ucalgary.ensf380;

public class PublishingFirm {

    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Author1", "344 First Street ", 55);
        Author author2 = new Author("Author2", "323 Second Street ", 43);
        Author author3 = new Author("Author3", "213 Third Street", 19);

        // Create publishers
        Publisher publisher1 = new Publisher("Publisher1", "56 Fourth Street");
        Publisher publisher2 = new Publisher("Publisher2", "878 Fifth Street");

        // Create books
        Classic book1 = new Classic();
        book1.setIsbn("12345");
        book1.setPublicationYear(1997);
        book1.setPages(200);
        book1.setOrigPubYear(1997);
        book1.setTheAuthor(author1);
        book1.setBookPublisher(new Publisher[] { publisher1, publisher2 });

        Novel book2 = new Novel();
        book2.setIsbn("23456");
        book2.setPublicationYear(1998);
        book2.setPages(201);
        book2.setTheAuthors(new Author[] { author2, author3 });
        
        Fiction book3 = new Fiction();
        book3.setIsbn("34567");
        book3.setPublicationYear(1999);
        book3.setPages(202);

        Nonfiction book4 = new Nonfiction();
        book4.setIsbn("45678");
        book4.setPublicationYear(2000);
        book4.setPages(203);
        book4.setDeweyClassification(new Category());

        // Create series
        Series series1 = new Series();
        series1.setSeriesName("Series1");


        //Create stories
        Story story1 = new Story();
        story1.setTheAuthor(new Author[] {author1});

        Story story2 = new Story();
        story2.setTheAuthor(new Author[] {author2});

        // Create anthologies
        Anthology anthology = new Anthology();
        anthology.setStory(new Story[] {story1, story2});


        // Print book details
        System.out.println("Classic Book Details:");
        System.out.println("Book 1 - " + "ISBN:" + book1.getIsbn() + " Publication Year:" + book1.getPublicationYear() + " Pages:" + book1.getPages() + " Original Publication Year:" + book1.getOrigPubYear() + " Author:" + book1.getTheAuthor() + " Publisher:" + book1.getBookPublisher());

        System.out.println("\nNovel Book Details:");
        System.out.println("Book 2 - " + "ISBN:" + book2.getIsbn() + " Publication Year:" + book2.getPublicationYear() + " Pages:" + book2.getPages() + " Authors:" + book2.getTheAuthors());

        System.out.println("\nFiction Book Details:");
        System.out.println("B0ok 3 - " + "ISBN:" + book3.getIsbn() + " Publication Year:" + book3.getPublicationYear() + " Pages:" + book3.getPages());

        System.out.println("\nNonfiction Book Details:");
        System.out.println("book4 - " + "ISBN:" + book4.getIsbn() + " Publication Year:" + book4.getPublicationYear() + " Pages:" + book4.getPages() + " Dewey Classification:" + book4.getDeweyClassification());

        // Print series details
        System.out.println("\nSeries Details:");
        System.out.println("series1 - " + "Series Name:" + series1.getSeriesName());

        // Print anthology details
        System.out.println("\nAnthology Details:");
        System.out.println("anthology - " + "Stories:" + anthology.getStory());
    }
}

