package modelo;

import java.util.ArrayList;

public class Usuario {

    private int codigo;
    private String correo;
    private String nombre;
    private String apellido;
    private String contrasena;
    private String dpi;
    private String fechaNacimiento;
    private String genero;
    private String nacionalidad;
    private String alias;
    private String telefono;
    private String rol;
    private String rutaFotografia;
    private String kioscoAsociado;
    private int paquetesEnviados;
    private double totalVendido;
    private ArrayList<Tarjeta> tarjetas;
    private ArrayList<Datos> datos;
    private ArrayList<Pedido> pedidos;


    public Usuario(int codigo, String correo, String nombre, String apellido, String contrasena, String dpi, String fechaNacimiento, String genero, String nacionalidad, String alias, String telefono, String rol, String rutaFotografia, String kioscoAsociado, int paquetesEnviados , double totalVendido) {
        this.codigo = codigo;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.dpi = dpi;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.alias = alias;
        this.telefono = telefono;
        this.rol = rol;
        this.rutaFotografia = rutaFotografia;
        this.kioscoAsociado = kioscoAsociado;
        this.paquetesEnviados = paquetesEnviados;
        this.totalVendido = totalVendido;
        this.tarjetas = new ArrayList<>();
        this.datos = new ArrayList<>(); 
        this.pedidos = new ArrayList<>();
    }

    public Usuario() {
    }
    
    

    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRutaFotografia() {
        return rutaFotografia;
    }

    public void setRutaFotografia(String rutaFotografia) {
        this.rutaFotografia = rutaFotografia;
    }

    public String getKioscoAsociado() {
        return kioscoAsociado;
    }

    public void setKioscoAsociado(String kioscoAsociado) {
        this.kioscoAsociado = kioscoAsociado;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    public int getPaquetesEnviados() {
        return paquetesEnviados;
    }

    public void setPaquetesEnviados(int paquetesEnviados) {
        this.paquetesEnviados = paquetesEnviados;
    }
    
    public ArrayList<Tarjeta> getTarjetas(){
        return tarjetas;
    }
    
    public void setTarjetas(Tarjeta tarjeta){
        this.tarjetas.add(tarjeta);
    }
    
    public ArrayList<Datos> getDatos(){
        return datos;
    }
    
    public void setDatos(Datos datos){
        this.datos.add(datos);
    }
    
    public ArrayList<Pedido> getPedidos(){
        return pedidos;
    }
    
    public void setPedidos(Pedido pedido){
        this.pedidos.add(pedido);
    }
    

}
