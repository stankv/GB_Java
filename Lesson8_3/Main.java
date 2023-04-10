/**
 * 1. Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине.
 * 2. Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать заказ 
 *    и факт получения заказа. Дополнение: для большего понимания у студентов, можно сделать методы-геттеры для имени 
 *    и прочих “персональных данных” abstract.
 * 3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir.
 */

package Lesson8_3;

public class Main {
    
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Stan");
        human.setMakeOrder();
        human.setTakeOrder();
        System.out.println(human.isMakeOrder());
        System.out.println(human.isTakeOrder());
        System.out.println(human.getName());
    }
}
