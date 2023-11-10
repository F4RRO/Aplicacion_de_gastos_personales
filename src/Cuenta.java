	// Importo las librerías necesarias para manejar listas.
import java.util.ArrayList;
import java.util.List;
/** PAC DESARROLLO M03B 1S2324
 *  Sigue las especificaciones del enunciado de la pac de Desarrollo
 *  No se puede importar ninguna otra clase, dentro de esta clase.
 *  Obligatorio utilizar esta plantilla
 *  
 */
public class Cuenta {

   	//inserta código aquí

	    // atributos de mi cuenta
	    private double saldo; // aqui es donde voy a guardar el dinero disponible en mi cuenta.
	    private Usuario usuario; // esto va a ser una referencia al dueno de la cuenta, o sea, yo o alguien mas.
	    private List<Gasto> gastos; // en esta lista, voy a llevar un registro de todos los gastos.
	    private List<Ingreso> ingresos; // y en esta otra, voy a llevar la cuenta de todo el dinero que entre.

	    // constructor de mi clase cuenta
	    public Cuenta(Usuario usuario) {
	        this.usuario = usuario; // aqui asigno el propietario de la cuenta.
	        this.saldo = 0.0; //  mi saldo inicial es 0.
	        this.ingresos = new ArrayList<>(); // preparo mi lista para futuros ingresos.
	        this.gastos = new ArrayList<>(); // y tambien preparo la lista donde anotare mis gastos.
	    }

	    // aqui puedo ver cuanto dinero tengo en la cuenta.
	    public double getSaldo() {
	        return this.saldo;
	    }

	    // si necesito actualizar el saldo, usare este metodo.
	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }

	    // este metodo me dice quien es el dueno de la cuenta.
	    public Usuario getUsuario() {
	        return this.usuario;
	    }

	    // si por alguna razon necesito cambiar el dueno de la cuenta, puedo usar este metodo.
	    public void setUsuario(Usuario usuario) {
	        this.usuario = usuario;
	    }

	    // cuando recibo dinero, uso este metodo para registrar el ingreso.
	    public double addIngresos(String description, double cantidad) {
	        this.ingresos.add(new Ingreso(cantidad, description)); // anado el ingreso a mi lista.
	        this.saldo += cantidad; // y sumo la cantidad a mi saldo actual.
	        return this.saldo; // me gusta devolver el saldo para saber cuanto tengo ahora.
	    }

	    // cuando tengo que pagar algo, uso este metodo.
	    public double addGastos(String description, double cantidad) throws GastoException {
	        if (this.saldo < cantidad) {
	            throw new GastoException("Saldo insuficiente"); // no puedo gastar lo que no tengo.
	        }
	        this.gastos.add(new Gasto(cantidad, description)); // registro el gasto.
	        this.saldo -= cantidad; // y lo resto de mi saldo.
	        return this.saldo; // vuelvo a comprobar mi saldo despues del gasto.
	    }

	    // si quiero revisar todos mis ingresos, este metodo me dara la lista.
	    public List<Ingreso> getIngresos() {
	        return new ArrayList<>(this.ingresos); // doy una copia para mantener mi lista segura.
	    }

	    // y si quiero revisar mis gastos, este otro metodo me da esa lista.
	    public List<Gasto> getGastos() {
	        return new ArrayList<>(this.gastos); // igual que con los ingresos, doy una copia.
	    }

	    // para tener una representacion clara de mi cuenta, sobreescribo este metodo.
	    @Override
	    public String toString() {
	        return "Usuario: " + this.usuario.toString() + ", saldo: " + this.saldo; // asi tengo un resumen rapido de mi cuenta.
	    }
	}

