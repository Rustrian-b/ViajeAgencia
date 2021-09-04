package parcial1;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Parcial1 {

    public static int seleccion() {
        int opcion = 0;
        
        do 
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar cliente\n" + "2. Agendar Reserva\n" + "3. Registrar vehicluo\n" + "4. Generar agencia\n" + "5. Salir del menu\n" + "¿Que opcion eliges?", "Menu principal de aplicacion", JOptionPane.INFORMATION_MESSAGE));
            
            if (opcion < 0 || opcion > 5)
            {
                JOptionPane.showMessageDialog(null,"Opcion Invalida, por favor seleccione una opcion valida.");
            }
            
        }while(opcion < 0 || opcion > 5);
                
        return opcion;
    }
    
     public static void main(String[] args) {
        int opcionMenu;
        
        Cliente pCliente;
        int pIdC;
        String pNombre;
        int pDpi;
        int pTelefono;
        String pCorreo;
        String pReservaCliente;
        Cliente pAval;
        ArrayList<Cliente> aCliente = new ArrayList();
        
        Reserva pReserva;
        int pIdR;
        String pInicio;
        String pFinal;
        float pPrecio;
        String pEstado;
        String pEntregado;
        Cliente pClienteR;
        Vehiculo pVehiculoR;
        ArrayList<Reserva> aReserva = new ArrayList();
        
        Vehiculo pVehiculo;
        int pIdV;
        String pColor;
        String pMarca;
        String pMatricula;
        Agencia aAgencia1;
        ArrayList<Vehiculo> aVehiculo = new ArrayList();
              
        Agencia pAgencia;
        int pIdA;
        String pLocacion;
        Reserva aReservaA;
        ArrayList<Agencia> aAgencia = new ArrayList();
        
        do
        {
            opcionMenu = seleccion();
            switch(opcionMenu)
            {
                case 1: 
                    pIdC = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del nuevo cliente", " ", JOptionPane.QUESTION_MESSAGE));
                    pNombre = JOptionPane.showInputDialog(null, "Ingrese Nombre del cliente : ", " ", JOptionPane.QUESTION_MESSAGE);
                    pDpi = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese DPI: ", " ", JOptionPane.QUESTION_MESSAGE));
                    pTelefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de telefono", " ", JOptionPane.QUESTION_MESSAGE));
                    pCorreo = JOptionPane.showInputDialog(null, "Ingrese correo electronico: "," ", JOptionPane.QUESTION_MESSAGE);                  
                    pCliente = new Cliente();
                    pCliente.setID(pIdC);
                    pCliente.setNombre(pNombre);
                    pCliente.setDpi(pDpi);
                    pCliente.setTelefono(pTelefono);
                    pCliente.setCorreo(pCorreo);
                    
                    if(!aReserva.isEmpty()){
                        String cReserva = "";
                        int cCuencia = 0;
                        for(Reserva cR : aReserva)
                        {
                            cCuencia = cCuencia +1;
                            cReserva = cReserva + cCuencia + "-" + cR.getID() + "\n";
                        }
                        cReserva = cReserva + "Eliga el numero de reservacion que desea anexar a este cliente";
                        cCuencia = Integer.parseInt(JOptionPane.showInputDialog(null, cReserva, " ", JOptionPane.QUESTION_MESSAGE));
                        pReserva = aReserva.get(cCuencia - 1);
                        pCliente.setReservas(pReserva);
                        
                        aCliente.add(pCliente);
                        aCliente.forEach((c)->{
                        JOptionPane.showMessageDialog(null, "ID: "+ c.getID() + "\n"+"Nombre: " + c.getNombre() + "\n" +"DPI: "+ c.getDpi() + "\n"+"Telefono: " + c.getTelefono() + "\n"+"Correo: " + c.getCorreo() + "\n"+ "Reservacion asociada: " +c.getReservas()+ "\n");
                        });
                    }else{
                        aCliente.add(pCliente);
                        aCliente.forEach((c)->{
                        JOptionPane.showMessageDialog(null, "ID: " + c.getID() + "\n" + "Nombre: " +c.getNombre() + "\n" + "DPI: " + c.getDpi() + "\n"+ "Telefono: " + c.getTelefono() + "\n" + "Correo: " + c.getCorreo() +"\n");
                        });
                    }
                    break;
                case 2: 
                    pIdR = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID de la reservacion: ", " ", JOptionPane.QUESTION_MESSAGE));
                    pInicio = JOptionPane.showInputDialog(null, "Ingrese la fecha de inicio de la reservacion: ", " ", JOptionPane.QUESTION_MESSAGE);
                    pFinal = JOptionPane.showInputDialog(null, "Ingrese la fecha del final de la reservacion: ", " ", JOptionPane.QUESTION_MESSAGE);
                    pPrecio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el costo de la reserva", " ", JOptionPane.QUESTION_MESSAGE));
                    pEstado = JOptionPane.showInputDialog(null, "Ingrese el estado del vehiculo: ", " ", JOptionPane.QUESTION_MESSAGE);
                    pEntregado = JOptionPane.showInputDialog(null, "Ingrese si el auto ya fue entregado o no ", " ", JOptionPane.QUESTION_MESSAGE);
                    pReserva = new Reserva();
                    pReserva.setID(pIdR);
                    pReserva.setInicio(pInicio);
                    pReserva.setFin(pFinal);
                    pReserva.setPrecio(pPrecio);
                    pReserva.setEstado(pEstado);
                    pReserva.setEntregado(pEntregado);
                    
                    if(!aCliente.isEmpty()){
                        String rCliente = "";
                        int rCecuencia = 0;
                        for(Cliente cC : aCliente)
                        {
                            rCecuencia = rCecuencia + 1;
                            rCliente = rCliente + rCecuencia + " - " + cC.getID() + "\n";
                        }
                        rCliente = rCliente + "Eliga el ID de cliente asociado a esta reservacion";
                        rCecuencia = Integer.parseInt(JOptionPane.showInputDialog(null, rCliente, " ", JOptionPane.QUESTION_MESSAGE));
                        pClienteR = aCliente.get(rCecuencia - 1);
                        pReserva.setCliente(pClienteR);                        
                    }
                    if(!aVehiculo.isEmpty()){
                        String rVehiculo = "";
                        int rCecuencia1 = 0;
                        for(Vehiculo cV : aVehiculo)
                        {
                            rCecuencia1 = rCecuencia1 + 1;
                            rVehiculo = rVehiculo + rCecuencia1 + " - " + cV.getID() + "\n";
                        }
                        rVehiculo = rVehiculo + "Eliga ID del vehiculo aosciado a esta reservacion";
                        rCecuencia1 = Integer.parseInt(JOptionPane.showInputDialog(null, rVehiculo, " ", JOptionPane.QUESTION_MESSAGE));
                        pVehiculoR = aVehiculo.get(rCecuencia1 - 1);
                        pReserva.setVehiculo(pVehiculoR);
                    }
                    aReserva.add(pReserva);
                    aReserva.forEach((r)->{
                        JOptionPane.showMessageDialog(null,"ID: "+ r.getID() + "\n"+ "Inicio reservacion: " + r.getInicio() + "\n" + "Fin de la reservacion: " + r.getFin() + "\n" + "Precio: " +r.getPrecio() + "\n" + "Estado: " + r.getEstado() + "\n" + "Entregado: " +r.getEntregado() + "\n" + "Cliente asociado: " +r.getCliente() + "\n" + "vehiculo asociado: "+r.getVehiculo()+ "\n");
                    });
                    
                    break;
                case 3:
                    pIdV = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del nuevo Vehiculo: ", " ", JOptionPane.QUESTION_MESSAGE));
                    pColor = JOptionPane.showInputDialog(null, "Ingrese el color del vehiculo: ", " ", JOptionPane.QUESTION_MESSAGE);
                    pMarca = JOptionPane.showInputDialog(null, "Ingrese la marca del vehiculo: ", " ", JOptionPane.QUESTION_MESSAGE);
                    pMatricula = JOptionPane.showInputDialog(null, "Ingrese la matricula del vehiculo: ", " ", JOptionPane.QUESTION_MESSAGE);
                    pVehiculo = new Vehiculo();
                    pVehiculo.setID(pIdV);
                    pVehiculo.setColor(pColor);
                    pVehiculo.setMarca(pMarca);
                    pVehiculo.setMatricula(pMatricula);
                    if(!aAgencia.isEmpty()){
                        String vAgencia= "";
                        int vSecuencia = 0;
                        for(Agencia aV : aAgencia)
                        {
                            vSecuencia = vSecuencia + 1;
                            vAgencia = vAgencia + vSecuencia + " - " + aV.getID() + "\n";
                        }
                        vAgencia = vAgencia + "Eliga la agencia asociada al vehiculo";
                        vSecuencia = Integer.parseInt(JOptionPane.showInputDialog(null, vAgencia, " ", JOptionPane.QUESTION_MESSAGE));
                        aAgencia1 = aAgencia.get(vSecuencia - 1);
                        pVehiculo.setAgencia(aAgencia1);
                        
                        aVehiculo.add(pVehiculo);
                        aVehiculo.forEach((v)->{
                            JOptionPane.showMessageDialog(null,"ID: "+v.getID() + "\n" + "Color: " +v.getColor() + "\n" + "Marca: " +v.getMarca() + "\n" + "Matricula: " +v.getMatricula()+ "\n" + "Agencia asignada: " + v.getAgencia() + "\n");
                        });
                    }else{
                        aVehiculo.add(pVehiculo);
                        aVehiculo.forEach((v)->{
                            JOptionPane.showMessageDialog(null,"ID: "+v.getID() + "\n"+"Color: " + v.getColor() + "\n" +"Marca: " +v.getMarca() + "\n" + "Matricula: " + v.getMatricula());
                        });                        
                    }                                   
                    break;
                case 4:
                    pIdA = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID de la nueva agencia: ", " ", JOptionPane.QUESTION_MESSAGE));
                    pLocacion = JOptionPane.showInputDialog(null, "Ingrese la direccion de la nueva agencia: ", " ", JOptionPane.QUESTION_MESSAGE);
                    pAgencia = new Agencia();
                    pAgencia.setID(pIdA);
                    pAgencia.setLocacion(pLocacion);
                    if(!aReserva.isEmpty()){
                        String lReserva = "";
                        int lCecuencia = 0;
                        for(Reserva aR : aReserva)
                        {
                            lCecuencia = lCecuencia + 1;
                            lReserva = lReserva + lCecuencia + " - " + aR.getID() + "\n";
                        }
                        lReserva = lReserva + "Eliga ID de la reservacion asociada a la agencia";
                        lCecuencia = Integer.parseInt(JOptionPane.showInputDialog(null, lReserva, " ", JOptionPane.QUESTION_MESSAGE));
                        aReservaA = aReserva.get(lCecuencia -1);
                        pAgencia.setReserva(aReservaA);
                        
                        aAgencia.add(pAgencia);
                        aAgencia.forEach((a)->{
                        JOptionPane.showMessageDialog(null,"ID: "+a.getID() + "\n"+"Direccion: " + a.getLocacion() + "\n" + "Reservaciones asociadas: "+a.getReserva() + "\n");
                        });
                    }else{
                        aAgencia.add(pAgencia);
                        aAgencia.forEach((a)->{
                        JOptionPane.showMessageDialog(null,"ID: "+a.getID() + "\n"+ "Direccion: " + a.getLocacion());
                        });
                    }                                   
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Gracias vuelva pronto");  
                    break;
                default: 
                    JOptionPane.showMessageDialog(null,"You should not be reading this xd");  
                    break;
            }
        }while(opcionMenu != 5);
        
    }
    
}
