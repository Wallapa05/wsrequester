/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceRef;
import org.tempuri.Calculator;

/**
 *
 * @author 8402-01
 */
@WebService(serviceName = "test1")
public class test1 {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/www.dneonline.com/calculator.asmx.wsdl")
    private Calculator service;

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
    @WebMethod(operationName = "addNumber")
    public String addNumber(@WebParam(name = "A") double A, @WebParam(name = "B") double B) {
        //TODO write your implementation code here:
          double addNumber = A+B;
            return null;
    }
    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divideNumber")
    public double divideNumber(@WebParam(name = "A") double A, @WebParam(name = "B") double B) {
        //TODO write your implementation code here:
          double divideNumber = A-B;
         return (A-B);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiply")
    public double multiply(@WebParam(name = "A") double A, @WebParam(name = "B") double B) {
        //TODO write your implementation code here:
        double multiply = A*B;
        return (A*B);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtractNumber")
    public double subtractNumber(@WebParam(name = "A") double A, @WebParam(name = "B") double B) {
        //TODO write your implementation code here:
        double subtractNumber = A/B;
        return (A/B);
    }
}
