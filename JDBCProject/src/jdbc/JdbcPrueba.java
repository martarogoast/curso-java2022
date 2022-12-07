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
public class JdbcPrueba {

	public static void main(String[] args) {
		// Pasos para conectarme a la base de datos
		// 1 - Levantar el driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2 - Establecemos conexion con bbdd
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capgemini_arg", "root", "admin");
			// 3 - Creamos la consulta
			Statement sql = con.createStatement();
			// 4 - Ejecuto la consulta
			ResultSet rs = sql.executeQuery("SELECT employee_id, first_name, last_name, salary FROM employees;");
			
			// 5 - Muestro los resultados
			while(rs.next()) {
				System.out.println("id = " + rs.getInt("employee_id"));
				System.out.println("first_name = " + rs.getString("first_name"));
				System.out.println("last_name = " + rs.getString("last_name"));
				System.out.println("salary = " + rs.getInt("salary"));
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
