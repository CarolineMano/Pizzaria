package util;

public class QueueNode {
    private List list;
    private QueueNode next;

    public QueueNode(List newList) {
        list = newList;
        next = null;
    }

    public List getList() {
        return list;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
