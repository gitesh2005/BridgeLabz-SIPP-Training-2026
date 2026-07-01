package ProgrammingElements.Assessment.OOPS;


class BookDetails {
    String title;
    String author;
    double price;

    // Default constructor
    BookDetails() {
        title = "Sher";
        author = "Cheetah";
        price = 6760.0;
    }

    // Parameterized constructor
    BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        BookDetails book1 = new BookDetails();
        BookDetails book2 = new BookDetails("Java Programming", "James Gosling", 450.50);

        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}