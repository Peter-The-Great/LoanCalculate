import org.pjotr.factory.AbstractFactory;
import org.pjotr.loans.Loan;
import org.pjotr.bank.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestingFactory {
    @Test
    public void testBank() {
        AbstractFactory bankFactory = AbstractFactory.getFactory("Bank");
        Bank bank = bankFactory.getBank("ING");
        assertEquals(bank.getBankName(), "ING");
    }
}
