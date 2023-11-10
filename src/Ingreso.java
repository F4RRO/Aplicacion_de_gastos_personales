/** PAC DESARROLLO M03B 1S2324
 *  Sigue las especificaciones del enunciado de la pac de Desarrollo
 *  No se puede importar ninguna clase, dentro de esta clase.
 *  Obligatorio utilizar esta plantilla
 *  
 */
// Esta es la clase Ingreso, parecida a la clase Gasto, pero en vez de dinero que gasto, es dinero que recibo.
public class Ingreso extends Dinero{
   	//inserta código aquí
	    // aqui tengo el constructor de Ingreso. 
	    // necesito saber cuanto dinero es y de donde viene por eso los parametros.
	    public Ingreso(double ingreso, String description) {
	        // aqui guardo la cantidad de dinero que entro.
	        this.setDinero(ingreso);
	        // Y aqui escribo la historia detras de ese dinero, como un pequeño recordatorio.
	        this.setDescription(description);
	    }

	    @Override
	    public String toString() {
	        // texto que describe el ingreso.
	        return "Ingreso recibido por un valor de " + getDinero() + "€ y con la siguiente descripción: " + getDescription();
	    }
	}


