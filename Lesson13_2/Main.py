from Calculator import Calculator
import re

pattern = re.compile(r'^([-+]?[0-9]{1,}[.,]?[0-9]*)([+\-*\\/])([0-9]{1,}[.,]?[0-9]*)$')
flag = True
while flag:
    math_expression = input(">> ").strip().replace(" ", "")
    if math_expression == "exit":
        flag = False
        continue
    matcher = pattern.match(math_expression)
    if matcher:
        calculator = Calculator()
        calculator.set_operand1(matcher.group(1))
        calculator.set_operator(matcher.group(2))
        calculator.set_operand2(matcher.group(3))
        print(calculator.get_result())