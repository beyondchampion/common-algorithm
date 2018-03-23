package com.algorithm.reverselinkedlist;/**

/**
 * Created with IntelliJ IDEA.
 * User: LK
 * Date: 2018/3/23
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 * Description: 链表的节点
 */
public class Node {

    private String value;    //节点值

    private Node next;       //下一个节点

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node(String value,Node next){
        this.value = value;
        this.next = next;
    }

    public Node(){

    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }
}
