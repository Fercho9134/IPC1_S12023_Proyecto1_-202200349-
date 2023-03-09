
package modelo;

public class Departamento {
    
    private String codigoRegion;
    private String codigoDepartamento;
    private String nombreDepartamento;

    public Departamento() {
    }

    public Departamento(String codigoRegion, String codigoDepartamento, String nombreDepartamento) {
        this.codigoRegion = codigoRegion;
        this.codigoDepartamento = codigoDepartamento;
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getCodigoRegion() {
        return codigoRegion;
    }

    public void setCodigoRegion(String codigoRegion) {
        this.codigoRegion = codigoRegion;
    }


    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    
    
    
    
}
