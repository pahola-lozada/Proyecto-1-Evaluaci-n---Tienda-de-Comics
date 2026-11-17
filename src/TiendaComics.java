import java.util.Scanner;

public class TiendaComics {

	public static void main(String[] args) {
		// Proyecto 1ª Evaluacion.
		
		String opcion;
		Scanner sc = new Scanner (System.in);
		
		String comics [][] = new String [100][100];
		String clientes [][] = new String [100][100];
		String empleados [][] = new String [100][100];
		String ventas [][] = new String [100][100];
		String alquiler [][] = new String [100][100];
		do {
			opcion = MenuPrincipal(sc);
			menuOpciones(opcion,sc,comics, clientes, empleados, ventas, alquiler);
		}while(!opcion.equals("0"));	
	}
				
		public static String MenuPrincipal(Scanner sc) {
			System.out.println("=== TIENDA DE COMICS ===");
			System.out.println("1. Gestionar comics");
	        System.out.println("2. Gestionar clientes");
	        System.out.println("3. Gestionar empleados");
	        System.out.println("4. Registrar y mostrar ventas");
	        System.out.println("5. Registrar y mostrar alquiler");
	        System.out.println("0. Salir");
	        return sc.nextLine();
		}
	           
	     public static void menuOpciones(String opcion, Scanner sc,String[][] comics, String[][] clientes, String[][] empleados, String[][] ventas, String[][] alquiler) {
	           switch (opcion) {
               case "1": menuComics(comics,sc); 
               		break;
               case "2": menuClientes(clientes,sc); 
               		break;
               case "3": menuEmpleados(empleados,sc); 
               		break;
               case "4": menuVentas(ventas,comics,clientes,sc); 
               		break;
               case "5": menuAlquileres(alquiler,comics,clientes,sc); 
               		break;
               case "0": System.out.println("Programa finalizado."); 
               		break;
               default: System.out.println("Opcion no valida.");
           }
		}

