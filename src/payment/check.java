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
public class check extends Payment {
    private String name;
    private String bankID;
    public static void main(String[] args) {
        check check = new check();
        if (check.AuthorizeNon())
            System.out.println("success");
        else System.out.println("fail");
        check.PrintNon();
    }
    
}
