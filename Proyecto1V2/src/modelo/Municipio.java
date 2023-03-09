
package modelo;

public class Municipio {
    private String codigoDepartamento;
    private String codigoMunicipio;
    private String nombreMunicipio;

    public Municipio() {
    }

    public Municipio(String codigoDepartamento, String codigoMunicipio, String nombreMunicipio) {
        this.codigoDepartamento = codigoDepartamento;
        this.codigoMunicipio = codigoMunicipio;
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }
    
    
}