	public static void menuComics(String [][] comics, Scanner sc) {
		String opcion;
		do {
			System.out.println("=== GESTION DE COMICS ===");
			System.out.println("1. Agregar cómic");
			System.out.println("2. Mostrar cómics");
			System.out.println("3. Buscar cómic");
			System.out.println("4. Eliminar cómic");
			System.out.println("0. Volver");
			opcion = sc.nextLine();
		 switch (opcion) {
         case "1": registrarComic(comics, sc); 
         	break;
         case "2": mostrarComics(comics, opcion, sc); 
         	break;
         case "3": buscarComic(comics, "", sc); 
         	break;
         case "4": eliminarComic(comics, opcion, sc);
         	break;
         case "0": System.out.println("Saliendo del sistema...Hasta luego!");
        	 break;
         default: System.out.println("Opcion no valida.");
		 }
		}while(!opcion.equals("0"));
	}
	public static void menuClientes(String [][] clientes, Scanner sc) {
		String opcion;
		do {
			System.out.println("=== GESTION DE CLIENTES ===");
			System.out.println("1. Agregar cliente");
			System.out.println("2. Buscar cliente");
			System.out.println("3. Mostrar clientes");
			System.out.println("4. Eliminar cliente");
			System.out.println("0. Volver");
			opcion = sc.nextLine();
		switch (opcion) {
		case "1": registrarCliente(clientes, sc);
			break;
		case "2": buscarCliente(clientes,"", sc);
			break;
		case "3": mostrarClientes(clientes,opcion, sc);
			break;
		case "4": eliminarCliente(clientes,opcion, sc);
			break;
		case "0": System.out.println("Saliendo del sistema...Hasta luego!");
			break;
		default:  System.out.println("Opcion no valida.");
		}
		}while(!opcion.equals("0"));
	}
	public static void menuEmpleados(String [][] empleados, Scanner sc) {
		String opcion;
		do {
			System.out.println("=== GESTION DE EMPLEADOS ===");
			System.out.println("1. Agregar empleado");
			System.out.println("2. Buscar empleado");
			System.out.println("3. Mostrar empleados");
			System.out.println("4. Eliminar empleado");
			System.out.println("0. Volver");
			opcion = sc.nextLine();
		switch (opcion) {
		case "1":registrarEmpleados(empleados, sc);
			break;
		case "2": buscarEmpleado(empleados,"", sc);
			break;
		case "3": mostrarEmpleados(empleados,opcion, sc);
			break;
		case "4": eliminarEmpleado(empleados,opcion, sc);
			break;
		case "0":System.out.println("Volviendo al menú principal...");
			break;
		default:System.out.println("Opcion no valida.");
		}
		}while(!opcion.equals("0"));
	}
	public static void menuVentas(String [][] ventas, String [][] comics, String [][] clientes,Scanner sc) {
		String opcion;
		do {
			System.out.println("=== VENTAS ===");
			System.out.println("1. Realizar venta");
			System.out.println("2. Buscar venta");
			System.out.println("3. Mostrar ventas");
			System.out.println("4. Eliminar venta");
			System.out.println("0. Volver");
			opcion = sc.nextLine();
		switch (opcion) {
		case "1": realizarVenta(ventas, comics, clientes, " ", sc);
			break;
		case "2": buscarVenta(ventas,"", sc);
			break;
		case "3": mostrarVentas(ventas,opcion, sc);
			break;
		case "4": eliminarVenta(ventas,comics,opcion, sc);
			break;
		case "0":System.out.println("Saliendo del sistema...Hasta luego!");
			break;
		default:System.out.println("Opcion no valida.");
		}
		}while(!opcion.equals("0"));
	}
	public static void menuAlquileres (String [][] alquiler, String [][] comics,String [][] clientes, Scanner sc) {
		String opcion;
		do {
			System.out.println("=== ALQUILERES ===");
			System.out.println("1. Realizar alquiler");
			System.out.println("2. Buscar alquiler");
			System.out.println("3. Mostrar alquileres");
			System.out.println("4. Eliminar alquiler");
			System.out.println("0. Volver");
			opcion = sc.nextLine();
		switch(opcion) {
		case "1": realizarAlquiler(alquiler,comics,clientes,opcion, sc);
			break;
		case "2":buscarAlquiler(alquiler,opcion,"", sc);
			break;
		case "3":mostrarAlquileres(alquiler,opcion, sc);
			break;
		case "4":eliminarAlquiler(alquiler,comics,opcion, sc);
			break;
		case "0": System.out.println("Saliendo del programa...Hasta luego");
			break;
		default: System.out.println("Opcion no valida");	
		}
		}while(!opcion.equals("0"));
	}
	
	// MENU DE COMICS
	
