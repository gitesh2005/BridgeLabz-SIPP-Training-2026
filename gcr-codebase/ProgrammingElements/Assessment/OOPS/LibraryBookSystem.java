package ProgrammingElements.Assessment.OOPS;

class LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean availability;

    // Default constructor
    LibraryBookSystem() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
        availability = true;
    }

    // Parameterized constructor
    LibraryBookSystem(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
            System.out.println("Borrowed Book: " + title);
        } else {
            System.out.println("Sorry, this book is not available.");
        }
    }

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + availability);
    }

    public static void main(String[] args) {
        LibraryBookSystem book1 = new LibraryBookSystem(
                "Data Structures in Java",
                "Robert Lafore",
                550.75,
                true
        );

        book1.displayBookDetails();
        System.out.println();

        book1.borrowBook();
        System.out.println();

        book1.displayBookDetails();
    }
}