package com.algorithm.reverselinkedlist;/**

/**
 * Created with IntelliJ IDEA.
 * User: LK
 * Date: 2018/3/23
 * Time: 16:06
 * To change this template use File | Settings | File Templates.
 * Description: 反转链表
 */
public class ReverseLinkedList {

    /**
     * 反转链表
     * @param head  链表头结点
     * @return 反转后的链表头结点
     */
    public Node reverseLinkedList(Node head){

        Node reverseHeadNode = head;  //反转后的头节点
        Node node = head;  //当前节点
        Node preNode = null;  //上一个节点(因为入参传的是头结点，头结点上一个节点默认null)

        while (node != null){
            Node nextNode = node.getNext(); //暂存下一个节点的地址，因为反转后会失去与下一节点的关联
            if(nextNode == null){
                reverseHeadNode = node;
            }
            node.setNext(preNode);
            preNode = node;
            node = nextNode;
        }

        return reverseHeadNode;

    }

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

        ReverseLinkedList reverse = new ReverseLinkedList();
        Node reverseHeadNode = reverse.reverseLinkedList(node7);

        System.out.println("----------反转后的链表----------");
        System.out.println(reverseHeadNode);
    }


}