	public static boolean comprobarReferenciaComic(String[][] comics, String isbn) {
		boolean existe = false;
		for(int i = 0; i < comics.length; i++) {
			if(comics [i][0] != null && comics [i][0].equals(isbn)) {
			existe = true;
			break;
			}
		}
		return existe;
	}
	public static boolean comprobarDisponibilidad(String[][] comics, String isbn) {
		boolean disponible = false;
		for(int i = 0; i < comics.length; i++) {
			if(comics [i][0] != null && comics [i][0].equals(isbn) && comics[i][8].equals("Disponible")) {
				disponible = true;
				break;
			}
		}
		return disponible;
	}
	public static void registrarComic(String[][]comics, Scanner sc){
		String isbn;
		System.out.println("Ingrese el ISBN del cómic: ");
		isbn = sc.nextLine();
		
		if(comprobarReferenciaComic(comics, isbn)) {
			System.out.println("El ISBN ya existe, no se puede insertar");
		}
		else {
			if(agregarComic(comics, isbn, sc)) {
				System.out.println("Cómic registrado exitosamente");
			}
			else {
				System.out.println("No se puede registrar el cómic. No hay espacio disponible");
			}
		}
	}
	public static boolean agregarComic (String [][]comics, String isbn, Scanner sc) {
		boolean agregar = false;
		for(int i = 0; i< comics.length; i++) {
			if(comics [i][0] == null) {
				comics[i][0] = isbn;
				System.out.println("Ingrese el título del cómic: ");
				comics[i][1] = sc.nextLine();
				System.out.println("Ingrese el número de cómic: ");
				comics[i][2] = sc.nextLine();
				System.out.println("Ingrese la fecha de publicación del cómic: ");
				comics[i][3] = sc.nextLine();
				System.out.println("Ingrese la editorial del cómic: ");
				comics[i][4] = sc.nextLine();
				System.out.println("Ingrese el tipo de cómic (Occidental, Manga, Manhua, Manhwa: ");
				comics[i][5] = sc.nextLine();
				System.out.println("Ingrese el tipo de formato del cómic (Físico o Digital: ");
				comics[i][6] = sc.nextLine();
				System.out.println("Ingrese el precio de venta: ");
				comics[i][7] = sc.nextLine();
				comics[i][8] = "Disponible";
				agregar = true;
				break;	
			}
		}
		return agregar;
	}
	public static void mostrarComics (String [][] comics, String opcion, Scanner sc) {
		System.out.println("Cómics disponibles");
		for(int i = 0; i < comics.length; i++) {
			if(comics[i][0] != null) {
				System.out.println("ISBN: " + comics[i][0]);
				System.out.println("Título: " + comics[i][1]);
				System.out.println("Número: " + comics[i][2]);
				System.out.println("Fecha de publicación: " + comics[i][3]);
				System.out.println("Editorial: " + comics[i][4]);
				System.out.println("Tipo de cómic (Occidental, Manga, Manhua, Manhwa): "+ comics[i][5]);
				System.out.println("Tipo de formato (Físico o Digital: "+ comics[i][6]);
				System.out.println("Precio de venta: "+ comics[i][7]);	
				System.out.println("===================");
			}
		}		
	}
	public static void buscarComic (String [][]comics, String isbn, Scanner sc) {
		System.out.println("Introduce el ISBN: ");
		 isbn = sc.nextLine();
		 boolean encontrado = false;
		 for(int i=0;i < comics.length;i++) {
		 if (comics[i][0]!= null && comics [i][0].equals(isbn)){
			 encontrado = true;
			 System.out.println("Cómic encontrado: ");
			 System.out.println("ISBN: " +  comics [i][0]);
			 System.out.println("Titulo: " +  comics [i][1]);
			 System.out.println("Número: " + comics[i][2]);
			 System.out.println("Fecha de publicación: " + comics[i][3]);
			 System.out.println("Editorial: " + comics[i][4]);
			 System.out.println("Tipo de cómic (Occidental, Manga, Manhua, Manhwa: "+ comics[i][5]);
			 System.out.println("Tipo de formato (Físico o Digital: "+ comics[i][6]);
			 System.out.println("Precio de venta: "+ comics[i][7]);
			 break;
		 	}
		 }
		 if(!encontrado) {
			 System.out.println("No se ha encontrado ningún cómic con ese ISBN");
		 }
	}
	public static void eliminarComic (String [][] comics, String opcion, Scanner sc) {
		System.out.println("Introduce el ISBN del cómic a eliminar: ");
		String isbn = sc.nextLine();
		boolean encontrado = false;
		for(int i=0;i < comics.length;i++) {
			if (comics[i][0]!= null &&  comics [i][0].equals(isbn)) {
				encontrado = true;
				System.out.println("Cómic encontrado: ");
				System.out.println("ISBN: " +  comics [i][0]);
				System.out.println("Titulo: " +  comics [i][1]);
				System.out.println("Número: " + comics[i][2]);
				System.out.println("Fecha de publicación: " + comics[i][3]);
				System.out.println("Editorial: " + comics[i][4]);
				System.out.println("Tipo de cómic (Occidental, Manga, Manhua, Manhwa: "+ comics[i][5]);
				System.out.println("Tipo de formato (Físico o Digital: "+ comics[i][6]);
				System.out.println("Precio de venta: "+ comics[i][7]);
				
				for(int j = 0; j < comics[i].length; j++) {
					comics[i][j] = null;
				}
				System.out.println("Cómic eliminado correctamente");
				break;
			}
		}
		if(!encontrado) {
			System.out.println("No se ha encontrado ningún cómic con ese ISBN");
		}
	}	
	// MENU CLIENTES
	
