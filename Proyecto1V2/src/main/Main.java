package main;

import Datos.AlmacenamientoDeDatos;  
import vista.Login;

public class Main {

    public static void main(String[] args) {
        AlmacenamientoDeDatos datos = new AlmacenamientoDeDatos();
        datos.llenarDepartamentosRegiones();
         
        Login login = new Login();
        login.setVisible(true);

    }
}
