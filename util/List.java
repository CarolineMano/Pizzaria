package util;

import java.text.DecimalFormat;
import model.Product;

public class List {
    private ListNode beginning;
    private int size;

    public List(){
        this.beginning = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (beginning == null);
    }

    public void addBeginning(Product nextProduct) {
        ListNode newNode = new ListNode(nextProduct);
        newNode.setNext(beginning);
        this.beginning = newNode;
        size++;
    }

    public String listAll() {
        String output = "";
        ListNode auxiliar = beginning;
        double amountDue = 0;

        while(auxiliar != null) {
            output = output + auxiliar.getProduct().getName() + " - R$" + auxiliar.getProduct().getPrice() + " \n";
            amountDue += auxiliar.getProduct().getPrice();
            auxiliar = auxiliar.getNext();
        }
        DecimalFormat df = new DecimalFormat("0.00");
        String amountDueAsString = df.format(amountDue);
        
        output += "Valor total: R$" + amountDueAsString;
        return output;
    }

    public int getSize() {
        return size;
    }

    public ListNode removeBeginning() {
        if(isEmpty()) {
            return null;
        }
        ListNode auxiliar = beginning; 
        beginning = beginning.getNext();
        auxiliar.setNext(null);
        size--;
        return auxiliar;
    }
}
