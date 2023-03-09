package main;

import Datos.AlmacenamientoDeDatos;  
import modelo.Usuario;
import vista.Login;

public class Main {

    public static void main(String[] args) {
        AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();
        datos.llenarDepartamentosRegiones();
         
        datos.usuarios.add(new Usuario(69,"a","","","","","","","","","","","","",0,0));
        Login login = new Login();
        login.setVisible(true);

    }
}
