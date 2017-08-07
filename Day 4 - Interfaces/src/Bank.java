import org.junit.Test;


public class Bank {

    AccountServiceImpl accountService = new AccountServiceImpl("Arshi","PUNE","123703981",45);

    @Test
    public void testCustomerServiceImpl() {
        accountService.details();
        accountService.deposit(5);
        accountService.balance();
        accountService.withdraw(10);
        accountService.balance();
    }


}
