package ejercicio_clase_2;

import java.util.ArrayList;

public class Coleccion {

    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion() {
    }

    public Coleccion(String nombreColeccion) {
        listaFiguras = new ArrayList<>();
        this.nombreColeccion = nombreColeccion;

    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    @Override
    public String toString() {
        return "Coleccion:\n" + "nombreColeccion: " + nombreColeccion + ", listaFiguras: " + listaFiguras;
    }

    public void addFigura(Figura fig) {
        listaFiguras.add(fig);
    }

    public boolean subirPrecio(double cantidad, String id) {
        for (Figura fig : listaFiguras) {
            System.out.println(fig.getCodigo());
            if (fig.getCodigo().equals(id)) {
                //fig.subirPrecio(cantidad);
                double precioFig = 0;
                precioFig = fig.getPrecio() + cantidad;
                fig.setPrecio(precioFig);
            }
        }
        return false;

    }

    public void conCapa() {
        for (Figura fig : listaFiguras) {
            if (fig.getSuperheroe().isCapa() == true) {
                System.out.println("SuperHeroe con capa:1 " + fig.getSuperheroe().getNombre());
            }
        }
    }

    public double masValioso() {
        double mayor = 0;
        for (Figura fig : listaFiguras) {
            if (fig.getPrecio() > mayor) {
                mayor = fig.getPrecio();
            }
        }
        System.out.println("La figura mas valiosa es: " + mayor);
        return 0;
    }

    public void getValorColeccion() {
        double total = 0;
        for (Figura fig : listaFiguras) {
            total += fig.getPrecio();
        }
        System.out.println("El valor total de la coleccion es: " + total);

    }
    
    public void getVolumenColeccion(){
        double totalVolumen = 0;
        for (Figura fig : listaFiguras) {
            totalVolumen += fig.getDimension().getVolumen();
        }
        System.out.println("El volumen total es: " + (totalVolumen + 200));
    }

}
