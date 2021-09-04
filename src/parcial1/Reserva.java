package parcial1;

public class Reserva {
    private int ID;
    private String inicio;
    private String fin;
    private float precio;
    private String estado;
    private String entregado;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Reserva(int ID, String inicio, String fin, float precio, String estado, String entregado, Cliente cliente, Vehiculo vehiculo) {
        this.ID = ID;
        this.inicio = inicio;
        this.fin = fin;
        this.precio = precio;
        this.estado = estado;
        this.entregado = entregado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Reserva(int ID, String inicio, String fin, float precio, String estado, String entregado) {
        this.ID = ID;
        this.inicio = inicio;
        this.fin = fin;
        this.precio = precio;
        this.estado = estado;
        this.entregado = entregado;
    }

    public Reserva() {
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEntregado() {
        return entregado;
    }

    public void setEntregado(String entregado) {
        this.entregado = entregado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    
}
