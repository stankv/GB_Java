package Lesson8_1;

public interface Calc {
    public double getOperand1();
    public double getOperand2();
    public void setOperand1(String operandStr);
    public void setOperand2(String operandStr);
    public void setOperator(String operator);
    public String getResult();
}
