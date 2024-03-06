import java.util.Objects;

class CalculatorConundrum {
    public String calculate (int operand1, int operand2, String operation) throws IllegalOperationException{
        String calc = "";
        double res;
        if(Objects.isNull(operation)){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }


        if(!operation.equals("+") && !operation.equals("-") && !operation.equals("/") && !operation.equals("*") ){
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

            switch (operation) {
                case "+":
                    res = operand1 + operand2;
                    calc = String.format("%d %s %s = %.0f", operand1, operation, operand2, res);
                    break;
                case "-":
                    res = operand1 - operand2;
                    calc = String.format("%d %s %s = %.0f", operand1, operation, operand2, res);
                    break;
                case "/":
                        res = divide(operand1, operand2);
                        calc = String.format("%d %s %s = %.0f", operand1, operation, operand2, res);
                        break;
                case "*":
                    res = operand1 * operand2;
                    calc = String.format("%d %s %s = %.0f", operand1, operation, operand2, res);
                    break;
            }
        return  calc;
    }

    private int divide(int operand1, int operand2) {
        try {
            return operand1 / operand2;
        } catch (ArithmeticException ex) {
            throw new IllegalOperationException("Division by zero is not allowed", ex);
        }
    }
}
