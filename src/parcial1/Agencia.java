package parcial1;

public class Agencia {
    private int ID;
    private String locacion;
    private Reserva reserva;

    public Agencia(int ID, String locacion, Reserva reserva) {
        this.ID = ID;
        this.locacion = locacion;
        this.reserva = reserva;
    }

    public Agencia(int ID, String locacion) {
        this.ID = ID;
        this.locacion = locacion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    public Agencia() {
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    
}
