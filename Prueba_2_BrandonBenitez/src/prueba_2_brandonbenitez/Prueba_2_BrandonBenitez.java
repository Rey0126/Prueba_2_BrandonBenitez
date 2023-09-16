package prueba_2_brandonbenitez;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba_2_BrandonBenitez {

    static ArrayList<Figura> Figuras = new ArrayList();
    static Scanner rd = new Scanner(System.in);

    public static void main(String[] args) {

        boolean menu = true;

        while (menu) {

            System.out.print("""
                               == MENU ==
                                1. Agregar Figuras
                                2. Imrpimir Figuras
                                3. Salir
                                Ingrese una opción:  """);
            int opcion = rd.nextInt();

            switch (opcion) {

                case 1:

                    boolean menu2 = true;

                    while (menu2) {

                        System.out.println("""
                                        1. Cuadrado
                                        2. Triángulo
                                        3. Rectángulo
                                        4. Salir de Agregar Figuras
                                        Ingrese una opción:  """);
                        int op = rd.nextInt();

                        switch (op) {

                            case 1:

                                System.out.print("Ingrese el largo: ");
                                int largo = rd.nextInt();

                                System.out.print("Ingrese el ancho: ");
                                int ancho = rd.nextInt();

                                System.out.print("Ingrese el alto: ");
                                int alto = rd.nextInt();

                                Figura F = new Figura(largo, ancho, alto, op);
                                Figuras.add(F);
                                System.out.println("¡Figura agregada exitosamente!");

                                break;

                            case 2:

                                System.out.print("Ingrese el largo: ");
                                int largo2 = rd.nextInt();

                                System.out.print("Ingrese el ancho: ");
                                int ancho2 = rd.nextInt();

                                System.out.print("Ingrese el alto: ");
                                int alto2 = rd.nextInt();

                                F = new Figura(largo2, ancho2, alto2, op);
                                Figuras.add(F);
                                System.out.println("¡Figura agregada exitosamente!");

                                break;
                                
                            case 3:
                                
                                System.out.print("Ingrese el largo: ");
                                int largo3 = rd.nextInt();

                                System.out.print("Ingrese el ancho: ");
                                int ancho3 = rd.nextInt();

                                System.out.print("Ingrese el alto: ");
                                int alto3 = rd.nextInt();

                                F = new Figura(largo3, ancho3, alto3, op);
                                Figuras.add(F);
                                System.out.println("¡Figura agregada exitosamente!");
                                
                                break;
                                
                            case 4:
                                
                                menu2 = false;
                                
                                break;
                                
                            default: System.out.println("¡Opción Invalida!");

                        }

                    }

//                    System.out.println("""
//                                        1. Cuadrado
//                                        2. Triángulo
//                                        3. Rectángulo
//                                        Ingrese una opción:  """);
//                    int fig = rd.nextInt();
//
//                    System.out.print("Ingrese el largo: ");
//                    int largo = rd.nextInt();
//                    
//                    System.out.print("Ingrese el ancho: ");
//                    int ancho = rd.nextInt();
//                    
//                    System.out.print("Ingrese el alto: ");
//                    int alto = rd.nextInt();
//
//                    Figura F = new Figura(largo, ancho, alto, fig);
//                    Figuras.add(F);
//                    System.out.println("¡Figura agregada exitosamente!");
                    break;

                case 2:

                    System.out.println("Figuras ");
                    for (Figura i : Figuras) {
                        System.out.println(i.toString());
                    }

                    break;

                case 3:

                    menu = false;

                    break;

                default:
                    System.out.println("¡Opción Invalida!");

            }

        }

    }

}
