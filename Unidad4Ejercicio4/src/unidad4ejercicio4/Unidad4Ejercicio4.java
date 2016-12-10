/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4ejercicio4;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Unidad4Ejercicio4 {

    public static Scanner tc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int num = 2;
        int notamax=0, notamin=10;
        String nombre;
        double media, tnotas = 0;
        String[] alumnos = new String[num];
        int[] notas = new int[num];
        
        int [] nombremax, nombremin;
        
        alumnos = cargarAlumnos(alumnos);
        
        notas = cargarNotas(notas);
       
        mostrarAlumnos(alumnos, notas);
        
        media=calcularMedia(notas, num);
        System.out.println("");
        System.out.println("La media de todos los alumnos es: "+media);
        
        System.out.println("");
        System.out.print("Los alumnos con la nota mayor que la media son: ");
        for (int i=0;i<notas.length;i++){
        if (notas[i]>media){
            System.out.println(alumnos[i]+" , ");
        }
        }
        for (int i=0;i<notas.length;i++){
            if(notas[i]>notamax){
                notamax=notas[i];
            }
            else if (notas[i]<notamin){
                notamin=notas[i];
            }
        }
        System.out.println(" ");
        for (int i=0;i<alumnos.length;i++){
            if (notas[i]==notamax){
                System.out.print("La nota mas alta la tiene el/los alumno/s "+alumnos[i]+" ");
            }
        }
        System.out.println("con una nota maxima de "+ notamax);
        for (int i=0;i<alumnos.length;i++){
            if (notas[i]==notamin){
                System.out.print("La nota mas baja la tiene el/los alumno/s "+alumnos[i]+" ");
            }
        }
        System.out.println("con una nota minima de "+ notamin);
    }

        
    

    public static String[] cargarAlumnos(String[] alumnos) {
        String nombre;

        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Introduce el nombre del alumno " + (i + 1) + ": ");
            nombre = tc.next();
            alumnos[i] = nombre;
        }
        return alumnos;
    }

    public static int[] cargarNotas(int[] notas) {
        int nota;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota del aluumno " + (i + 1) + " entre 0 y 10: ");
            nota = tc.nextInt();
            while (nota < 0 || nota > 10) {
                System.out.print("Error !!, vuelve a introducir una nota entre 0 y 10: ");
                nota = tc.nextInt();
            }
            notas[i] = nota;
        }
        return notas;
    }

    public static void mostrarAlumnos(String[] alumnos, int[] notas) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i] + "\t-   " + notas[i]);
        }
    }

    public static double calcularMedia(int[] notas, int num) {
        double media, tnotas = 0;
        for (int i = 0; i < notas.length; i++) {
            tnotas += notas[i];
        }
        media = tnotas / num;
        return media;
    }
}
