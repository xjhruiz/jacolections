package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

//Clase generica Collection extiende de otras subclases genericas que aportan nuevas funciones
//Asocia Clave Valor no puede haber claves duplicadas, y solo puede haber un unico valor 
//Existen varios tipos
//HashMap ->
//TreeMap ->
//LinkedHashMap ->
// Ninguna es asincronas no garantiza el estado de Map si dos hilos o mas acceden de forma concurrente al mismo.
public class CMap {
    // almacena valores en una tabla hash
    // tiene mejor rendimiento, no garantiza ningun orden a la hora de realizar las
    // iteraciones
    // proporciona tiempos constantes en las operaciones basicas siempre que se
    // disparen correctamente los elementos dentro de la tabla de hasg
    // se tiene que definir el tamaño inicial de la tabla, marcara el rendimiento de
    // esta implementacion
    // generalmente es la que mas se usa
    public void collectionHashMap() {
        Map map = Collections.synchronizedMap(new HashMap());
        Map<Integer, List> hashMap = new HashMap<Integer, List>();
        hashMap.put(4, new ArrayList<Integer>() {
            {
                add(4);
                add(2);
                add(4);
            }
        });
    }

    // se almacena las claves ordenandolas en funcion de sus valores
    // es mas lento que HashMap, se deben de implementar la interfaz Comparable
    // rendimiento log(N) en operaciones basica debido a la estructura de árboles
    // empleada

    public void TreeMap() {
        SortedMap mortedMap = Collections.synchronizedSortedMap(new TreeMap());
        Map<Integer, List> treeMap = new TreeMap<Integer, List>();
        treeMap.put(2, new ArrayList<String>() {
            {
                add("Prueba");
                add("PrimeraForma");
                add("ArrayList");
                add("Anonimo");
            }
        });

    }

    // almacena sus valores en funcion del orden de la insercion
    // es un poco mas costosa y lenta que HashMap

    public void LinkedHashMap() {
        Map map = Collections.synchronizedMap(new LinkedHashMap());
        Map<Integer, List> linkedHashMap = new LinkedHashMap<Integer, List>();
    }
}
