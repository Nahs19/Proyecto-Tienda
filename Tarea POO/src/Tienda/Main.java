package Tienda;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;


public class Main {

    public static Fecha f1 = new Fecha();
    public static Scanner in = new Scanner(System.in);
    
    public static void definirFecha(){
        f1.setDia(18);
        f1.setMes(6);
        f1.setAnio(2020);
    }
    
    public static void Adelantar(){
        int diaActual = f1.getDia();
        int mesActual = f1.getMes();
        int anioActual = f1.getAnio();
        
        Calendar oFecha = Calendar.getInstance();
        oFecha.set(anioActual, mesActual, diaActual);
               
        oFecha.add(Calendar.DAY_OF_MONTH, f1.getDia());
        oFecha.add(Calendar.MONTH, f1.getMes());
        oFecha.add(Calendar.YEAR, f1.getAnio());
        
        f1.setAnio(oFecha.get(Calendar.YEAR));
        f1.setMes(oFecha.get(Calendar.MONTH));
        f1.setDia(oFecha.get(Calendar.DAY_OF_MONTH)+5);   
    }
    
    public static String imprimirFecha(){
        return "\nDia: "+f1.getDia()+
                "\nMes: "+f1.getMes()+
                "\nAnio: "+f1.getAnio();
    }
    
    public static void main(String[] args) {
        
        Productos producto = new Productos();
        
        LocalDate date = LocalDate.of(2020, 6, 18);
        LocalDate newDate = date.plusDays(10);
        
        char opc = 0;
        String respuesta;
        producto.setIVA(0.09f);
        producto.setPrecio(6.0f);
        do{
            System.out.print("\n Ingresar nombre del producto: "); 
            producto.setNombreProducto(in.next());
            System.out.println("\n Generando codigo para dicho producto...");
            System.out.println("\n Codigo de "+ producto.getNombreProducto()+" es: "+ producto.codigoProducto());
            
            System.out.println("Su fecha de elaboracion "+ producto.getNombreProducto()+" es: ");
             
            if(opc == 'S'||opc == 's'){
                System.out.println(newDate);
            }
            else{
                System.out.println(date);
            }
            
            System.out.println("\n El IVA implementado por el gobierno es: "+ producto.getIVA());
            
            System.out.println("\n Muetra del precio: ");
            System.out.println("\n Precio sin IVA de " + producto.getNombreProducto() + " es: " + producto.getPrecio());
            System.out.println("\n El precio total de " + producto.getNombreProducto() +" es: " + producto.precioTotal());
            
            System.out.print("\n\n Desea realizar la compra de este producto: " + producto.getNombreProducto() +" ? (Si/No)"); 
            respuesta = in.next();
            
            if("si".equals(respuesta)){
                System.out.println("\n Ha realizado la compra del producto: "+ producto.getNombreProducto());
            }
            else{
                System.out.println("\n No ha deseado comprar el producto: "+ producto.getNombreProducto());
            }
            
            System.out.print("\n\nDesea ingresar otro producto? (Si/No): ");
            opc = in.next().charAt(0);
        }while(opc == 'S'|| opc == 's');
        
        
    }
    
}