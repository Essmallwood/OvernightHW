package house;

// use the keyword "final" to stop override.
public class Account {
    public final void withdraw (double amount) {
        double newBalance = balance - amount;

        if(newBalance > 0) {
            balance = newBalance;
        }
    }
}
