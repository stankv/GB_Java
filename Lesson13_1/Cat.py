from Animal import Animal
from Salmon import Salmon

class Cat(Animal):

    def __init__(self, isInGoodMood, hunger):
        self.__isInGoodMood = isInGoodMood
        self.__hunger = hunger

    def feed(self, salmon):
        if isinstance(salmon, Salmon):
            if(salmon.isCooked()):
                self.__hunger -= 8
            else:
                self.__hunger -= 4

    def voice():
        pass

    def isInGoodMood(self):
        return self.__isInGoodMood
    
    def setInGoodMood(self, inGoodMood):
        self.__isInGoodMood = inGoodMood
    
    def getHunger(self):
        return self.__hunger

    def setHunger(self, hunger):
        self.__hunger = hunger

    def setAge(self, age):
        self.__age = age

    def setName(self, name):
        self.__name = name

    def getAge(self):
        return self.__age 

    def getName(self):
        return self.__name 
    
    def __str__(self):
        return f"name: {self.__name}  age: {self.__age}  hunger: {self.__hunger}  inGoogMood: {self.__isInGoodMood}"