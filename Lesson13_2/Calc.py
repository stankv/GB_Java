import zope.interface

class Calc(zope.interface.Interface):

    def set_operand1(operand1):
        pass

    def set_operand2(operand2):
        pass

    def set_operator(operator):
        pass

    def get_result():
        pass