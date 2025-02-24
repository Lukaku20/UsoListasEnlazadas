package org.example.Solutions;


//Floyd's Cycle Detection Algorithm (Algoritmo de la Liebre y la Tortuga)
public class Problem_2 {

    static class Node {
        int data;
        Node next;

        // Constructor simple
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Método que implementa Floyd's Cycle Detection Algorithm
    public static void detectCycle(Node head) {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node tortuga = head;
        Node liebre = head;

        // Avanzar hasta que se encuentre el ciclo o se llegue al final
        while (liebre != null && liebre.next != null) {
            tortuga = tortuga.next;             // Avanza 1 paso
            liebre = liebre.next.next;            // Avanza 2 pasos

            // Comprobar si se encontraron (referencias iguales)
            if (tortuga == liebre) {
                System.out.println("Ciclo detectado en el nodo con data: " + tortuga.data);
                return;
            }
        }

        System.out.println("No se detectó ciclo en la lista.");
    }

    public static void main(String[] args) {
        // Crear una lista de ejemplo: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (ciclo)
        Node head = new Node(1);
        head.next = new Node(2);
        Node node3 = new Node(3);
        head.next.next = node3;
        node3.next = new Node(4);
        node3.next.next = new Node(5);
        // Crear un ciclo: el último nodo apunta a node3
        node3.next.next.next = node3;

        detectCycle(head);
    }
}
