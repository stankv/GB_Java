import zope.interface
from Calc import Calc


@zope.interface.implementer(Calc)
class Calculator:
    def __init__(self):
        self.__operand1: float
        self.__operand2: float
        self.__operator: str

    def set_operand1(self, operand1):
        self.__operand1 = float(operand1.replace(',', '.'))

    def set_operand2(self, operand2):
        self.__operand2 = float(operand2.replace(',', '.'))

    def set_operator(self, operator):
        self.__operator = operator

    def get_result(self):
        if self.__operator == '+':
            return self.__operand1 + self.__operand2
        elif self.__operator == '-':
            return self.__operand1 - self.__operand2
        elif self.__operator == '*':
            return self.__operand1 * self.__operand2
        elif self.__operator == '/':
            if self.__operand2 == 0:
                print("Division by zero!")
            return self.__operand1 / self.__operand2 if self.__operand2 !=0 else 0
        return 0

