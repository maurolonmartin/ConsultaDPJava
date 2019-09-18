package consultadp;

import javax.swing.JComboBox;

public class Pais {

    private String pais;

    //Constructor
    public Pais(String pais) {
        this.pais = pais;
    }

    //Metodo para obtener el nombre del pais
    public String obtenerNombrePais() {
        return pais;
    }

    //**************ATRIBUTOS Y METODOS ESTATICOS**************//
    private static Pais[] paises;
    
    public static Pais obtenerPais(int indice){
        return paises[indice];
    }
    
    public static Pais buscarPais(String nombrePais){
        for(int i = 0; i < paises.length; i++){
            if( paises[i].obtenerNombrePais().equals(nombrePais)){
                return paises[i];
            }
        }return null;
    }

    public static void ObtenerPaises(String[][] datos) {
        paises = null;

        String anteriorPais = "";
         for (int i = 0; i < datos.length; i++) {
            if (!datos[i][0].equals(anteriorPais) && !datos[i][0].equals("Pais")) {
                if (paises == null) {
                    paises = new Pais[1];
                } else {
                    paises = (Pais[]) Util.redimensionar(paises, paises.length+1);
                }
                paises[paises.length - 1] = new Pais(datos[i][0]);
                anteriorPais = datos[i][0];
            }
        }
    }
    
    public static void llenarLista(JComboBox cmb){
        cmb.removeAllItems();
        if(paises!=null){
            for(int i = 0; i< paises.length; i++){
            cmb.addItem(paises[i].obtenerNombrePais());
            }
        }
    }
}
