// TestData.java
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestData {
    public static List<Expense> getTestExpenses() {
        List<Expense> expenses = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            expenses.add(new Expense(sdf.parse("2023-01-15"), new BigDecimal("500.00"), "Groceries", "Weekly grocery shopping"));
            expenses.add(new Expense(sdf.parse("2023-02-20"), new BigDecimal("750.00"), "Rent", "Monthly rent payment"));
            expenses.add(new Expense(sdf.parse("2023-02-25"), new BigDecimal("800.00"), "Utilities", "Electricity and water bills"));
            // Add more test data here...
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return expenses;
    }
}
