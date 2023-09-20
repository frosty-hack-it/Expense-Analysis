// Expense.java
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Expense {
    private Date date;
    private BigDecimal amount;
    private String category;
    private String description;

    public Expense(Date date, BigDecimal amount, String category, String description) {
        this.date = date;
        this.amount = amount;
        this.category = category;
        this.description = description;
    }

    // Getter methods here...

    // Other methods here...
}
