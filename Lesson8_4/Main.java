/**
 * 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди, 
 *    принятие/отдача заказа.
 * 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, 
      обновление состояния магазина.
 * 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей 
 *    в очереди в различных статусах.
 */

package Lesson8_4;

public class Main {
    
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Stan");
        human.setMakeOrder();
        human.setTakeOrder();
        System.out.println(human.isMakeOrder());
        System.out.println(human.isTakeOrder());
        System.out.println(human.getName());

        Market market = new Market();
        market.takeInQueue(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
        market.acceptToMarket(human);
        market.releaseFromMarket(human);
    }
}
