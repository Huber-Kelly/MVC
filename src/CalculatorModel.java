// Sandbox code from http://www.newthinktank.com/2013/02/mvc-java-tutorial/
// The Model performs all the calculations needed
// It doesn't know the View exists

public class CalculatorModel {
    // Holds the value of the sum of the numbers entered in the view

    //contains the data
    private int calculationValue;

    //performs the method
    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber * secondNumber;
    }

    //provides access to the data
    public int getCalculationValue(){
        return calculationValue;
    }
}
