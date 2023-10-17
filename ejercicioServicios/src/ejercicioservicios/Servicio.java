package ejercicioservicios;

import java.time.LocalDate; //permite manejar las fechas y trabajar con ellas (formatos)

public abstract class Servicio {
    
    private String trabajador;
    private LocalDate horaInicio;
    private String cliente;

    public Servicio(String trabajador, LocalDate horaInicio, String cliente) {
        this.trabajador = trabajador;
        this.horaInicio = horaInicio;
        this.cliente = cliente;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    //METODOS ABSTRACTOS
    public abstract double costoMaterial();
    public abstract double costoManoObra();
    public abstract double costoTotal();
    public abstract String detalleServicio();
    
}
