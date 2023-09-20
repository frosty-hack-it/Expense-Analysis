// FinanceTrackerApp.java
import java.util.List;
import java.util.Scanner;

public class FinanceTrackerApp {
    public static void main(String[] args) {
        ExpenseManager expenseManager = new ExpenseManager();
        List<Expense> testExpenses = TestData.getTestExpenses();
        expenseManager.addExpenses(testExpenses);

        // Implement the main application logic and user interface here...
    }
}
