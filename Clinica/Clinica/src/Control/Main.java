
package Control;

import Modelo.Proceso;
import Vista.InOut;

public class Main {
    
     private static int claveAdmin,claveRec,claveMedico;
     private static String nombre;

    public static void main(String[] args) {
        
        boolean bandAdmin = false, bandRec= false, bandMedico = false;
        InOut ioData = new InOut();
        Proceso proceso = new Proceso();
        
        int opc,claveCom;
        
         do{
            opc=ioData.solicitarEntero("Bienvenido al menú principal. "+
                                        "1.Menú Administrador "+
                                        "2.Menú Recepción "+
                                        "3.Menú Médico "+
                                        "4.Salir "+ 
                                        "\n\n.Digite la opción que desee ");
        switch(opc){
            case 1:
               if(bandAdmin == false){
                   claveCom=ioData.solicitarEntero("Ingrese la clave del administrador: ");
                   claveAdmin = claveCom;
                   String nombreH = ioData.solicitarNombre("Digite el nombre del hospital: ");
                   nombre = nombreH;
                   bandAdmin = true;
               } else {
                    claveCom=ioData.solicitarEntero("Ingrese la clave del administrador: ");
                    while(claveAdmin != claveCom){
                   claveCom=ioData.solicitarEntero("Ingrese la clave del administrador correctamente: ");
                    }
                    proceso.menuAdministrador();
               }
               
               break;
            case 2: 
                
                if(bandRec == false){
                   claveCom=ioData.solicitarEntero("Ingrese la clave de la recepción: ");
                   claveRec = claveCom;
                   bandRec = true;
               } else {
                    claveCom=ioData.solicitarEntero("Ingrese la clave de la recepción ");
                    while(claveRec != claveCom){
                   claveCom=ioData.solicitarEntero("Ingrese la clave de la recepción correctamente: ");
                    }
                    
               }
               
               break;
                
            case 3:
                
                if(bandMedico == false){
                   claveCom=ioData.solicitarEntero("Ingrese la clave del personal de medicina: ");
                   claveMedico = claveCom;
                   bandMedico = true;
               } else {
                    claveCom=ioData.solicitarEntero("Ingrese la clave del personal de medicina: ");
                    while(claveMedico != claveCom){
                   claveCom=ioData.solicitarEntero("Ingrese la clave del personal de medicina correctamente: ");
                    }
                    proceso.menumedico();
               }
               
               break;
                
                default: ioData.mostrarResultado("OPCION NO VALIDA, DIGITE NUEVAMENTE UNA OPCION");
            } 
          
        }while(opc!=2);
        
    }

    public static int getClaveAdmin() {
        return claveAdmin;
    }

    public static void setClaveAdmin(int claveAdmin) {
        Main.claveAdmin = claveAdmin;
    }

    public static int getClaveMedico() {
        return claveMedico;
    }

    public static void setClaveMedico(int claveMedico) {
        Main.claveMedico = claveMedico;
    }

    public static String getNombre() {
        return nombre;
    }
    

}
