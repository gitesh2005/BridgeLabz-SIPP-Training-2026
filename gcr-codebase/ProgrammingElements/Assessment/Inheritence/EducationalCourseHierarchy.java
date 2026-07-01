package ProgrammingElements.Assessment.Inheritence;

class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourseDetails() {
        System.out.println("Online Course Details");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayCourseDetails() {
        System.out.println("Paid Online Course Details");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: " + calculateFinalFee());
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course course1 = new Course("Basic Computer Skills", 20);

        OnlineCourse onlineCourse1 = new OnlineCourse(
                "Java Programming",
                40,
                "Udemy",
                true
        );

        PaidOnlineCourse paidCourse1 = new PaidOnlineCourse(
                "Advanced Java",
                60,
                "Coursera",
                true,
                5000,
                15
        );

        System.out.println("General Course:");
        course1.displayCourseDetails();

        System.out.println();

        System.out.println("Online Course:");
        onlineCourse1.displayCourseDetails();

        System.out.println();

        System.out.println("Paid Online Course:");
        paidCourse1.displayCourseDetails();
    }
}