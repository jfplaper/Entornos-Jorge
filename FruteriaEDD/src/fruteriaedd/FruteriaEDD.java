package fruteriaedd;

import java.util.ArrayList;

/**
 * Esta clase principal incluye el método main, dentro del cual creamos objetos fruta cuyos datos imprimimos por consola
 * @author Jorge Fco. Plazas Pereira
 * @version 18/03/2021/A
 * @see <a href = "https://www.infoagro.com/" > infoagro.com – Información precios Mercadona </a>
 */
public class FruteriaEDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrutasDulces frutaDulce1 = new FrutasDulces("Sandía", "verde oscuro", 6.2, 9.86, "España", false, 2);
        FrutasDulces frutaDulce2 = new FrutasDulces("Melón", "verde blanquecino", 2.28, 3.63, "Francia", false, 3);
        FrutasDulces frutaDulce3 = new FrutasDulces("Manzana Fuji", "rojo", 0.200, 0.36, "Japón", true, 1);

//        Prueba para comprobar el funcionamiento de un ArrayList de frutas:
//        ArrayList<FrutasDulces> frutasDulces = new ArrayList<FrutasDulces>();
//        frutasDulces.add(frutaDulce1);
//        frutasDulces.add(frutaDulce2);
//        frutasDulces.add(frutaDulce3);
//        
//        for (FrutasDulces frutasDulce : frutasDulces) {
//            System.out.println(frutasDulce);
//        }
        
        FrutasAcidas frutaAcida1 = new FrutasAcidas("Frambuesa", "rojo", 0.003, 0.037, "Italia", true, 1);
        FrutasAcidas frutaAcida2 = new FrutasAcidas("Limón", "amarillo", 0.135, 0.15, "España", true, 3);
        FrutasAcidas frutaAcida3 = new FrutasAcidas("Naranja", "naranja", 0.320, 0.44, "España", false, 2);
        
//        Pruebas para comprobar el funcionamiento de algunos métodos:
//        frutaDulce1.setNivelAzucar(-1);
//        frutaAcida2.setNivelAcidez(1);
//        System.out.println(FrutasDulces.veredictoAzucar(3));
//        System.out.println(FrutasAcidas.veredictoAcidez(0));
//        System.out.println(frutaDulce1.descuento(50));
//        System.out.println(frutaAcida1.descuento(25));
        
        
        System.out.println(frutaDulce1.toString() +"\n"+ frutaDulce2.toString() +"\n"+ frutaDulce3.toString());
        System.out.println(frutaAcida1.toString() +"\n"+ frutaAcida2.toString() +"\n"+ frutaAcida3.toString());
    }
    
}
