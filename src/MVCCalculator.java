// Sandbox code from http://www.newthinktank.com/2013/02/mvc-java-tutorial/
//I learned a lot by playing with this sandbox code. I did not manipulate it too much,
//I changed it from addition to multiplication, and added more comments as I was learning
// it ws fun to work with

//MVC:The View presents the model’s data to the user. The view communicates with the controller
//but not with the model or the view. The user only communicates with the view not with the
//controller or model

public class MVCCalculator {

    public static void main(String[] args) {
        //the view and model do not know each other exists
        CalculatorView theView = new CalculatorView();

        CalculatorModel theModel = new CalculatorModel();

        //controller allows view and model to interact with each other
        CalculatorController theController = new CalculatorController(theView,theModel);

        //makes the view visible on the screen
        theView.setVisible(true);
    }
}

