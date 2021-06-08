package util;

import model.Product;

public class ListNode {
    private Product product;
    private ListNode next;

    public ListNode(Product p) {
        this.product = p;
        this.next = null;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }   
    
}
