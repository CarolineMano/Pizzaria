import util.List;
import util.Queue;

public class ManageOrders {
    private Queue ordersQueue;

    public ManageOrders() {
        this.ordersQueue = new Queue();
    }

    public void addOrder(List newOrder) {
        ordersQueue.enqueue(newOrder);
    }

    public String showNextOrder() {
        String output = "*****Próximo pedido a ser atendido*****\n";
        return output += ordersQueue.peek() + "\n";
    }

    public String makeNextOrder() {
        return ordersQueue.dequeue();
    }

    public String showAllOrders() {
        String output = "*****Fila dos pedidos*****\n";
        return output += ordersQueue.show() + "\n";
    }

    public boolean isEmpty() {
        return ordersQueue.isEmpty();
    }
}
