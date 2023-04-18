package Lesson8_1;

public class Calculator implements Calc {
    private double operand1;
    private double operand2;
    private String operator;

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand1(String operand) {
        this.operand1 = Double.parseDouble(operand);
    }

    public void setOperand2(String operand) {
        this.operand2 = Double.parseDouble(operand);
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getResult() {
        Operation operation = operation(operator);
        double result = operation.calculate(operand1, operand2);
        return Double.toString(result);
    }

    private Operation operation(String operator) {
        
        switch (operator) {
            case "+":
                return (op1, op2) -> op1 + op2;
            case "-":
                return (op1, op2) -> op1 - op2;
            case "*":
                return (op1, op2) -> op1 * op2;
            case "/":
                return (op1, op2) -> op2 != 0 ? op1 / op2 : 0;
            default:
                return null;
        }
    }
}
