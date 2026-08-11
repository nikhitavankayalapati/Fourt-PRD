import java.util.Scanner;

class StudentExpense {
    String studentName;
    double dailyBudget;
    double foodExpences;
    double travelExpences;
    double studyExpences;
    double otherExpences;

    double calculateTotalExpences() {
        double TotalExpences = foodExpences + travelExpences + studyExpences + otherExpences;
        return TotalExpences;
    }

    double calculateRemainingAmount() {
        double remainingAmount = dailyBudget - calculateTotalExpences();

        return Math.abs(remainingAmount);

    }

    boolean isWithbudget() {
        if (calculateRemainingAmount() <= dailyBudget) {
            return true;
        }
        return false;
    }

    double calculateExceededAmount() {
        if (calculateTotalExpences() > dailyBudget) {
            double exceededAmount = calculateTotalExpences() - dailyBudget;
            return exceededAmount;
        }
        return 0;
    }

    String getBudgetStatus() {
        if (calculateTotalExpences() < dailyBudget) {
            return "With Budget";
        } else if (calculateTotalExpences() > dailyBudget) {
            return "Exceeded";
        } else {
            return "On Budget";
        }
    }

    void displayExpenseReport() {
        System.out.println("Student Name          : " + studentName);
        System.out.println("Daily Budget          : " + dailyBudget);
        System.out.println("Food Expences         : " + foodExpences);
        System.out.println("Travel Expences       : " + travelExpences);
        System.out.println("Stud Expences         : " + studyExpences);
        System.out.println("Other Expences        : " + otherExpences);
        System.out.println("Total Expences        : " + calculateTotalExpences());
        System.out.println("Remaining Amount      : " + calculateRemainingAmount());
        System.out.println("Budget Status         : " + getBudgetStatus());
    }
}

class StudentExpencessApplication {
    public static void main(String[] args) {
        StudentExpense student1 = new StudentExpense();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        student1.studentName = sc.next();
        System.out.print("Enter Daily budget: ");
        student1.dailyBudget = sc.nextDouble();
        System.out.print("Enter food expences: ");
        student1.foodExpences = sc.nextDouble();
        System.out.print("Enter travel expences: ");
        student1.travelExpences = sc.nextDouble();
        System.out.print("Enter study expences: ");
        student1.studyExpences = sc.nextDouble();
        System.out.print("Enter other expences: ");
        student1.otherExpences = sc.nextDouble();
        System.out.println();
        System.out.println("---------- DAILY EXPENSE REPORT ----------");
        student1.displayExpenseReport();
        System.out.println("------------------------------------------");
    }
}
