package consultadp;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Region {

    private String region;
    private String capital;
    private String tipo;
    private Pais pais;

    public Region(String region, String capital, String tipo, String pais) {
        this.region = region;
        this.capital = capital;
        this.tipo = tipo;
        this.pais = Pais.buscarPais(pais);
    }

    public Pais obtenerPais() {
        return pais;
    }

    public String obtenerRegion() {
        return region;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerCapital() {
        return capital;
    }

    //**************ATRIBUTOS Y METODOS ESTATICOS**************//
    private static Region[] regiones;

    public static void ObtenerRegiones(String[][] datos) {
        regiones = new Region[datos.length];
        for (int i = 0; i < datos.length; i++) {
            regiones[i] = new Region(datos[i][1],
                                     datos[i][3],
                                    datos[i][2], 
                                    datos[i][0]);
        }
    } 
    
    public static void mostrar(JTable tbl, Pais p){
        String[] encabezados = new String[]{"Nombre", "Tipo", "Capital"};
        
        /*int totalRegiones = 0;
        for(int i = 0; i< regiones.length; i++){
            if(p.obtenerPais().equals(regiones[i].obtenerPais().obtenerPais())){
                totalRegiones++;
            }
        }
        
        String[][] datos = new String[totalRegiones][3];
        for(int i = 0; i< regiones.length; i++){
            if(p.obtenerPais().equals(regiones[i].obtenerPais().obtenerPais())){
                datos[totalRegiones][0] = regiones[i].obtenerRegion();
                datos[totalRegiones][1] = regiones[i].obtenerTipo();
                datos[totalRegiones][2] = regiones[i].obtenerCapital();
            }
        }
        tbl.setModel(new DefaultTableModel(datos, encabezados));*/
    }
}
    

