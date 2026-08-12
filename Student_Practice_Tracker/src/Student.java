import java.util.Scanner;

public class Student {
    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    void setDetails(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    void setProgress(int completedTopics, int questionsSolved) {
        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }

    void displayDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Course Name: " + this.courseName);
    }

    void displayProgress() {
        System.out.println("Completed Topics: " + this.completedTopics);
        System.out.println("Questions Solved: " + this.questionsSolved);
    }

    int addTopics(int topics) {
        return this.completedTopics += topics;
    }

    int addQuestions(int questions) {
        return this.questionsSolved += questions;
    }
}

class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter Student Name: ");
        s1.name = sc.next();
        System.out.print("Enter Course Name: ");
        s1.courseName = sc.next();
        System.out.print("Enter Completed Topics: ");
        s1.completedTopics = sc.nextInt();
        System.out.print("Enter Questions Solved: ");
        s1.questionsSolved = sc.nextInt();
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                s1.displayDetails();
                break;
            case 2:
                s1.displayProgress();
                break;
            case 3:
                System.out.print("Enter New Completed Topics: ");
                int topics = sc.nextInt();
                System.out.println("Topics Updated successfully");
                System.out.println("Total Completed Topics: " + s1.addTopics(topics));
                break;
            case 4:
                System.out.print("Enter New Questions Solved: ");
                int questions = sc.nextInt();
                System.out.println("Questions Updated successfully");
                System.out.println("Total Questions Solved: " + s1.addQuestions(questions));
                break;
            case 5:
                System.out.println("Thank you for using Student Practice Tracker.");
                System.out.println("Keep Practicing!!");
                break;
            default:
                System.out.println("Invalid choice");
                System.out.println("Please enter a value between 1 to 5");
                break;
        }
        sc.close();

    }
}
