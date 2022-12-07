package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Conexión desde Java a una base de datos
 * @author Marta Rodriguez
 *
 */
public class JdbcEjercicio1 {

	public static void main(String[] args) {
		// Pasos para conectarme a la base de datos
		// 1 - Levantar el driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2 - Establecemos conexion con bbdd
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capgemini", "root", "admin");
			// 3 - Creamos la consulta
			Statement sql = con.createStatement();
			// 4 - Ejecuto el insert
			sql.execute("INSERT INTO contacto (nombre, telefono, email)"
					+ "VALUES ('Laura', '644-83-52-43', 'laura@jose.com')");
			
			ResultSet rs = sql.executeQuery("SELECT * FROM contacto;");
			
			// 5 - Muestro los resultados
			while(rs.next()) {
				System.out.println("Nombre = " + rs.getString("nombre"));
				System.out.println("E-mail = " + rs.getString("email"));
				System.out.println("Teléfono = " + rs.getString("telefono"));
				System.out.println("--------------------------------------------------");
			}
			
			//Cerrar cosas - IMPORTATISIMO
			sql.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
