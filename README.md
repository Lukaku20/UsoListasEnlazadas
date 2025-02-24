# UsoListasEnlazadas

## Description

## Explicación del Algoritmo

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
