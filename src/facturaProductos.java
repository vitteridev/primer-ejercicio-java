import java.util.Scanner;

public class facturaProductos {

	public static void main(String[] args) {
		final int CANTIDAD = 2;
		final int VALORUNITARIOPROD1 = 249;
		final int VALORUNITARIOPROD2 = 139;
		final String DESCRIPCION1 = "fideos Lorem";
		final String DESCRIPCION2 = "fideos Ipsum";
		final String DOMICILIO = "calle falsa 123";
		
		Scanner scan = new Scanner(System.in);
		
		int valorSubTotalProductos,
			valorTotalProd1,
			valorTotalProd2;
		
		double iva,
			   valorTotalProductos;
		
		String nombre,
			   fecha;
		
		System.out.println("Ingrese su nombre:");
		nombre = scan.nextLine();
		
		System.out.println("Ingrese la fecha:");
		fecha = scan.nextLine();
		
		valorTotalProd1 = VALORUNITARIOPROD1 + CANTIDAD;
		valorTotalProd2 = VALORUNITARIOPROD2 + CANTIDAD;
		valorSubTotalProductos = valorTotalProd1 + valorTotalProd2;
		iva = valorSubTotalProductos * 0.21;
		valorTotalProductos = valorSubTotalProductos + iva;
		
		System.out.println("*********************************************");
		System.out.println("Fecha: " + fecha);
		System.out.println("*********************************************");
		System.out.println("Nombre: " + nombre);
		System.out.println("*********************************************");
		System.out.println("Domicilio: " + DOMICILIO);
		System.out.println("*********************************************");
		System.out.println("Cant. / Descripcion        / P.Unit / P.Total");
		System.out.println("  " + CANTIDAD + "   / " + DESCRIPCION1 + "       / " + VALORUNITARIOPROD1 + "    / " + valorTotalProd1);
		System.out.println("---------------------------------------------");
		System.out.println("  " + CANTIDAD + "   / " + DESCRIPCION2 + "       / " + VALORUNITARIOPROD2 + "    / " + valorTotalProd2);
		System.out.println("---------------------------------------------");
		System.out.println("IVA: " + iva);
		System.out.println("Subtotal(sin IVA): " + valorSubTotalProductos);
		System.out.println("Total: " + valorTotalProductos);
	}

}
