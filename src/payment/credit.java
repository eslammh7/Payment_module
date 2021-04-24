package payment;


import java.util.Date;

/**
 *
 * @author smsm_
 */
public class credit extends Payment {
    private String name;
    private String type;
    private Date expDate;
    public static void main(String[] args) {
        credit credit = new credit();
        if (credit.AuthorizeCredit1())
            System.out.println("success");
        else if (credit.AuthorizeCredit2())
            System.out.println("success");
        else System.out.println("fail");
        credit.PrintCashTrans();
    }
}
