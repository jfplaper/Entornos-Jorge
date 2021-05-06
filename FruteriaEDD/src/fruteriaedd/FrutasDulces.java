package fruteriaedd;

/**
 * Esta clase define objetos que contienen datos relativos a diferentes frutas dulces
 * @author Jorge Fco. Plazas Pereira
 * @version 18/03/2021/A
 */

//Campos de la clase
public class FrutasDulces {
    private String nombre;
    private String color;
    private double peso;
    private double precio;
    private String origen;
    private boolean envoltorio;
    private int nivelAzucar;
    
    /**
     * Constructor para los atributos/características de las frutas dulces
     * @param nombre El parámetro nombre define el nombre que va a tener la fruta
     * @param color El parámetro color define el nombre del color que va a tener la fruta
     * @param peso El parámetro peso define el valor del peso que va a tener la fruta
     * @param precio El parámetro precio define el valor del precio que va a tener la fruta
     * @param origen El parámetro origen define la procedencia que va a tener a la fruta
     * @param envoltorio El parámetro envoltorio define si va a estar envuelta o no la fruta
     * @param nivelAzucar El parámetro nivelAzucar define cómo de dulce es la fruta
     */
    public FrutasDulces(String nombre, String color, double peso, double precio,
            String origen, boolean envoltorio, int nivelAzucar) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.precio = precio;
        this.origen = origen;
        this.envoltorio = envoltorio;
        this.nivelAzucar = nivelAzucar;
    }//Cierre del constructor
    
    /**
     * Método que devuelve el nombre de la fruta
     * @return El nombre de la fruta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica el nombre de la fruta
     * @param nombre El parámetro nombre define el nombre que va a tener la fruta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el color de la fruta
     * @return El color de la fruta
     */
    public String getColor() {
        return color;
    }

    /**
     * Método que modifica el color de la fruta
     * @param color El parámetro color define el nombre del color que va a tener la fruta
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que devuelve el peso de la fruta
     * @return El peso en kilos de la fruta
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Método que modifica el peso de la fruta
     * @param peso El parámetro peso define el valor del peso que va a tener la fruta
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Método que devuelve el precio de la fruta
     * @return El precio en euros de la fruta
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que modifica el precio de la fruta
     * @param precio El parámetro precio define el valor del precio que va a tener la fruta
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método que devuelve el origen o procedencia de la fruta
     * @return El lugar de recolección/recogida de la fruta
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Método que modifica el origen o procedencia de la fruta
     * @param origen El parámetro origen define la procedencia que va a tener a la fruta
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Método que devuelve si lleva o no envoltorio la fruta
     * @return true si lleva envoltorio la fruta y false si no lo lleva
     */
    public boolean isEnvoltorio() {
        return envoltorio;
    }

    /**
     * Método que modifica si lleva o no envoltorio la fruta
     * @param envoltorio El parámetro envoltorio define si va a estar envuelta o no la fruta
     */
    public void setEnvoltorio(boolean envoltorio) {
        this.envoltorio = envoltorio;
    }
    
    /**
     * Método que devuelve el nivel/cantidad de azúcar de la fruta
     * @return valor entre 1 y 3, ambos incluidos, y 0 si está fuera de ese rango y es incorrecto
     */
    public int getNivelAzucar() {
        if(nivelAzucar>=1 && nivelAzucar <=3) {
            return nivelAzucar;
        }else{
            return 0;
        }
    }

    /**
     * Método que modifica el nivel/cantidad de azúcar de la fruta
     * @param nivelAzucar El parámetro nivelAzucar define cómo de dulce es la fruta
     */
    public void setNivelAzucar(int nivelAzucar) {
        if(nivelAzucar>=1 && nivelAzucar <=3) {
            this.nivelAzucar = nivelAzucar;
        }else{
            this.nivelAzucar = 0;
        }
    }
    
    /**
     * Método que devuelve en palabras el nivel/cantidad de azúcar
     * @param nivelAzucar El parámetro nivelAzucar define el valor del nivel de azúcar que queremos evaluar
     * @return alto si el valor es 3, normal si es 1 ó 2, e indica si el valor del parámetro no está en el rango correcto
     */
    public static String veredictoAzucar(int nivelAzucar) {
        if(nivelAzucar>=1 && nivelAzucar <=3) {
            if(nivelAzucar>2) {
                return "El nivel de azúcar es alto";
            }else{
                return "El nivel de azúcar es normal";
            }
        }else{
            return "Los valores del nivel de azúcar tienen que ir de 0 a 3";
        }
    }//Cierre del método

    /**
     * Método que devuelve el precio de la fruta tras aplicarle un porcentaje de descuento
     * @param porcentaje El parámetro porcentaje define el valor de tipo double como porcentaje a aplicar a un precio dado
     * @return Valor final del precio de la fruta tras aplicarle el porcentaje de descuento
     */
    public double descuento(double porcentaje) {
        double precioFinal = precio * (porcentaje/100);
        return precioFinal;
    }//Cierre del método

    /**
     * Método que devuelve una cadena de datos relativos a los objetos creados/instanciados de la clase FrutasDulces
     * @return Una cadena/String con los datos relativos a los objetos creados/instanciados de la clase FrutasDulces
     */
    @Override
    public String toString() {
        return "FrutasDulces{" + "nombre=" + nombre + ", color=" + color + ", peso=" + peso + ", precio=" + precio + ", origen=" + origen + ", envoltorio=" + envoltorio + ", nivelAzucar=" + nivelAzucar + '}';
    }
    
}//Cierre de la clase FrutasDulces
