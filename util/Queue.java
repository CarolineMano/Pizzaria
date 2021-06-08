package util;

public class Queue {
    private QueueNode beginning;
    private QueueNode end;

    public Queue() {
        beginning = end = null;
    }

    public boolean isEmpty() {
        return beginning == null;
    }

    public void enqueue() {
        QueueNode newNode = new QueueNode();

        if(isEmpty()) {
            beginning = end = newNode;
        } else {
            end.setNext(newNode);
            end = newNode;
        }
    }

    public String show() {
        String saida = "Pedidos: ";
        QueueNode auxiliar = beginning;

        while(auxiliar != null) {
            saida += auxiliar.getList().listAll() + "\n********";
            auxiliar = auxiliar.getNext();
        }
        return saida;
    }

    public String peek() {
        if(isEmpty()) {
            return "";
        }
        return beginning.getList().listAll();
    }

    public String dequeue() {
        if(isEmpty()) {
            return "";
        }
        QueueNode auxiliar = beginning;
        beginning = beginning.getNext();
        if(beginning == null) {
            end = null;
        }
        return auxiliar.getList().listAll();
    }
}