	public static boolean comprobarReferenciaCliente(String[][] clientes, String dni) {
		boolean existe = false;
		for(int i = 0; i < clientes.length;i++) {
			if(clientes [i][0] != null && clientes [i][0].equals(dni)) {
			existe = true;
			break;
			}
		}
		return existe;
	}
	public static void registrarCliente(String[][] clientes, Scanner sc){
		String dni;
		System.out.println("Ingrese el DNI del cliente: ");
		dni = sc.nextLine();
		
		if(comprobarReferenciaCliente(clientes, dni)) {
			System.out.println("El DNI ya existe, no se puede insertar");
		}
		else {
			if(agregarCliente(clientes,dni, sc)) {
				System.out.println("Cliente registrado exitosamente");
			}
			else {
				System.out.println("No se puede registrar el cliente. No hay espacio disponible");
			}
		}
	}
	public static boolean agregarCliente (String [][] clientes, String dni, Scanner sc) {
		boolean agregar = false;
		for(int i = 0; i < clientes.length; i++) {
			if (clientes[i][0] == null) {
				clientes[i][0] = dni;			
				System.out.println("Introduce el nombre del cliente: ");
				clientes [i][1] = sc.nextLine();
				System.out.println("Introduce los apellidos del cliente: ");
				clientes [i][2] = sc.nextLine();
				System.out.println("Introduce el télefono del cliente: ");
				clientes [i][3] = sc.nextLine();
				System.out.println("Introduce el email del cliente: ");
				clientes [i][4] = sc.nextLine();
				System.out.println("Introduce la dirección del cliente: ");
				clientes [i][5] = sc.nextLine();
				agregar = true;
				break;
			}
		}
		return agregar;
	}
	public static void buscarCliente (String [][] clientes, String dni, Scanner sc) {
		System.out.println("Introduce el DNI: ");
		 dni = sc.nextLine();
		 boolean encontrado = false;
		 for(int i=0;i < clientes.length;i++) {
		 if (clientes [i][0]!= null && clientes [i][0].equals(dni)){
			 encontrado = true;
			 System.out.println("Cliente encontrado: ");
			 System.out.println("DNI: " +  clientes [i][0]);
			 System.out.println("Nombre: " +  clientes [i][1]);
			 System.out.println("Apellidos: " + clientes[i][2]);
			 System.out.println("Télefono: " + clientes[i][3]);
			 System.out.println("Email: " + clientes[i][4]);
			 System.out.println("Dirección: "+ clientes[i][5]);				 
		 	}
		 }
		 if(!encontrado) {
			 System.out.println("No se ha encontrado ningún cliente con ese DNI");
		 }
	}
	public static void mostrarClientes (String [][] clientes, String opcion, Scanner sc) {
		System.out.println("Clientes encontrados");
		for(int i = 0; i < clientes.length; i++) {
			if(clientes[i][0] != null ) {
				System.out.println("Cliente encontrado: ");
				System.out.println("DNI: " +  clientes [i][0]);
				System.out.println("Nombre: " +  clientes [i][1]);
				System.out.println("Apellidos: " + clientes[i][2]);
				System.out.println("Télefono: " + clientes[i][3]);
				System.out.println("Email: " + clientes[i][4]);
				System.out.println("Dirección: "+ clientes[i][5]);	
				System.out.println("===================");
			}
		}	
	}
	public static void eliminarCliente (String [][] clientes, String opcion, Scanner sc) {
		System.out.println("Introduce el DNI del cliente a eliminar: ");
		String dni = sc.nextLine();
		boolean encontrado = false;
		for(int i=0;i < clientes.length;i++) {
			if (clientes[i][0]!= null &&  clientes [i][0].equals(dni)){
				encontrado = true;
				System.out.println("Cliente encontrado: ");
				System.out.println("DNI: " +  clientes [i][0]);
				System.out.println("Nombre: " +  clientes [i][1]);
				System.out.println("Apellidos: " + clientes[i][2]);
				System.out.println("Télefono: " + clientes[i][3]);
				System.out.println("Email: " + clientes[i][4]);
				System.out.println("Dirección: "+ clientes[i][5]);
				for(int j = 0; j < clientes[i].length; j++) {
					clientes[i][j] = null;
				}
				System.out.println("Cliente eliminado correctamente");
				break;
			}
		}
		if(!encontrado) {
			System.out.println("No se ha encontrado ningún cliente con ese DNI");
		}
	}	
	// EMPLEADOS
	
