public abstract class Persona {
    protected String nombre;
    protected String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    public abstract void mostrarInfo();
}

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, String dni, String carrera) {
        super(nombre, dni);
        this.carrera = carrera;
    }

    public String getCarrera() { return carrera; }

    @Override
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " - Carrera: " + carrera);
    }
}

public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre, String dni, String especialidad) {
        super(nombre, dni);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }

    @Override
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " - Especialidad: " + especialidad);
    }
}

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String categoria;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public static final int MAX_ESTUDIANTES = 30;

    public Curso(String nombre, String categoria, Profesor profesor) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public Profesor getProfesor() { return profesor; }

    public boolean inscribirEstudiante(Estudiante e) {
        if (estudiantes.size() < MAX_ESTUDIANTES) {
            estudiantes.add(e);
            return true;
        } else {
            return false;
        }
    }

    public int getCantidadEstudiantes() {
        return estudiantes.size();
    }

    public void mostrarCurso() {
        System.out.println("Curso: " + nombre + " (" + categoria + ")");
        System.out.println("Profesor: " + profesor.getNombre());
        System.out.println("Estudiantes inscritos: " + estudiantes.size());
    }
}

import java.util.ArrayList;

public class SistemaGestion {
    private ArrayList<Curso> cursos;

    public SistemaGestion() {
        cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public void mostrarCursos() {
        for (Curso c : cursos) {
            c.mostrarCurso();
            System.out.println("--------------------");
        }
    }

    public void mostrarDisponibles() {
        System.out.println("Cursos disponibles:");
        for (Curso c : cursos) {
            if (c.getCantidadEstudiantes() < Curso.MAX_ESTUDIANTES) {
                System.out.println("- " + c.getNombre());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Mario Santillana", "12345678", "Programación");
        Profesor p2 = new Profesor("Ana Torres", "87654321", "Matemáticas");

        Curso curso1 = new Curso("Programación III", "Programación", p1);
        Curso curso2 = new Curso("Álgebra Lineal", "Matemáticas", p2);

        Estudiante e1 = new Estudiante("Carlos Pérez", "11112222", "Ingeniería de Sistemas");
        Estudiante e2 = new Estudiante("María López", "33334444", "Ingeniería Industrial");

        SistemaGestion sistema = new SistemaGestion();
        sistema.agregarCurso(curso1);
        sistema.agregarCurso(curso2);

        curso1.inscribirEstudiante(e1);
        curso2.inscribirEstudiante(e2);

        sistema.mostrarCursos();
        sistema.mostrarDisponibles();

        Persona persona1 = e1;
        Persona persona2 = p1;
        persona1.mostrarInfo();
        persona2.mostrarInfo();
    }
}
