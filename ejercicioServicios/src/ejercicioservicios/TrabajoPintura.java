package ejercicioservicios;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {

    private double superficie;
    private double precioPintura;

    public TrabajoPintura(double superficie, double precioPintura, String trabajador, LocalDate horaInicio, String cliente) {
        super(trabajador, horaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

    @Override
    public double costoMaterial() {
        return (superficie / 7.8) * precioPintura;
    }

    public double costoManoObra() {
        return (superficie / 10) * 9.5;
    }

    public double costoTotal() {
        double totalp = (costoMaterial() + costoManoObra());
        if (superficie < 50) {
            double total = totalp * 1.15;
            return total;
        }
        return totalp;
    }

    public double costoAdicional() {
        if (superficie < 50) {
            double costoAdicional = costoMaterial() * 0.15;
            return costoAdicional;
        }
        return 0;
    }

    @Override
    public String detalleServicio() {
        return "TRABAJO PINTURA\n"
                + "Cliente: " + getCliente() + "\n"
                + "Fecha de inicio: " + LocalDate.now() + "\n"
                + "----------------------------------------------" + "\n"
                + "Pintor: " + getTrabajador() + "\n"
                + "Coste material.............." + costoMaterial() + "\n"
                + "Coste mano de obra.........." + costoManoObra() + "\n"
                + "Coste adicional............." + costoAdicional() + "\n"
                + "Coste total................." + costoTotal() + "\n"
                + "----------------------------------------------" + "\n";
    }

}