	public static boolean comprobarReferenciaEmpleados(String [][]empleados, String dni) {
		boolean existe = false;
		for(int i = 0; i < empleados.length; i++) {
			if(empleados [i][0] != null && empleados [i][0].equals(dni)) {
			existe = true;
			break;
			}
		}
		return existe;
	}
	public static void registrarEmpleados(String[][] empleados, Scanner sc){
		String dni;
		System.out.println("Ingrese el DNI del empleado: ");
		dni = sc.nextLine();
		
		if(comprobarReferenciaEmpleados(empleados, dni)) {
			System.out.println("El DNI ya existe, no se puede insertar");
		}
		else {
			if(agregarEmpleado(empleados,dni, sc)) {
				System.out.println("Empleado registrado exitosamente");
			}
			else {
				System.out.println("No se puede registrar al empleado. No hay espacio disponible");
			}
		}
	}
	public static boolean agregarEmpleado (String [][] empleados, String dni, Scanner sc) {
		boolean agregar = false;
		for(int i = 0; i < empleados.length; i++) {
			if (empleados[i][0] == null) {
				empleados [i][0] = dni;			
				System.out.println("Introduce el nombre del empleado: ");
				empleados [i][1] = sc.nextLine();
				System.out.println("Introduce los apellidos del empleado: ");
				empleados [i][2] = sc.nextLine();
				System.out.println("Introduce el télefono del empleado: ");
				empleados [i][3] = sc.nextLine();
				System.out.println("Introduce el puesto del empleado: ");
				empleados [i][4] = sc.nextLine();	
				agregar = true;
				break;
			}
		}
		return agregar;
	}
	public static void buscarEmpleado (String [][] empleados, String dni, Scanner sc) {
		System.out.println("Introduce el DNI: ");
		 dni = sc.nextLine();
		 boolean encontrado = false;
		 for(int i=0;i < empleados.length;i++) {
		 if (empleados [i][0]!= null && empleados [i][0].equals(dni)){
			 encontrado = true;
			 System.out.println("Empleado encontrado: ");
			 System.out.println("DNI: " +  empleados [i][0]);
			 System.out.println("Nombre: " +  empleados [i][1]);
			 System.out.println("Apellidos: " + empleados[i][2]);
			 System.out.println("Télefono: " + empleados[i][3]);
			 System.out.println("Puesto: " + empleados[i][4]);			
			 break;
		 	}
		 }
		 if(!encontrado) {
			 System.out.println("No se ha encontrado ningún empleado con ese DNI");
		 }
	}
	public static void mostrarEmpleados (String [][] empleados, String opcion, Scanner sc) {
		System.out.println("Empleados encontrados");
		for(int i = 0; i < empleados.length; i++) {
			if(empleados[i][0] != null ) {
				System.out.println("DNI: " +  empleados [i][0]);
				System.out.println("Nombre: " +  empleados [i][1]);
				System.out.println("Apellidos: " + empleados[i][2]);
				System.out.println("Télefono: " + empleados[i][3]);
				System.out.println("Puesto: " + empleados[i][4]);
				System.out.println("===================");
				}
			}
	}
	public static void eliminarEmpleado (String [][] empleados, String opcion, Scanner sc) {
		System.out.println("Introduce el DNI del empleado a eliminar: ");
		String dni = sc.nextLine();
		boolean encontrado = false;
		for(int i=0;i < empleados.length;i++) {
			if (empleados[i][0]!= null &&  empleados [i][0].equals(dni)){
				encontrado = true;
				System.out.println("Empleado encontrado: ");
				System.out.println("DNI: " +  empleados [i][0]);
				System.out.println("Nombre: " +  empleados [i][1]);
				System.out.println("Apellidos: " + empleados[i][2]);
				System.out.println("Télefono: " + empleados[i][3]);
				System.out.println("Puesto: " + empleados[i][4]);
				for(int j = 0; j < empleados[i].length; j++) {
					empleados[i][j] = null;
				}
				System.out.println("Empleado eliminado correctamente");
				break;
			}
		}
		if(!encontrado) {
			System.out.println("No se ha encontrado ningún empleado con ese DNI");
		}
	}
	// MENU VENTAS
	
