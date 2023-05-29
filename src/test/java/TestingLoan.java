import org.pjotr.factory.AbstractFactory;
import org.pjotr.factory.FactoryCreator;
import org.pjotr.loans.Loan;
import org.pjotr.bank.Bank;
import org.junit.jupiter.api.Test;
import org.pjotr.loans.Loan;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingLoan {
    @Test
    public void testBank() {
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank("ING");
        assertEquals(bank.getbankName(), "ING");
    }
    @Test
    public void testLoan(){
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l=loanFactory.getLoan("education");
        assertEquals(l.calculateLoanPayment(100,3), 8.0);
    }
}