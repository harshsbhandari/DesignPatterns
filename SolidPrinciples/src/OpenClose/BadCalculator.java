package OpenClose;

public class BadCalculator {
    public int calculate(int number1, int number2, String operation) {
        int result = 0;
        
        // If we have to add divide and multiply operation, 
        // then we have to modify our code
        // Open and close principle does not supports that, it asks to implement the class for the required modification, instead of modifying our class
        switch (operation) {
            case "add":
                result = number1 + number2;
                break;

            case "subtract":
                result = number1 - number2;
                break;

            default:
                break;
        }
        
        return result;
    }
}
