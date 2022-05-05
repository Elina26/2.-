import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest {
    @Test()
    public void test_test_Possible_Amount() {
        Payment payment = new Payment("name",0,0,0, -42);
        boolean expected;
        if (payment.get_Amount_of_payment()<0) {expected=false;}
        else {expected=true;}
        assertFalse(expected);
    }

    @Test()
    public void test_Possible_name_1() {
        Payment payment = new Payment(null,1,2,2020, 1548);
        boolean expected;
        if (payment.get_name()==null) {expected=false;}
        else {expected=true;}
        assertFalse(expected);
    }

    @Test()
    public void test_Possible_name_2() {
        Payment payment = new Payment("",1,2,2020, 1548);
        boolean expected;
        if (payment.get_name()=="") {expected=false;}
        else {expected=true;}
        assertFalse(expected);
    }
}