	public static boolean comprobarReferenciaVentas(String [][] ventas, String ref) {
		boolean existe = false;
		for(int i = 0; i < ventas.length; i++) {
			if(ventas [i][0] != null && ventas [i][0].equals(ref)) {
			existe = true;
			break;
			}
		}
		return existe;
	}
	public static boolean ingresarVentas(String[][] ventas, String ref, Scanner sc) {
		boolean ingresado = false;
		for(int i = 0; i< ventas.length; i++) {
			if(ventas [i][0] == null) {
				ventas[i][0] = ref;
				System.out.print("Ingrese el titulo del cómic: ");
				ventas [i][1]= sc.nextLine();
				System.out.print("Ingrese el numero de cómic: ");
				ventas [i][2]= sc.nextLine();
				System.out.println("Ingrese el tipo de cómic (Occidental, Manga, Manhua, Manhwa: ");
				ventas [i][3]= sc.nextLine();
				System.out.println("Ingrese el precio del cómic: ");
				ventas [i][4]= sc.nextLine();
				ingresado = true;
				break;				
			}
		}
		return ingresado;
	}
	public static void realizarVenta (String [][] ventas, String [][] comics, String [][] clientes, String ref,Scanner sc) {
		System.out.println("Ingrese el ISBN del cómic a vender: ");
		String isbn = sc.nextLine();
		String dni;
		
		if(comprobarReferenciaComic(comics, isbn) && comprobarDisponibilidad(comics,isbn)){
			System.out.println("Ingrese el DNI del comprador: ");
			dni = sc.nextLine();
			if(!comprobarReferenciaCliente(clientes, dni)) {
			    System.out.println("El cliente no está registrado");
			    return;
			}
		for(int i = 0; i < comics.length; i ++) {
			if(comics[i][0] != null && comics[i][0].equals(isbn)) {
				boolean registrada = false;
				for(int j = 0; j < ventas.length; j++) {
				if(ventas[j][0] == null) {
					ventas[j][0] = isbn;
					ventas[j][1] = comics[i][1];
					ventas[j][2] = comics[i][2];
					ventas[j][3] = comics[i][5];
					System.out.println("Introduce la fecha: ");
					ventas[j][4] = sc.nextLine();
					ventas[j][5] = comics[i][7];
					ventas[j][6] = dni;
					comics [i][8] = "Vendido";
					registrada = true;
					System.out.println("Venta realizada correctamente");
					break;
				}
			}
			if(!registrada) {
				System.out.println("No hay espacio para registrar más ventas");
				}
				break;
			}
		}
	}
		else {
			System.out.println("El cómic no esta disponible");
		}
	}
	public static void buscarVenta (String [][] ventas, String ref, Scanner sc) {
		System.out.println("Introduce la referencia: ");
		 ref = sc.nextLine();
		 boolean encontrado = false;
		 for(int i=0;i < ventas.length;i++) {
		 if (ventas [i][0]!= null && ventas [i][0].equals(ref)){
			 encontrado = true;
			 System.out.println("Venta encontrada: ");
			 System.out.println("Referencia: " +  ventas [i][0]);
			 System.out.print("Titulo del cómic: "+ ventas [i][1]);
			 System.out.print("Número de cómic: "+ventas [i][2]);
			 System.out.println("Tipo de cómic (Occidental, Manga, Manhua, Manhwa: "+ventas [i][3]);
			 System.out.println("Fecha: " +  ventas [i][4]);
			 System.out.println("Importe: " + ventas[i][5]);
			 System.out.println("DNI del comprador: " + ventas[i][6]);
			 break;
		 	}
		 }
		 if(!encontrado) {
			 System.out.println("No se ha encontrado ninguna venta con esa referencia");
		 }
	}
	public static void mostrarVentas (String [][] ventas, String opcion,Scanner sc) {
		System.out.println("Cómics vendidos:");
		for(int i = 0; i < ventas.length; i++) {
			if(ventas[i][0] != null) {
				System.out.println("Referencia: " + ventas[i][0]);
				System.out.println("Titulo del cómic: "+ ventas [i][1]);
				System.out.println("Número de cómic: "+ventas [i][2]);
				System.out.println("Tipo de cómic (Occidental, Manga, Manhua, Manhwa: "+ventas [i][3]);
				System.out.println("Fecha: " +  ventas [i][4]);
				System.out.println("Importe: " + ventas[i][5]);
				System.out.println("===================");
		 	}
		}	
	}
	public static void eliminarVenta (String [][] ventas, String [][] comics,String opcion, Scanner sc) {
		System.out.println("Introduce la referencia de la venta a eliminar: ");
		String ref = sc.nextLine();
		boolean encontrado = false;
		for(int i=0;i < ventas.length;i++) {
			if (ventas[i][0]!= null &&  ventas [i][0].equals(ref)){
				encontrado = true;
				System.out.println("Venta encontrada: ");
				System.out.println("Referencia: " + ventas[i][0]);
				System.out.print("Titulo del cómic: "+ ventas [i][1]);
				System.out.print("Número de cómic: "+ventas [i][2]);
				System.out.println("Tipo de cómic (Occidental, Manga, Manhua, Manhwa: "+ventas [i][3]);
				System.out.println("Fecha: " +  ventas [i][4]);
				System.out.println("Importe: " + ventas[i][5]);
				for(int k = 0; k < comics.length; k++) {
					if(comics[k][0] != null && comics[k][0].equals(ref)) {
						comics[k][8] = "Disponible";
						break;
					}
			}
				for(int j = 0; j < ventas[i].length; j++) {
					ventas[i][j] = null;
				}
				System.out.println("Venta eliminada correctamente");
				break;
			}
		}
		if(!encontrado) {
			System.out.println("No se ha encontrado ninguna venta con esa referencia");
		}
	}
	
