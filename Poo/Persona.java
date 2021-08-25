package Poo;

/**
 * La clase persona, representa la entidad persona y definimos sus atributos (nombre, edad y genero)
 * Hacemos uso de 2 constructores uno con parametros y otro sin parametros
 * Tenemos un metodo llamado imprimirInformacion para mostrar el contenido de los atributos de la clase
 * @author Miguel
 *
 */
public class Persona {
	// Atributos
	/**
	 * nombre variable de tipo String, para asignarle un nombre a la persona
	 */
	String nombre;
	/**
	 * edad variable de tipo int, para asignarle la edad a la persona
	 */
	int edad;
	/**
	 * genero variable de tipo char, para asignarle el genero a la persona
	 */
	char genero;
	
	/**
	 * Constructor sin parametros
	 */
	public Persona() {
		System.out.println("Constructor sin parametros");
	}
	
	/**
	 * Constructor con parametros
	 * @param nombre
	 * @param edad
	 * @param genero
	 */
	public Persona(String nombre, int edad, char genero) {
		this();
		this.nombre = nombre;
		// Pedro = Pedro
		this.edad = edad;
	    this.genero = genero;
	}
	
	/**
	 * Metodo principal que inicializa mi clase
	 * @param args
	 */
	public static void main(String[] args) {
		// Es crear 2 objetos
		// primer objeto
		Persona persona = new Persona("Pedro",18,'M');
		// persona.nombre = "Pedro";
		// persona.edad = 18;
		// persona.genero = 'M';
		persona.imprimirInformacion();
		
		// segundo objeto
		Persona personaDos = new Persona("Maria", 20, 'F');
		 // personaDos.nombre = "Maria";
		 // personaDos.edad = 20;
		// personaDos.genero = 'F';
		personaDos.imprimirInformacion();
		
		
		// llamando al metodo bailar
		persona.bailar(personaDos);

	}
	/**
	 * Metodo que representa una accion de persona, recibe por parameto un objeto de tipo Persona
	 * @param p
	 */
	public void bailar(Persona p) {
		System.out.println(nombre + " Esta Bailando con " + p.nombre);
	}
	
	/**
	 * Metodo para imprimir las propiedades de la clase
	 */
	public void imprimirInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Genero: " + genero);
	}
	
	

}
