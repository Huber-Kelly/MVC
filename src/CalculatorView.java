// Sandbox code from http://www.newthinktank.com/2013/02/mvc-java-tutorial/
// The only job of the view is to display what the user sees
// It performs no calculations, but instead passes information entered by the user

import java.awt.event.ActionListener;

import javax.swing.*;

//Java for making interface
public class CalculatorView extends JFrame{

    private JTextField firstNumber  = new JTextField(10);
    private JLabel additionLabel = new JLabel("X");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Multiply");
    private JTextField calcSolution = new JTextField(10);

    CalculatorView(){

        // Sets up the view and adds the components

        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);

        // End of setting up the components --------

    }
    //provides a way to get access to the first number
    public int getFirstNumber(){

        return Integer.parseInt(firstNumber.getText());
    }
    //provides a way to get access to the second number
    public int getSecondNumber(){

        return Integer.parseInt(secondNumber.getText());

    }
    //gets the calculation
    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }
    //controller sets this because model is going to do the calculation but the model
    //doesn't know about the existance of the view so the controller sets
    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }
        // If the calculateButton is clicked execute a method
        // in the Controller named actionPerformed

    void addCalculateListener(ActionListener listenForCalcButton){

        calculateButton.addActionListener(listenForCalcButton);

    }
// Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
