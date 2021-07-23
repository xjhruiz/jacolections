package colecciones;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// >java 8 los streams permiten hacer operaciones funcionales sobre elementos de la colecciones
public class CStream {

    // ejemplo de streams
    static List<Persona> personas = new ArrayList<Persona>();

    public void agregarPersonas() {
        System.out.println("Creando Personas");
        for (int i = 0; i < 10; i++) {
            personas.add(new Persona("Nombre : " + i, "Apellido: " + i, (int) (Math.random() * (30 - i))));
        }
    }

    public void imprimir(List<Persona> personas) {
        System.out.println("Mostrando Personas");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public static void main(String[] args) {
        CStream cStream = new CStream();
        cStream.agregarPersonas();
        cStream.imprimir(personas);
        // de esta forma obtenemos todos los nombre de las personas y lo mostramos,
        // tambine se pueden operar con ciertos metodos.
        personas.stream().map(Persona::getNombre).collect(Collectors.toList()).forEach(System.out::println);
        // ordenando las edades de forma desc
        personas.stream().map(Persona::getEdad).sorted((a, b) -> b.compareTo(a)).forEach(System.out::print);

    }

}

class Persona implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas [ nombre =" + nombre + ", apellido =" + apellido + ", edad =" + edad + "]";
    }

}