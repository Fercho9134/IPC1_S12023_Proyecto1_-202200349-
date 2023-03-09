
package modelo;

public class Region {
    
    private String codigoRegion;
    private String nombreRegion;
    private double precioEstandar;
    private double precioEspecial;
    private int cantidadEnvios;
    private double totalVendido;
    
    public Region(){
    }

    public Region(String codigoRegion, String nombreRegion, double precioEstandar, double precioEspecial, int cantidadEnvios , double totalVendido) {
        this.codigoRegion = codigoRegion;
        this.nombreRegion = nombreRegion;
        this.precioEstandar = precioEstandar;
        this.precioEspecial = precioEspecial;
        this.cantidadEnvios = cantidadEnvios;
        this.totalVendido = totalVendido;
    }

    public String getCodigoRegion() {
        return codigoRegion;
    }

    public void setCodigoRegion(String codigoRegion) {
        this.codigoRegion = codigoRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public double getPrecioEstandar() {
        return precioEstandar;
    }

    public void setPrecioEstandar(double precioEstandar) {
        this.precioEstandar = precioEstandar;
    }

    public double getPrecioEspecial() {
        return precioEspecial;
    }

    public void setPrecioEspecial(double precioEspecial) {
        this.precioEspecial = precioEspecial;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    public int getCantidadEnvios() {
        return cantidadEnvios;
    }

    public void setCantidadEnvios(int cantidadEnvios) {
        this.cantidadEnvios = cantidadEnvios;
    }
    
    
    
    
    
}
