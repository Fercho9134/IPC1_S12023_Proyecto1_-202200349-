
package modelo;

public class Pedido {
    
    private int numeroFactura;
    private String codigoPaquete;
    private String regionOrigen;
    private String departamentoOrigen;
    private String municipioOrigen;
    private String direccionOrigen;
    private String regionDestino;
    private String departamentoDestino;
    private String municipioDestino;
    private String direccionDestino;
    private String nit;
    private String nombre;
    private String tipoDePago;
    private int pesoPaquete;
    private int cantidadPaquete;
    private double total;
    String fecha;

    public Pedido(int numeroFactura, String codigoPaquete, String regionOrigen, String departamentoOrigen, String municipioOrigen, String direccionOrigen, String regionDestino, String departamentoDestino, String municipioDestino, String direccionDestino, String nit, String nombre, String tipoDePago, int pesoPaquete, int cantidadPaquete, double total, String fecha) {
        this.numeroFactura = numeroFactura;
        this.codigoPaquete = codigoPaquete;
        this.regionOrigen = regionOrigen;
        this.departamentoOrigen = departamentoOrigen;
        this.municipioOrigen = municipioOrigen;
        this.regionDestino = regionDestino;
        this.departamentoDestino = departamentoDestino;
        this.municipioDestino = municipioDestino;
        this.nit = nit;
        this.tipoDePago = tipoDePago;
        this.pesoPaquete = pesoPaquete;
        this.cantidadPaquete = cantidadPaquete;
        this.total = total;
        this.fecha = fecha;
        this.nombre = nombre;
        this.direccionDestino = direccionDestino;
        this.direccionOrigen = direccionOrigen;
    }

    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(String direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }
    
    

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(String codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public String getRegionOrigen() {
        return regionOrigen;
    }

    public void setRegionOrigen(String regionOrigen) {
        this.regionOrigen = regionOrigen;
    }

    public String getDepartamentoOrigen() {
        return departamentoOrigen;
    }

    public void setDepartamentoOrigen(String departamentoOrigen) {
        this.departamentoOrigen = departamentoOrigen;
    }

    public String getMunicipioOrigen() {
        return municipioOrigen;
    }

    public void setMunicipioOrigen(String municipioOrigen) {
        this.municipioOrigen = municipioOrigen;
    }

    public String getRegionDestino() {
        return regionDestino;
    }

    public void setRegionDestino(String regionDestino) {
        this.regionDestino = regionDestino;
    }

    public String getDepartamentoDestino() {
        return departamentoDestino;
    }

    public void setDepartamentoDestino(String departamentoDestino) {
        this.departamentoDestino = departamentoDestino;
    }

    public String getMunicipioDestino() {
        return municipioDestino;
    }

    public void setMunicipioDestino(String municipioDestino) {
        this.municipioDestino = municipioDestino;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    public int getPesoPaquete() {
        return pesoPaquete;
    }

    public void setPesoPaquete(int pesoPaquete) {
        this.pesoPaquete = pesoPaquete;
    }

    public int getCantidadPaquete() {
        return cantidadPaquete;
    }

    public void setCantidadPaquete(int cantidadPaquete) {
        this.cantidadPaquete = cantidadPaquete;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
