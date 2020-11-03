/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author amansingh
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cal")
    public Double cal(@WebParam(name = "first") double first, @WebParam(name = "second") double second, @WebParam(name = "op") char op) {
        //TODO write your implementation code here:
        switch(op)
        {
            case '+':
            {
                double ans;
                ans=first+second;
                return ans;
            }
            case '-':
            {
                double ans;
                ans=first-second;
                return ans;
            }
            case '*':
            {
                double ans;
                ans=first*second;
                return ans;
            }
            case '/':
            {
                double ans;
                ans=first/second;
                return ans;
            }
            default:
            {
                return null;
            }
        }
    }
}
