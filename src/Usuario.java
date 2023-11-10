/** PAC DESARROLLO M03B 1S2324
 *  Sigue las especificaciones del enunciado de la pac de Desarrollo
 *  No se puede importar ninguna otra clase, dentro de esta clase.
 *  Obligatorio utilizar esta plantilla
 *  
 */
import java.util.regex.Pattern;
public class Usuario {
   	// inserta código aquí
	
	// Creo atributos privados para almacenar la info del usuario.
	private String nombre;
	private int edad;
	private String dni;
	
	// constructor vacio publico llamado igual que la clase. 
	public Usuario() {
	}
	// metodo publico get y set para cada atributo. Permiten acceder y modificar los datos de un usuario de manera controlada
	public String getNombre() {
		return nombre; // devuelve el nombre 
	}
	// metodo publico para establecer el nombre de usuario.
	public void setNombre(String nombre) {
		this.nombre = nombre; // asigna el nuevo nombre al atributo privado
		}
	
	// metodo publico para obtener la edad del usuario
	public int getEdad() {
		return edad; // devuelve la edad actual del usuario.
	}
	// metodo publico para establecer la edad del usuario.
	public void setEdad(int edad) {
		this.edad = edad; // asigna la edad al nuevo atributo privado
	}
	// metodo publico para obtener el DNI del usuario.
	public String getDNI() {
		return dni; //devuelve el dni del usuario		
	}
	// metodo publico para establecer el DNI del usuario.
	public boolean setDNI(String dni) {
		if (validarDNI(dni)) { //Utilizo el metodo validarDNI para verificar el formato DNI.
			this.dni = dni; // Si es valido, asigna el nuevo DNI al atributo privado.
			return true; // Retorna true para indicar que el dni ha sido asignado exitosamente.
		}
		return false; // retorna false si el dni no es valido. 
	}
	
	// Metodo publico sobrescrito toString para proporcionar una representacion en String del objeto Usuario. 
	@Override
	public String toString() {
		//retorna una cadena que representa al usuario, util para imprimir o registrar la informacion del usuario.
		 return "Usuario: " + getNombre() + ", Edad: " + getEdad() + ", DNI: " + getDNI();
		}
	private boolean validarDNI(String dni) {
		//patron que define el formato valido para un dni: 8 numeros seguidos de un guion opcional y una letra minuscula.
		 final String patron = "^\\d{8}-?[a-z]$";
		// Utiliza la clase Pattern para verificar si el DNI coincide con el patrón.
        return Pattern.matches(patron, dni); // Retorna true si coincide, false si no.
	}
}
