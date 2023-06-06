import org.pjotr.factory.AbstractFactory;
import org.pjotr.loans.Loan;
import org.pjotr.bank.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingLoan {
    AbstractFactory loanFactory = AbstractFactory.getFactory("Loan");
    Loan l=loanFactory.getLoan("education");
    @Test
    public void testRate(){
        l.calculateLoanPayment(1000, 1);
        assertEquals(Math.round(l.getRate()), 10);
    }
    @Test
    public void testCalculation(){
        double rate = l.getRate() / 1200;
        int n = 12;
        double loanamount = 1000;
        assertEquals(Math.round(((rate * Math.pow((1 + rate), n) / (Math.pow((1 + rate), n) - 1)) * loanamount) * 100)/100, 87);
    }
}
