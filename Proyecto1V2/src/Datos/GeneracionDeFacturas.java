package Datos;

import java.awt.Desktop;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GeneracionDeFacturas {

    public void generarFactura(String numeroFactura, String fecha, String guia, String nit, String nombre, String tipoPago, String rOri, String dOri, String mOri, String rDest, String dDest, String mDest, String peso, String cantidad, String total, String direccionOrigen, String direccionDestino) {

        String plantilla = "";
        try {
            plantilla = new String(Files.readAllBytes(Paths.get("factura.html")));
        } catch (IOException e) {
            System.out.println("Error al leer la plantilla: " + e.getMessage());
            return;
        }

        // Reemplazamos las secciones dinámicas de la plantilla con el contenido generado
        String paginaFinal = plantilla
                .replace("[FECHAEMISION]", fecha)
                .replace("[NUMEROFACTURA]", numeroFactura)
                .replace("[CODIGOPAQUETE]", guia)
                .replace("[NIT]", nit)
                .replace("[NOMBRE]", nombre)
                .replace("[TIPODEPAGO]", tipoPago)
                .replace("[REGIONORIGEN]", rOri)
                .replace("[DEPARTAMENTOORIGEN]", dOri)
                .replace("[MUNICIPIOORIGEN]", mOri)
                .replace("[REGIONDESTINO]", rDest)
                .replace("[DEPARTAMENTODESTINO]", dDest)
                .replace("[MUNICIPIODESTINO]", mDest)
                .replace("[PESOLBS]", peso)
                .replace("[CANTIDADPAQUETES]", cantidad)
                .replace("[SUBTOTAL]", total)
                .replace("[TOTALF]", total)
                .replace("[TOTALF2]", total)
                .replace("[DIRECCIONORIGEN]", direccionOrigen)
                .replace("[DIRECCIONDESTINO]", direccionDestino);

        // Escribimos el archivo HTML
        try {
            FileWriter writer = new FileWriter("Factura " + numeroFactura + ".html");
            writer.write(paginaFinal);
            writer.close();
            System.out.println("Archivo HTML generado correctamente");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo HTML: " + e.getMessage());
        }

        try {
            Desktop.getDesktop().browse(Paths.get("Factura " + numeroFactura + ".html").toUri());
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo HTML: " + e.getMessage());
        }

    }
    
    public void generarGuia(String fecha, String guia, String tipoPago, String rOri, String dOri, String mOri, String rDest, String dDest, String mDest, String peso, String cantidad, String total, String direccionOrigen, String direccionDestino) {
        
        String plantilla = "";
        try {
            plantilla = new String(Files.readAllBytes(Paths.get("guia.html")));
        } catch (IOException e) {
            System.out.println("Error al leer la plantilla: " + e.getMessage());
            return;
        }

        // Reemplazamos las secciones dinámicas de la plantilla con el contenido generado
        String paginaFinal = plantilla
                .replace("[FECHA]", fecha)
                .replace("[CODIGODEPAQUETE]", guia)
                .replace("[TIPODEPAGO]", tipoPago)
                .replace("[REGIONORIGEN]", rOri)
                .replace("[DEPARTAMENTOORIGEN]", dOri)
                .replace("[MUNICIPIOORIGEN]", mOri)
                .replace("[REGIONDESTINO]", rDest)
                .replace("[DEPARTAMENTODESTINO]", dDest)
                .replace("[MUNICIPIODESTINO]", mDest)
                .replace("[PESO]", peso)
                .replace("[CANTIDADPAQUETES]", cantidad)
                .replace("[SUBTOTAL]", total)
                .replace("[TOTALF]", total)
                .replace("[TOTALF2]", total)
                .replace("[DIRECCIONORIGEN]", direccionOrigen)
                .replace("[DIRECCIONDESTINO]", direccionDestino)
                .replace("[CODIGOPAQUETE2]", guia);

        // Escribimos el archivo HTML
        try {
            FileWriter writer = new FileWriter("Guia " + guia + ".html");
            writer.write(paginaFinal);
            writer.close();
            System.out.println("Archivo HTML generado correctamente");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo HTML: " + e.getMessage());
        }

        try {
            Desktop.getDesktop().browse(Paths.get("Guia " + guia + ".html").toUri());
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo HTML: " + e.getMessage());
        }

    }
    
    static int numeroCotizacion = 0;
    public void generarCotizacion(String depO, String munO, String dirO, String depD, String munD, String dirD, String cantidadPaquetes, String pesoPaquete, String totalEstandar, String totalEspecial) {
        
        String plantilla = "";
        try {
            plantilla = new String(Files.readAllBytes(Paths.get("cotizacion.html")));
        } catch (IOException e) {
            System.out.println("Error al leer la plantilla: " + e.getMessage());
            return;
        }

        // Reemplazamos las secciones dinámicas de la plantilla con el contenido generado
        String paginaFinal = plantilla
                .replace("[departamento_origen]", depO)
                .replace("[departamento_destino]", depD)
                .replace("[municipio_origen]", munO)
                .replace("[municipio_destino]", munD)
                .replace("[direccion_origen]", dirO)
                .replace("[direccion_destino]", dirD)
                .replace("[cantidad_paquetes]", cantidadPaquetes)
                .replace("[peso_paquete]", pesoPaquete)
                .replace("[total_estandar]", totalEstandar)
                .replace("[total_especial]", totalEspecial);

        // Escribimos el archivo HTML
        try {
            FileWriter writer = new FileWriter("Cotizacion " + numeroCotizacion +".html");
            writer.write(paginaFinal);
            writer.close();
            System.out.println("Archivo HTML generado correctamente");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo HTML: " + e.getMessage());
        }

        try {
            Desktop.getDesktop().browse(Paths.get("Cotizacion " + numeroCotizacion + ".html").toUri());
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo HTML: " + e.getMessage());
        }
        numeroCotizacion++;
    }
}
