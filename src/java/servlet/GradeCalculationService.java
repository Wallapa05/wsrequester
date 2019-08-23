package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 8402-01
 */
@WebService(serviceName = "GradeCalculationService")
public class GradeCalculationService {

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
    @WebMethod(operationName = "computeGrade")
    public String computeGrade(@WebParam(name = "score") double score) {
        //TODO write your implementation code here:
        if (score < 0 || score > 100) {
            return "Error input score 0 - 100";
        } else if (score >= 80) {
            return "Score = " + score + " , Your Grade : A";
        } else if (score >= 75) {
            return "Score = " + score + " , Your Grade : B+";
        } else if (score >= 70) {
            return "Score = " + score + " , Your Grade : B";
        } else if (score >= 65) {
            return "Score = " + score + " , Your Grade : C+";
        } else if (score >= 60) {
            return "Score = " + score + " , Your Grade : C";
        } else if (score >= 55) {
            return "Score = " + score + " , Your Grade : D+";
        } else if (score >= 50) {
            return "Score = " + score + " , Your Grade : D";
        } else {
            return "Score = " + score + " , You Grade : F";
        }
    }
}
