package colecciones;

import java.util.*;

public class EjsList {
    List<String> listaColores = new ArrayList<String>();

    public static void main(String[] args) {
        EjsList app = new EjsList();
        app.list1();
        app.list2();
        app.list3();
        app.list4();
        app.list5();
        app.list6();
        app.list7("Rosa");
        app.list8();

    }

    public void list1() {

        listaColores.add("Rojo");
        listaColores.add("Verde");
        listaColores.add("Azul");
        listaColores.add("Amarillo");
        listaColores.add("Rosa");

        // 2forma
        List<String> listaColores2 = new ArrayList<String>() {
            {
                add("Rojo");
                add("Verde");
                add("Azul");
                add("Amarillo");
                add("Rosa");
            }
        };
        System.out.println(listaColores);
        System.out.println(listaColores2);
    }

    public void list2() {
        for (String c : listaColores) {
            System.out.println(c);
        }
        // 2forma
        listaColores.stream().forEach(System.out::println);
    }

    public void list3() {
        List<String> list3 = new ArrayList<String>();
        list3.add(0, "PrimeraPosicion");
        list3.add(1, "PrimeraPosicion1");
        System.out.println(list3.get(0));
    }

    public void list4() {
        System.out.println(listaColores.get(3));
    }

    public void list5() {
        listaColores.set(4, "Marron");
        System.out.println(listaColores);
    }

    public void list6() {
        listaColores.remove(2);
        System.out.println(listaColores);
    }

    public void list7(String elementoAbuscar) {
        // for (String c : listaColores) {
        // if (c.equalsIgnoreCase(elementoAbuscar)) {
        // System.out.println(c);
        // }
        // System.out.println("No existe ese elemento");
        // }

        var estaElValor = listaColores.contains(elementoAbuscar) ? "el valor está en el array"
                : "El valor no se encuentra en el array";
        System.out.println(estaElValor);
        // 2 forma
        listaColores.stream().filter(c -> c.equalsIgnoreCase(elementoAbuscar)).forEach(System.out::println);
        // investigar como hacelo con ternario
    }

    public void list8() {
        // 2forma
        List<String> listaColores2 = new ArrayList<String>() {
            {
                add("Rojo");
                add("Verde");
                add("Azul");
                add("Amarillo");
                add("Rosa");
            }
        };
        System.err.println("datos Sin Ordenar -> " + listaColores2);
        Collections.sort(listaColores2);
        System.err.println("datos Odenados asc" + listaColores2);
        Collections.sort(listaColores2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareToIgnoreCase(o1);
            }
        });
        System.err.println("datos Odenados desc" + listaColores2);
        listaColores2.sort((a, b) -> a.compareToIgnoreCase(b));
        System.err.println(listaColores2);

        listaColores2.sort((a, b) -> b.compareToIgnoreCase(a));
        System.err.println(listaColores2);
    }

}
