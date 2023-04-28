from Cat import Cat
from Dog import Dog
from Owl import Owl
from Salmon import Salmon

cat1 = Cat(True, 90)
cat1.setName("Мурка")
cat1.setAge(5)
print(cat1)

dog1 = Dog("dog", 70)
dog1.setName("Sharik")
dog1.setAge(3)
print(dog1)

owl1 = Owl(True, 80)
owl1.setName("Buklya")
owl1.setAge(70)
print(owl1)

salmon1 = Salmon(False)
print(cat1)
cat1.feed(salmon1)
print(cat1)