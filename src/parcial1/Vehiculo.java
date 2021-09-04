package parcial1;

public class Vehiculo {
    private int ID;
    private String Color;
    private String Marca;
    private String Matricula;
    private Agencia agencia;

    public Vehiculo(int ID, String Color, String Marca, String Matricula, Agencia agencia) {
        this.ID = ID;
        this.Color = Color;
        this.Marca = Marca;
        this.Matricula = Matricula;
        this.agencia = agencia;
    }

    public Vehiculo(int ID, String Color, String Marca, String Matricula) {
        this.ID = ID;
        this.Color = Color;
        this.Marca = Marca;
        this.Matricula = Matricula;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public Vehiculo() {
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    
    
}
