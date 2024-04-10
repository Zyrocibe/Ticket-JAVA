//Code made by Santiago Jaramillo 
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidad, opcion=0;
        long cc;
        double[] vector = new double[21];
        double precio, subtotal, impuesto, acumTotal, operacion = 0;
        String[] producto = new String[21];
        String nombre;

        //Damos la bienvenida al usuario y pedimos datos basicos, nombre y CC
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL SISTEMA DE FACTURACION. ");
        nombre= JOptionPane.showInputDialog("Ingrese el nombre de usuario. ");
        cc= Long.parseLong(JOptionPane.showInputDialog("Ingrese la CC del usuario. "));

        //Vamos a usar for para iterar en el vector y así tomar hasta un MAXIMO de 20 productos con precio y nombre
        for (int i=0; i<21; i++){
            //En el while pedimos valores de: Producto, cantidad y precio. Añadimos una opción para salir del bucle
            while(opcion!=2){
                producto[i] =JOptionPane.showInputDialog(null, "Ingrese el producto que desea: ");

                cantidad =Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " + producto[i] + " que desea: "));

                precio =Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de " + producto[i] + "."));

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, " Si desea facturar algun otro item, digite 1, Si ya termino de hacer su facturacion digite 2"));
                
                //calculamos los valores de impuesto, subtotal y acumTotal, además asignamos que el vector[i] tome el valor de acumTotal
                impuesto= (precio*cantidad) * 0.19;
                subtotal = (precio * cantidad);
                acumTotal=subtotal + impuesto;
                vector[i]=acumTotal;
                //sumamos el acumTotal de todos los productos para obtener el valor total de todos ellos. 
                operacion += vector[i];
            } 
            
                //Damos los resultados al usuario y rompemos el for ya que no lo vamos a necesitar más. 
                JOptionPane.showMessageDialog(null,"La compra realizada por " + nombre + " identificad@ con la CC " + cc + " tiene un valor total de: " + operacion);
                break;
        }
    }
}
