/** PAC DESARROLLO M03B 1S2324
 *  Sigue las especificaciones del enunciado de la pac de Desarrollo
 *  No se puede importar ninguna clase, dentro de esta clase.
 *  Obligatorio utilizar esta plantilla
 *  
 */
	// esta es mi clase Gasto, que es un tipo específico de Dinero.
public class Gasto extends Dinero {
   	//inserta código aquí
	
	    // cuando creo un Gasto, necesito decir cuanto es y en que se gasto.
	    // este es el lugar donde digo lo indico, mi constructor.
	    public Gasto(double gasto, String description) {
	    	this.setDinero(gasto); // Aquí digo cuánto fue el gasto.
	    	this.setDescription(description); // Y aquí explico en qué se usó ese dinero.
	    }

	   
	    @Override
	    public String toString() {
	        // texto que describe el gasto con su valor y en que se gasto.
	        return "Gasto realizado por un valor de " + getDinero() + "€ y con la siguiente descripción: " + getDescription();
	    }
	}


