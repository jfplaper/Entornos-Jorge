package fruteriaedd;

/**
 * Esta clase define objetos que contienen datos relativos a diferentes frutas ácidas
 * @author Jorge Fco. Plazas Pereira
 * @version 18/03/2021/A
 */

//Campos de la clase
public class FrutasAcidas {
    private String nombre;
    private String color;
    private double peso;
    private double precio;
    private String origen;
    private boolean envoltorio;
    private int nivelAcidez;
    
    /**
     * Constructor para los atributos/características de las frutas ácidas
     * @param nombre El parámetro nombre define el nombre que va a tener la fruta
     * @param color El parámetro color define el nombre del color que va a tener la fruta
     * @param peso El parámetro peso define el valor del peso que va a tener la fruta
     * @param precio El parámetro precio define el valor del precio que va a tener la fruta
     * @param origen El parámetro origen define la procedencia que va a tener a la fruta
     * @param envoltorio El parámetro envoltorio define si va a estar envuelta o no la fruta
     * @param nivelAcidez El parámetro nivelAcidez define cómo de ácida es la fruta
    */
    public FrutasAcidas(String nombre, String color, double peso, double precio,
            String origen, boolean envoltorio, int nivelAcidez) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.precio = precio;
        this.origen = origen;
        this.envoltorio = envoltorio;
        this.nivelAcidez = nivelAcidez;
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
     * Método que devuelve el nivel/cantidad de acidez de la fruta
     * @return valor entre 1 y 3, ambos incluidos, y 0 si está fuera de ese rango y es incorrecto
     */
    public int getNivelAcidez() {
        if(nivelAcidez>=1 && nivelAcidez <=3) {
            return nivelAcidez;
        }else{
            return 0;
        }
    }

    /**
     * Método que modifica el nivel/cantidad de acidez de la fruta
     * @param nivelAcidez El parámetro nivelAcidez define cómo de ácida es la fruta
     */
    public void setNivelAcidez(int nivelAcidez) {
        if(nivelAcidez>=1 && nivelAcidez <=3) {
            this.nivelAcidez = nivelAcidez;
        }else{
            this.nivelAcidez = 0;
        }
    }
    
    /**
     * Método que devuelve en palabras el nivel/cantidad de acidez
     * @param nivelAcidez El parámetro nivelAcidez define el valor del nivel de acidez que queremos evaluar
     * @return alto si el valor es 3, normal si es 1 ó 2, e indica si el valor del parámetro no está en el rango correcto
     */
    public static String veredictoAcidez(int nivelAcidez) {
        if(nivelAcidez>=1 && nivelAcidez <=3) {
            if(nivelAcidez>2) {
                return "El nivel de acidez es alto";
            }else{
                return "El nivel de acidez es normal";
            }
        }else{
            return "Los valores del nivel de acidez tienen que ir de 0 a 3";
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
     * Método que devuelve una cadena de datos relativos a los objetos creados/instanciados de la clase FrutasAcidas
     * @return Una cadena/String con los datos relativos a los objetos creados/instanciados de la clase FrutasAcidas
     */
    @Override
    public String toString() {
        return "FrutasAcidas{" + "nombre=" + nombre + ", color=" + color + ", peso=" + peso + ", precio=" + precio + ", origen=" + origen + ", envoltorio=" + envoltorio + ", nivelAcidez=" + nivelAcidez +'}';
    }
    
}//Cierre de la clase FrutasAcidas
