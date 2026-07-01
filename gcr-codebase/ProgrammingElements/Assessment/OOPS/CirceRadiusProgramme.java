package ProgrammingElements.Assessment.OOPS;

class CircleRadius {
    double radius;

    // Default constructor using constructor chaining
    CircleRadius() {
        this(11.0);
    }

    // Parameterized constructor
    CircleRadius(double radius) {
        this.radius = radius;
    }

    void displayCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        CircleRadius circle1 = new CircleRadius();
        CircleRadius circle2 = new CircleRadius(5.0);

        circle1.displayCircleDetails();
        System.out.println();
        circle2.displayCircleDetails();
    }
}