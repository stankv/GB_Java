class Salmon:

    def __init__(self, isCooked):
        self.__isCooked = isCooked

    def isCooked(self):
        return self.__isCooked

    def setCooked(self, cooked):
        self.__isCooked = cooked