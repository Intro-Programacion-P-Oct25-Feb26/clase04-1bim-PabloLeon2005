/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombreEstudiante = "Pablo Andrés";
        String apellidoEstudiante = "Guamán León";
        int edad = 20;
        String direccion = "Clodoveo Jaramillo";
        String universidad = "UTPL";
        String ciclo = "Primero";
        String asignatura = "Introducción a la Programación";
        String paralelo = "A";
        String enter = "-------------------------------";
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        
        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad: %s"
                + "\nDirección:\n\n\t%s\n%s\nUniversidad: %s\nCiclo: "
                + "%s\nAsignatura: %s\nParalelo: \n\t%s", 
                nombreEstudiante, 
                apellidoEstudiante, edad, direccion, enter, universidad, ciclo, 
                asignatura, paralelo);
    }
}
