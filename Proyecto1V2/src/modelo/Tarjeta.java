
package modelo;


public class Tarjeta {
    
    private String nombre;
    private String numero;
    private String fechaVencimiento;

    public Tarjeta(String nombre, String numero, String fechaVencimiento) {
        this.nombre = nombre;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    
    
}
