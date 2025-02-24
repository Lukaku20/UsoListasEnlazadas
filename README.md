# UsoListasEnlazadas

## Description

## Problema 1 _ Recorrer una lista y luego una lista invertida utilizando punteros

El objetivo es invertir el enlace de cada nodo de una lista enlazada de forma iterativa. Para ello, se usan tres punteros:

previous: Apunta al nodo anterior al actual. Inicialmente se establece en NULL (o None en Python) porque el primer nodo no tiene anterior.
current: Es el nodo actual que estamos procesando.
next: Guarda temporalmente el siguiente nodo de la lista para no perder la referencia al resto de la lista.
Pasos del algoritmo:

Mientras current no sea NULL:

Guarda el siguiente nodo: next = current->next
Invierte el puntero del nodo actual: asigna current->next = previous
Avanza los punteros: previous se convierte en el nuevo current y current se mueve al nodo guardado en next.
Al finalizar el ciclo, previous apuntará al nuevo primer nodo de la lista invertida.

Este método es eficiente y utiliza O(1) memoria adicional.
## Problema 2 _ Floyd's Cycle Detection Algorithm (Algoritmo de la Liebre y la Tortuga)
Enfoque Clásico: La estrategia más conocida para resolver este problema es usar dos punteros:

Slow (la tortuga): Avanza un nodo a la vez.
Fast (la liebre): Avanza dos nodos a la vez.
Si en algún momento ambos punteros se encuentran (es decir, apuntan al mismo nodo), significa que hay un ciclo en la lista. Si el puntero rápido llega a NULL, la lista es acíclica.
