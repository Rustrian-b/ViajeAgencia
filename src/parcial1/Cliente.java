package parcial1;

public class Cliente {
    private int ID;
    private String nombre;
    private int dpi;
    private int telefono;
    private String correo;
    private Reserva reservas;
    private Cliente Aval;

    public Cliente(int ID, String nombre, int dpi, int telefono, String correo, Reserva reservas, Cliente Aval) {
        this.ID = ID;
        this.nombre = nombre;
        this.dpi = dpi;
        this.telefono = telefono;
        this.correo = correo;
        this.reservas = reservas;
        this.Aval = Aval;
    }

    public Cliente(int ID, String nombre, int dpi, int telefono, String correo, Reserva reservas) {
        this.ID = ID;
        this.nombre = nombre;
        this.dpi = dpi;
        this.telefono = telefono;
        this.correo = correo;
        this.reservas = reservas;
    }

    
    
    public Cliente(int ID, String nombre, int dpi, int telefono, String correo) {
        this.ID = ID;
        this.nombre = nombre;
        this.dpi = dpi;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
       
    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Reserva getReservas() {
        return reservas;
    }

    public void setReservas(Reserva reservas) {
        this.reservas = reservas;
    }

    public Cliente getAval() {
        return Aval;
    }

    public void setAval(Cliente Aval) {
        this.Aval = Aval;
    }
    
       
}
