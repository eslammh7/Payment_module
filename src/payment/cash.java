package payment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smsm_
 */
public class cash extends Payment {
    private float cashTendered;
    public static void main(String[] args) {
        AuthorizeNon b= new AuthorizeNon();
        if (b.authorized())
            System.out.println("success");
        else System.out.println("fail");
    }
}
