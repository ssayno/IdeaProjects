package work.sayno.www;

import javax.servlet.Servlet;

public class Basic {
    public static void main(String[] args) {
        System.out.println("链表的学习");
        System.out.println("使用一种愚蠢的方法进行输出");
        Node<String> n1 = new Node<>("火车头");
        Node<String> n2 = new Node<>("车厢一");
        Node<String> n3 = new Node<>("车厢二");
        Node<String> n4 = new Node<>("车厢三");
        Node<String> n5 = new Node<>("车厢四");
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        print(n1);
        Anonymous anonymous = new Anonymous();
        anonymous.fun();
    }
    public static void print(Node<?> temp){
        while(temp!=null){
            System.out.print(temp.getElement() + "|");
            temp = temp.getNext();
        }
    }
}
