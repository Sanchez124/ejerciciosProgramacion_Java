package ejercicio_clase_2;

import java.util.Scanner;

public class Original {

    public static void main(String[] args) {

//        Prueba clase Superheroe.

        SuperHeroe super1 = new SuperHeroe("Spider-man");
        SuperHeroe super2 = new SuperHeroe("Batman");
        SuperHeroe super3 = new SuperHeroe("SuperMan");

        super1.setDescripcion("El hombre araña"); //Set darle valor al atributo
        super2.setDescripcion("El hombre murcielago");
        super3.setDescripcion("El hombre de acero");
        
        super2.setCapa(true);
        super3.setCapa(true);

        System.out.println(super1);
        System.out.println(super2);
        System.out.println(super3);

//        //Prueba clase Dimension


        Dimension dimPequeña = new Dimension();
        Dimension dimGrande = new Dimension(2.5, 2.8, 0.6);

        System.out.println(dimPequeña);
        System.out.println(dimGrande);
        System.out.println("El volumen total es de: " + dimGrande.getVolumen() + "Cm3 \n");
//
//        //Prueba clase Figura
        Figura fig1 = new Figura("10ABC", 40000, super2, dimGrande);
        Figura fig2 = new Figura("20ABC", 89600, super1, dimGrande);
//    
        System.out.println(fig1 + "\n");
        System.out.println(fig2);
//
        fig1.subirPrecio(20000);
        fig2.subirPrecio(15000);

        System.out.println(fig1 + "\n");
        System.out.println(fig2 + "\n");
//
//        //Prueba clase Coleccion
        Coleccion col1 = new Coleccion("Marvel");
        col1.getListaFiguras().add(fig1);
        col1.getListaFiguras().add(fig2);
        System.out.println(col1);
//
//        //Recorrer el Arraylist
        System.out.println("\n");

        col1.subirPrecio(0, "1");

        //Validar existencia
        boolean existe = col1.subirPrecio(3000, "20ABC");
        if (existe) {
            System.out.println("La figura se encuentra adentro del array");
        } else {
            System.out.println("La figura no se encuentra en el array");
        }

        System.out.println("El precio de la figura es: " + fig1.getPrecio() + "\n");

        col1.subirPrecio(3000, "10ABC");
        
        System.out.println("El precio de la figura es: " + fig1.getPrecio() + "\n");
        
        col1.masValioso();
        col1.conCapa();
        col1.getValorColeccion();
        col1.getVolumenColeccion();

    }

}