	// ALQUILER
	
	public static boolean comprobarReferenciaAlquiler(String [][] alquiler, String ref) {
		boolean existe = false;
		for(int i = 0; i < alquiler.length; i++) {
			if(alquiler [i][0] != null && alquiler [i][0].equals(ref)) {
			existe = true;
			break;
			}
		}
		return existe;
	}
	public static boolean ingresarAlquiler(String[][] alquiler, String ref, Scanner sc) {
	boolean ingresado = false;
	for(int i = 0; i< alquiler.length; i++) {
		if(alquiler [i][0] == null) {
			alquiler[i][0] = ref;
			System.out.print("Ingrese el titulo del cómic: ");
			alquiler [i][1]= sc.nextLine();
			System.out.print("Ingrese el numero de cómic: ");
			alquiler [i][2]= sc.nextLine();
			System.out.println("Ingrese el tipo de cómic (Occidental, Manga, Manhua, Manhwa: ");
			alquiler [i][3]= sc.nextLine();
			System.out.println("Ingrese el precio del cómic: ");
			alquiler [i][4]= sc.nextLine();
			ingresado = true;
			break;
		}
	}
	return ingresado;
	
	}
	public static void realizarAlquiler (String [][] alquiler, String [][] comics,String [][] clientes, String opcion, Scanner sc) {
		System.out.println("Ingrese el ISBN del cómic a vender: ");
		String isbn = sc.nextLine();
		String dni;
		if(comprobarReferenciaComic(comics, isbn) && comprobarDisponibilidad(comics,isbn)){
			System.out.println("Ingrese el DNI del cliente: ");
			dni = sc.nextLine();
			if(!comprobarReferenciaCliente(clientes, dni)) {
			    System.out.println("El cliente no está registrado");
			    return;
			}
			for(int i = 0; i < comics.length; i ++) {
				if(comics[i][0] != null && comics[i][0].equals(isbn)) {
					boolean registrado = false;
					for(int j = 0; j < alquiler.length; j++) {
						if(alquiler[j][0] == null) {
							alquiler[j][0] = isbn;
							alquiler[j][1] = comics[i][1];
							alquiler[j][2] = comics[i][2];
							alquiler[j][3] = comics[i][5];
							System.out.println("Introduce la fecha: ");
							alquiler[j][4] = sc.nextLine();
							alquiler[j][5] = comics[i][7];
							alquiler[j][6] = dni;
							comics[i][8] = "Alquilado";
							registrado = true;
							System.out.println("Alquiler realizado correctamente");
							break;
				}
			}
			if(!registrado) {
				System.out.println("No hay espacio para registrar más alquileres");
					}
			break;
				}
		}
	}
		else {
			System.out.println("El cómic no esta disponible");
		}
	}
	public static void buscarAlquiler (String [][] alquiler,String opcion,String ref, Scanner sc) {
		System.out.println("Introduce la referencia: ");
		 ref = sc.nextLine();
		 boolean encontrado = false;
		 for(int i=0;i < alquiler.length;i++) {
		 if (alquiler [i][0]!= null && alquiler [i][0].equals(ref)){
			 encontrado = true;
			 System.out.println("Alquiler encontrado: ");
			 System.out.println("Referencia: " +  alquiler [i][0]);
			 System.out.print("Titulo del cómic: "+ alquiler [i][1]);
			 System.out.print("Número de cómic: "+alquiler [i][2]);
			 System.out.println("Tipo de cómic (Occidental, Manga, Manhua, Manhwa: "+ alquiler [i][3]);
			 System.out.println("Fecha: " +  alquiler [i][4]);
			 System.out.println("Importe: " + alquiler[i][5]);
			 System.out.println("DNI del cliente: " + alquiler[i][6]);
			 break;
		 	}
		 }
		 if(!encontrado) {
			 System.out.println("No se ha encontrado ningún alquiler con esa referencia");
		 }
	}
	public static void mostrarAlquileres (String [][] alquiler,String opcion, Scanner sc) {
		System.out.println("Cómics alquilados:");
		for(int i = 0; i < alquiler.length; i++) {
			if(alquiler[i][0] != null) {
				System.out.println("Referencia: " + alquiler[i][0]);
				System.out.print("Titulo del cómic: "+ alquiler [i][1]);
				System.out.print("Número de cómic: "+alquiler [i][2]);
				System.out.println("Tipo de cómic (Occidental, Manga, Manhua, Manhwa: "+ alquiler [i][3]);
				System.out.println("Fecha: " +  alquiler [i][4]);
				System.out.println("Importe: " + alquiler[i][5]);
				System.out.println("DNI del cliente: " + alquiler[i][6]);
				System.out.println("===================");
		 	}
		}	
	}
	public static void eliminarAlquiler (String [][] alquiler, String [][] comics,String opcion, Scanner sc) {
		System.out.println("Introduce la referencia del alquiler a eliminar: ");
		String ref = sc.nextLine();
		boolean encontrado = false;
		for(int i=0;i < alquiler.length;i++) {
			if (alquiler[i][0]!= null &&  alquiler [i][0].equals(ref)){
				encontrado = true;
				System.out.println("Alquiler encontrado: ");
				System.out.println("Referencia: " + alquiler[i][0]);
				System.out.print("Titulo del cómic: "+ alquiler [i][1]);
				System.out.print("Número de cómic: "+ alquiler [i][2]);
				System.out.println("Tipo de cómic (Occidental, Manga, Manhua, Manhwa: "+ alquiler [i][3]);
				System.out.println("Fecha: " +  alquiler [i][4]);
				System.out.println("Importe: " + alquiler[i][5]);
				
				for(int k = 0; k < comics.length; k++) {
					if(comics[k][0] != null && comics[k][0].equals(ref)) {
						comics[k][8] = "Disponible";
						break;
			}
		}
		for(int j = 0; j < alquiler[i].length; j++) {
			alquiler[i][j] = null;
		}
		System.out.println("Alquiler eliminado correctamente");
		break;
	}
		}
		if(!encontrado) {
			System.out.println("No se ha encontrado ningún alquiler con esa referencia");
		}
	}
}
