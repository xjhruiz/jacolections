package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// admite elementos duplicados, tiene mejores metodos que permiten :
//Acceso a una posicion de un elemento
//Busqueda de elementos en concreto devolviendo su posicion 
//mejora el iterador por defecto
//Rango de operaciones, permite realizar operaciones dentro de un rango entre sus elementos de la lista*
//Dentro de la interfaz existen varias implementaciones
// No son sincronizadas, no se garantiza el estado del List si dos o mas acceden a ellas de forma concurrente  por ello exite el metodo Collections.synchronizedList()
public class CList {

    // ArrayList -> consiste en un array redimensionable, aumenta su tamaño segun
    // crece la colleccion de elementos
    // tiene mejor rendimiento de entre todas sus implementaciones
    public void colleccionArrayList() {
        // mas usada y recomendable y optima
        final List arrayList = new ArrayList<Object>();
        arrayList.add("Hola");
        List list = Collections.synchronizedList(new ArrayList());

    }

    // Lista doblemente enlazada de los elementos teniendo un puntero al anterior y
    // al siguiente elemento
    // a veces tiene mejor rendimiento
    public void colleccionLinkedList() {
        final List linkedList = new LinkedList();
        List list = Collections.synchronizedList(new LinkedList());
    }
}
