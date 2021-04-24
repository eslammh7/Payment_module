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
        AuthorizeCredit1 a = new AuthorizeCredit1();
        AuthorizeCredit2 aa = new AuthorizeCredit2();
        if (a.authorized())
            System.out.println("success");
        else if (aa.authorized())
            System.out.println("success");
        else System.out.println("fail");
    }
}
