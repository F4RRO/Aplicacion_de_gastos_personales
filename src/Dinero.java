/** PAC DESARROLLO M03B 1S2324
 *  Sigue las especificaciones del enunciado de la pac de Desarrollo
 *  No se puede importar ninguna clase, dentro de esta clase.
 *  Obligatorio utilizar esta plantilla
 *  
 */
public abstract class Dinero {
   	//inserta código aquí
	
	 // atributos protegidos según el diagrama de clases.
    protected double dinero; // almacena la cantidad de dinero, sea ingreso o gasto.
    protected String description; // almacena la descripcion del movimiento de dinero.
    
    // metodo getter para obtener la cantidad de dinero.
    public double getDinero() {
        return dinero;
    }
    
    // metodo setter para establecer la cantidad de dinero.
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    // metodo getter para obtener la descripcion del movimiento de dinero.
    public String getDescription() {
        return description;
    }
    
    // metodo setter para establecer la descripcion del movimiento de dinero.
    public void setDescription(String description) {
        this.description = description;
    } 
}
	

