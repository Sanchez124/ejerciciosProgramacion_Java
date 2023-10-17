package ejercicioservicios;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    
    private int numAlarmaRevisada; 

    public RevisionAlarma(LocalDate horaInicio, String cliente, int numAlarmaRevisada) {
        super("Revisor Especialista Contraincendios", horaInicio, cliente);
        this.numAlarmaRevisada = numAlarmaRevisada;
    }

    public int getUmAlarmaRevisada() {
        return numAlarmaRevisada;
    }

    public void setUmAlarmaRevisada(int umAlarmaRevisada) {
        this.numAlarmaRevisada = umAlarmaRevisada;
    }
    
    @Override
    public double costoMaterial(){
        return 0;
    }
    
    @Override
    public double costoManoObra(){
        return (numAlarmaRevisada / 3) * 40;
    }
    
    @Override
    public double costoTotal(){
        return costoManoObra();
    }
    
    public String detalleServicio(){
        return "REVISION PERIODICA ALARMAS CONTRAINCENDIOS\n"
               + "Cliente: " + getCliente() + "\n"
               + "Fecha de revision: " + LocalDate.now() + "\n"
               + "----------------------------------------------\n"
               + "Total............... " + costoTotal() + "\n"
               + "----------------------------------------------";
    }
    
}
