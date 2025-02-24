package org.example.Solutions;


//Declaracion del nodo
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }

// Función para invertir la lista enlazada
public class LikedlistReverse {

    public static Node reverseList(Node head) {

        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;        // Guardar el siguiente nodo
            current.next = previous;    // Invertir el enlace
            previous = current;         // Avanzar previous
            current = next;             // Avanzar current
        }
        return previous; // Nueva cabeza
    }

    }

// Función para imprimir la lista

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

public static void main(String[] args) {
    // Crear la lista: 1 -> 2 -> 3 -> 4 -> null
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);

    System.out.println("Lista original:");
    printList(head);

    head = LikedlistReverse.reverseList(head);

    System.out.println("Lista invertida:");
    printList(head);
}
}