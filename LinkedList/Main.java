package com.company;

import java.awt.event.ItemEvent;

public class Main {

    public static void main(String[] args) {


        LinkedList newLink = new LinkedList();

        newLink.push(4);
        newLink.push(10);
        newLink.push(9);
        newLink.push(3);
        newLink.append(3);
        newLink.append(7);
        newLink.insertAfter(newLink.head.next.next, 1);
       // newLink.deleteNode(10);
       // newLink.deleteList();

        System.out.println("The Length is " + newLink.LengthLinkedList());

        System.out.println("Print All Nodes : ");

        newLink.printList();

        if(newLink.searchkey(newLink.head, 9)){
            System.out.print("Number Exists    ");
        }else{
            System.out.println("Number does't exist  ");
        }


        System.out.println("The Nth number is : " + newLink.GetNth(3));


    }
}


