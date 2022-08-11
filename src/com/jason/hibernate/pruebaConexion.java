package com.jason.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class pruebaConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcUrl="jdbc:mysql://localhost:3306/pruebashibernate?useSSL=false";
		String usuario="root";
		String contrasenia="";
		
		try {

			System.out.println("Intentando conectar a la Base de Datos: " +jdbcUrl);
			Connection conector = DriverManager.getConnection(jdbcUrl, usuario, contrasenia);
			System.out.println("Conexión exitosa");
			
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
