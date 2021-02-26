/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driversortedlinkedlist;

/**
 *
 * @author Kausar Ali
 */


import java.util.Scanner;

class DriverSortedLinkedList {
    Node head;
    void sortedInsert(Node new_node)
    {
        Node current;
        if (head == null || head.data
                >= new_node.data) {
            new_node.next = head;
            head = new_node;
        }
        else {
            current = head;

            while (current.next != null
                    && current.next.data < new_node.data)
                current = current.next;

            new_node.next = current.next;
            current.next = new_node;
        }
    }
    Node newNode(int data)
    {
        Node x = new Node(data);
        return x;
    }
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public static void main(String args[])
    {
        DriverSortedLinkedList l1 =new DriverSortedLinkedList();
        Node new_node;
        int element;
        int choice;
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("=======================");
            System.out.println("which operation you want to perform");
            System.out.println("1. Insert Element");
            System.out.println("2. Display the LinkedList in order form format:");
            System.out.println("0. Exit");
            System.out.println("=======================");

            System.out.println("Enter Your Choice:");
            System.out.println("-----------------------");
            choice = input.nextInt();
            if(choice==1)
            {
                System.out.println("enter the element: ");
                System.out.println("---------------------");
                element=input.nextInt();
                new_node = l1.newNode(element);
                l1.sortedInsert(new_node);
            }
            else if (choice==2){
                System.out.println("The sorted linked is below");
                l1.printList();
            }
            else if(choice==0){
                System.exit(0);
            }
        }
    }
}


