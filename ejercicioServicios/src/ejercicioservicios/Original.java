package ejercicioservicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Original {

    public static void main(String[] args) {
        
        //Arraylist que guarda los objetos de tipo ppintura o revision alarma
        ArrayList<Servicio> servicios = new ArrayList<>();
        
//        TrabajoPintura t1 = new TrabajoPintura(10, 5000, "Carlos" , LocalDate.now(), "Juan");
//        RevisionAlarma r1 = new RevisionAlarma(LocalDate.now(), "Armando", 6);
//        
//        servicios.add(t1);
//        servicios.add(r1);
//        System.out.println(t1.detalleServicio());
//        System.out.println(r1.detalleServicio());
          menu();
    }
    
    public static void menu(){
        System.out.println("Menu de opciones\n"
                         + "1. Trabajo de pintura\n" 
                         + "2. Trabajo revision de alarma\n"
                         + "0. Salir");
        System.out.println("Que trabajo deseas realizar?: ");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado el servicio de trabajo pintura");
                System.out.println("Ingresa la superficie: ");
                double superficiePintura = teclado.nextDouble();
                System.out.println("Ingresa el precio de la pintura por litro: ");
                double precioPinturaLitro = teclado.nextDouble();
                System.out.println("Ingresa el nombre del trabajador: ");
                String trabajadorPintura = teclado.next();
                System.out.println("Ingresa el nombre del cliente: ");
                String nombreClientePintura = teclado.next();
                TrabajoPintura t2 = new TrabajoPintura(superficiePintura, precioPinturaLitro, trabajadorPintura, LocalDate.now(), nombreClientePintura);
                System.out.println("\nFACTURA");
                System.out.println(t2.detalleServicio());
                break;
            case 2:
                System.out.println("Has seleccionado el servicio de revision alarma");
                System.out.println("Ingresa el nombre del cliente: ");
                String clienteAlarma = teclado.next();
                System.out.println("Ingresa el numero de alarmas revisadas: ");
                int alarmasR = teclado.nextInt();
                RevisionAlarma r2 = new RevisionAlarma(LocalDate.now(), clienteAlarma, alarmasR);
                System.out.println("\nFACTURA");
                System.out.println(r2.detalleServicio());
                break;
            case 0:
                System.out.println("Sistema finalizado...");
                break;
            default:
                System.out.println("La opcion ingresada no esta en el menu");
        }
        
    }
    
}
