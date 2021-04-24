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
public interface IauthourizeBehavior {
    public boolean AuthorizeNon();
    public boolean AuthorizeCash();
    public boolean AuthorizeCredit1();
    public boolean AuthorizeCredit2();
}
