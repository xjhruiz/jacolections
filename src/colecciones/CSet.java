package colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//no puede tener elementos duplicados, quedan prohibidos
//para comprobar si los elementos son duplicados o no es necesario implementar los metodos equals y hashcode
// se comprueba si dos Set son iguales, sin importar el orden de estos.
// interface SET
//implementacion ninguna son sincronizadas no se garantiza el estado del set si dos o mas hilos acceden al mismo hilo concurrente. -> metodos que actuan de wrapper Collections.synchronizedSet()
public class CSet {

    public static void main(String[] args) {
        CSet app = new CSet();

        app.colleccionHashSet();
        app.colleccionTreeSet();
        app.colleccionLinkedHashSet();
    }

    // HashSet -> almacena elementos en una tabla hash, mejor rendimiento, pero
    // ningun orden en su iteracion, es importartante definir el tamaño
    public void colleccionHashSet() {
        // 1_000_000 >java 7 undescores o low dash agrupa numéricamente
        // se va a iterar un millo de veces es mas legible, 1000000 = 1_000_000
        final Set hasSet = new HashSet(1_000_000);// --> final Set hasSet = new HashSet(1000000);
        final Long startHastSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hasSet.add(i);
        }

        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Tardo HashSet : " + (endHashSetTime - startHastSetTime));

    }

    // TreeSet -> almacena elementos ordenados en base a sus valores, es mas lento
    // que HashSet-> para comprar se debe de implementar Comparable () log(N)
    public void colleccionTreeSet() {
        final Set treeSet = new TreeSet();
        final Long starTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Tardo TreeSet : " + (endTreeSetTime - starTreeSetTime));
    }

    // LinkedHashSet -> almacena elementos en funcion de su orden de insercion, es
    // un poco mas lento que HashSet
    public void colleccionLinkedHashSet() {
        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Tardo LinkedHashSet : " + (endLinkedHashSetTime - startLinkedHashSetTime));
    }

}
