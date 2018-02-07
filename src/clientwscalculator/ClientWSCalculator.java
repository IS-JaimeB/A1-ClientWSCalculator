/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwscalculator;

/**
 *
 * @author Jaime
 */
public class ClientWSCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Suma de 10 y 4: " + sum(10,4));
        System.out.println("Resta de 20 y 10: " + rest(20,10));
    }

    private static int rest(int n1, int n2) {
        calc.Calc_Service service = new calc.Calc_Service();
        calc.Calc port = service.getCalcPort();
        return port.rest(n1, n2);
    }

    private static int sum(int n1, int n2) {
        calc.Calc_Service service = new calc.Calc_Service();
        calc.Calc port = service.getCalcPort();
        return port.sum(n1, n2);
    }
    
}
