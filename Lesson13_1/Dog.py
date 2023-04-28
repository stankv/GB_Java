from Animal import Animal
from Salmon import Salmon

class Dog(Animal):

    def __init__(self, breed, hunger):
        self.__breed = breed
        self.__hunger = hunger

    def feed(self, salmon):
        if isinstance(salmon, Salmon):
            if(salmon.isCooked()):
                self.__hunger -= 5
            else:
                self.__hunger -= 1

    def voice():
        pass

    def getBreed(self):
        return self.__breed
    
    def setBreed(self, breed):
        self.__breed = breed
    
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
        return f"name: {self.__name}  age: {self.__age}  hunger: {self.__hunger}  breed: {self.__breed}"