package ejercicio_clase_2;

public class Figura {
    
    private String codigo;
    private double precio;
    private SuperHeroe superheroe; //Tipo objeto
    private Dimension dimension; //Tipo objeto

    public Figura(String codigo, double precio, SuperHeroe superheroe, Dimension dimension) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimension = dimension;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public SuperHeroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(SuperHeroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Figura:\nCodigo: " + codigo + "\nPrecio: " + precio +
                "\nSuperHeroe: " +superheroe.getNombre() + ", Descripcion: " + superheroe.getDescripcion()
                + ", Capa: " + superheroe.isCapa() + "\nDimension de la figura: "+ " Altura: " + dimension.getAlto() 
                + ", Ancho: " + dimension.getAncho() + ", Profundidad: " + dimension.getProfundidad() + "\n";
    }
    
    public void subirPrecio(double altaPrecio){
        this.precio += altaPrecio; 
    }
    
}
