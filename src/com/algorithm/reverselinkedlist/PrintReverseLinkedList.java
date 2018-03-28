package com.algorithm.reverselinkedlist;

import java.util.ArrayList;

/**

/**
 * Created with IntelliJ IDEA.
 * User: LK
 * Date: 2018/3/23
 * Time: 16:06
 * To change this template use File | Settings | File Templates.
 * Description: 打印反转链表
 */
public class PrintReverseLinkedList {

    public static void main(String[] args) {

        //模拟创建一个链表{7,6,5,4,3,2,1} 7是头结点的值 1是尾节点的值
        Node node = new Node("1",null);
        Node node2 = new Node("2",node);
        Node node3 = new Node("3",node2);
        Node node4 = new Node("4",node3);
        Node node5 = new Node("5",node4);
        Node node6 = new Node("6",node5);
        Node node7 = new Node("7",node6);

        System.out.println("----------------原链表----------");
        System.out.println(node7);

        PrintReverseLinkedList reverse = new PrintReverseLinkedList();
        ArrayList<String> strings = reverse.printListFromTailToHead(node7);

        System.out.println("----------反转后的链表----------");
        System.out.println(strings);
    }


    public ArrayList<String> printListFromTailToHead(Node headNode) {

        ArrayList<String> list = new ArrayList<>();

        Node node = headNode;
        Node laxtNode = headNode;
        Node preNode = null;

        while(node != null){
            Node nextNode = node.getNext();
            if(nextNode == null){
                laxtNode = node;
            }
            node.setNext(preNode);
            preNode = node;
            node = nextNode;
        }

        while(laxtNode != null){
            list.add(laxtNode.getValue());
            laxtNode = laxtNode.getNext();
        }

        return list;
    }


}
