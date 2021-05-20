import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FacturaProductosDos {

	public static void main(String[] args) {
		final String FECHA = fecha();
		String nombre,domicilio,producto = null;
		String linea="";
		int cantidad = 0,precio = 0,cuantosProductos,totalBruto = 0;
		int i = 0;
		double IVA = 0,total = 0,subTotal = 0;
		
		nombre = stringPorTeclado("Ingrese su nombre:");
		domicilio = stringPorTeclado("Ingrese su domicilio:");
		
		cuantosProductos = intPorTeclado("ingrese cuantos productos tiene:");
		
		while(i < cuantosProductos) {
			producto = stringPorTeclado("Ingrese nombre del producto;");
			cantidad = intPorTeclado("Ingrese la cantidad de productos que lleva:");
			precio = intPorTeclado("Ingrese precio del producto:");
			totalBruto = precio * cantidad;
			linea = lineaDeProducto(precio,cantidad,totalBruto,producto,linea);
			subTotal = totalBruto;
			i++;
		}
		
		factura(nombre,domicilio,linea,IVA,total,subTotal,precio,cantidad,totalBruto,producto);

	}
	public static String fecha() {
		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String imprimirFecha = sdf.format(fecha);
		return imprimirFecha;
	}
	
	public static String stringPorTeclado (String mensaje) {
		Scanner scan = new Scanner(System.in);
		System.out.println(mensaje);
		String info = scan.nextLine();
		return info;
	}
	
	public static int intPorTeclado(String mensaje) {
		Scanner scan = new Scanner(System.in);
		System.out.println(mensaje);
		int valor = scan.nextInt();
		return valor;
	}
	
	public static String lineaDeProducto(int precio, int cantidad, double subTotal, String producto, String linea) {
		
		linea += (String.format("%s		| %s				| $%s 			| $%s	", cantidad, producto, precio, subTotal)
				+ "\n------------------------------------------------------------------------------------\n");
	
		return linea;
	}

	public static void cuentas(double IVA, double total, double subtotal, int totalBruto) {
		IVA = subtotal * 0.21;
		total = subtotal + IVA;
		
		System.out.println("IVA: " + IVA);
		System.out.println("Subtotal (sin IVA): " + subtotal);
		System.out.println("Total: " + total);
		
	}
	
public static void factura(String nombre, String domicilio, String linea, double IVA, double total, double subtotal, int precio, int cantidad, int totalBruto, String producto) {
		
		System.out.println("FACTURA: ");
		System.out.println("************************************************************************************");
		System.out.println(String.format("Fecha: %s", fecha()));
		System.out.println("************************************************************************************");
		System.out.println("Nombre: " + nombre);
		System.out.println("Domicilio: " + domicilio);
		System.out.println("************************************************************************************");
		System.out.println("Cantidad	| Descripcion			| Precio por Unidad | Precio Total	");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(linea);	
		cuentas(IVA, total, subtotal, totalBruto);
		System.out.println("************************************************************************************");
	}
}

