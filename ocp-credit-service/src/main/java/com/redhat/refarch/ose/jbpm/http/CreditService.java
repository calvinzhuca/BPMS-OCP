package com.redhat.refarch.ose.jbpm.http;

import javax.jws.WebMethod;
import javax.jws.WebService;

/***
 * @author jary
 * @since Sep/3/2016
 */

@WebService
public class CreditService {

    @WebMethod
    public Integer getCreditScore(Integer ssn) {

        int lastDigit = ssn - 10 * (ssn / 10);
        int score = 600 + (lastDigit * 20);
        System.out.println("For ssn " + ssn + ", will return credit score of " + score);

        return score;
    }
}